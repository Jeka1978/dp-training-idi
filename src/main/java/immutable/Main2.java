package immutable;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class Main2 {
    public static void main(String[] args) {
        Person koki = Person.builder().age(12).salary(100).build();
        System.out.println(koki);
    }
}
