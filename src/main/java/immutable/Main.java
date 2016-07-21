package immutable;

/**
 * Created by Evegeny on 21/07/2016.
 */
public class Main {
    public static void main(String[] args) {
        IDIClient.Builder builder = new IDIClient.Builder();
        IDIClient andrey = builder.name("andrey").bonus(1000).debt(20).build();
        andrey = andrey.addBonus(250);
        System.out.println("andrey = " + andrey);
        IDIClient yuri = builder.debt(12000).bonus(10).build();
        System.out.println(yuri);
    }
}
