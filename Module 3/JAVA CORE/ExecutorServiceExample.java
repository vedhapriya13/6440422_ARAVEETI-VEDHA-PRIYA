import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        Callable<String> task = () -> {
            Thread.sleep(1000);
            return "Task completed!";
        };

        Future<String> future = executor.submit(task);

        try {
            System.out.println("Result: " + future.get());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        executor.shutdown();
    }
}