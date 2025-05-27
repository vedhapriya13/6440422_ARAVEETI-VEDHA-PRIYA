class MyTask implements Runnable {
    private String message;

    public MyTask(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyTask("Thread 1 is running"));
        Thread thread2 = new Thread(new MyTask("Thread 2 is running"));

        thread1.start();
        thread2.start();
    }
}