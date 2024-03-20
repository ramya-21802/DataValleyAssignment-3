class Counter {
    private int cnt = 0;

    public synchronized void increment() {
        cnt++;
    }

    public synchronized int getCount() {
        return cnt;
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        Thread thread_1 = new Thread(task);
        Thread thread_2 = new Thread(task);

        thread_1.start();
        thread_2.start();

        try {
            thread_1.join();
            thread_2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count is : " + counter.getCount());
    }
}
