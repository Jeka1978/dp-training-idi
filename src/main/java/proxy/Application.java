package proxy;

import lombok.SneakyThrows;
import org.reflections.Reflections;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Set;

/**
 * Created by Evegeny on 28/07/2016.
 */
public class Application {
    private static Reflections reflections = new Reflections("proxy");

    @SneakyThrows
    public static <T> T getInstance(Class<T> type) {
        type = resolveImpl(type);

        T t = type.newInstance();
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Benchmark.class)) {
                if (type.getInterfaces().length == 0) {
                    return (T) Enhancer.create(type, new org.springframework.cglib.proxy.InvocationHandler() {
                        @Override
                        public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                            return Application.invoke(method, args, t);
                        }
                    });
                }
                return (T) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), type.getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return Application.invoke(method, args, t);
                    }
                });
            }
        }

        return t;
    }

    private static <T> Object invoke(Method method, Object[] args, T t) throws IllegalAccessException, InvocationTargetException {
        System.out.println("********BENCHMARK**********");
        long start = System.nanoTime();
        Object retVal = method.invoke(t, args);
        long end = System.nanoTime();
        System.out.println(method.getName()+" worked for "+(end-start));
        System.out.println("********BENCHMARK**********");
        return retVal;
    }

    private static <T> Class<T> resolveImpl(Class<T> type) {
        if (type.isInterface()) {
            Set<Class<? extends T>> classes = reflections.getSubTypesOf(type);
            if (classes.size() != 1) {
                throw new RuntimeException("0 or more than one impl found for the ifc");
            }
            type = (Class<T>) classes.iterator().next();
        }
        return type;
    }
}
