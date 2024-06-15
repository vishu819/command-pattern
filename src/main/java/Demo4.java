import java.util.Arrays;

public class Demo4 {

    public static void main(String[] args) {
        SanctionScreenAddressTypesEnum[] values = SanctionScreenAddressTypesEnum.values();

        long lStartTime = System.nanoTime();
        Arrays.stream(values).forEach(x -> {
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
        System.out.println("Elapsed time in milliseconds Sequence: " + output / 1000000);

    }
}



