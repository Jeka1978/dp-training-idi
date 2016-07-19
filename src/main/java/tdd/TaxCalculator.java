package tdd;

/**
 * Created by Evegeny on 19/07/2016.
 */
public class TaxCalculator {
    private MaamService maamService = new MaamServiceImpl();

    public void setMaamService(MaamService maamService) {
        this.maamService = maamService;
    }

    public double withMaam(double price) {
        return price + price * maamService.getMaam();
    }

    public static void main(String[] args) {
        String str = "java";
        str = str.toUpperCase();
    }
}






