public class SharedCounterExample {

    private int counter = 0;

    public synchronized void increment() {  // Synchronized method
        counter++;
    }

    public synchronized int getCounter() { // Synchronized method
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        SharedCounterExample sharedCounter = new SharedCounterExample();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                sharedCounter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                sharedCounter.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join(); // Wait for thread1 to finish
        thread2.join(); // Wait for thread2 to finish

        System.out.println("Expected: 20000");
        System.out.println("Actual: " + sharedCounter.getCounter());
    }
}
