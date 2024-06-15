import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Demo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> s = CompletableFuture.completedFuture(null);
        s = CompletableFuture.supplyAsync(() -> {
            return "Vishal";
        });

        s.thenAccept(System.out::println).join();

        int[] numbers = IntStream.rangeClosed(0, 500).toArray();
        int totalSum = IntStream.rangeClosed(0, 500).sum();


        Callable<Integer> c1 = () -> {

            Integer sum = 0;

            for (int i = 0; i < numbers.length / 2; i++) {
                sum += numbers[i];
            }
            return sum;

        };


        Callable<Integer> c2 = () -> {

            Integer sum = 0;

            for (int i = numbers.length / 2; i < numbers.length; i++) {
                sum += numbers[i];
            }
            return sum;

        };

        List<Callable<Integer>> callables = new ArrayList<>();
        callables.add(c1);
        callables.add(c2);


        ExecutorService es = Executors.newFixedThreadPool(2);

        List<Future<Integer>> futures = es.invokeAll(callables);
        Integer totalThreaddsSum = 0;

//        totalThreaddsSum = futures.stream().


//        String ab = aa.join();

//        Map<String, Integer> map = new HashMap<>();
//        map.put("a", 10);
//        map.put("b", 11);
//        map.put("c", 20);
//
//        map = map.entrySet().stream().filter(x -> x.getValue() % 11 == 0).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//
//        map.forEach((k, v) -> System.out.println(k + " " + v));

//        System.out.println(aa);


    }
}

