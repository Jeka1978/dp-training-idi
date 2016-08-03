package proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Evegeny on 28/07/2016.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public final class Company  {
    private String name;
    private List<Employee> employees;

    @Benchmark
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }


}
