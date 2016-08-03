package proxy;

/**
 * Created by Evegeny on 28/07/2016.
 */
public class Main {
    public static void main(String[] args) {
        Company company = Application.getInstance(Company.class);
        System.out.println(company.getClass());
        company.getEmployees()
    }
}
