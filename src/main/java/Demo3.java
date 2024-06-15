import java.util.Arrays;

public class Demo3 {

    public static void main(String[] args) {
        SanctionScreenAddressTypesEnum[] values = SanctionScreenAddressTypesEnum.values();

        long lStartTime = System.nanoTime();
        Arrays.stream(values).parallel().forEach(x -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(x.name());
        });
        long lEndTime = System.nanoTime();
        //time elapsed
        long output = lEndTime - lStartTime;
        System.out.println("Elapsed time in milliseconds Parallel: " + output / 1000000);
    }
}



