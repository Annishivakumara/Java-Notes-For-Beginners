/*
class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Thread1 is Running: "+i);
        }
    }
}


class Thread2 extends Thread{
     public void run(){
         for(int i=1;i<=5;i++){
             System.out.println("Thread2 is Running"+i);
         }
     }
 }
 
public class Main{
    public static void main(String [] args){
    Thread1 t1= new Thread1();
     Thread2 t2=new Thread2();
    t1.start();
   t2.start();
    }
}
*/
/*
class ThreadExample extends Thread{
       ThreadExample(String name){
           super(name);
       }

public void run(){
    System.out.println(Thread.currentThread().getName());
}
}
class Thread2 extends Thread{
    String name;
    public Thread2 (String name){
        super(name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class  Main{
    public static void main(String [] args){
        ThreadExample t1=new ThreadExample("first Thread");
        t1.start();
        Thread2 t2= new Thread2("Second Thread");
        t2.start();
     
    }
}
*/
/*
class SingleThread extends Thread{
    
    
    public void run(){
        System.out.println("Hey Hi By Using Extends ");
    }
}
public class Main{
    public static void main(String [] args){
        SingleThread obj= new SingleThread();
        
        obj.start();
    }
}
*/
/*
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    private Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
*/

class MyThread  extends Thread{
    MyThread(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(getName()+" is Running "+getPriority());
        }
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class Main{
    public static void main(String [] args){
        MyThread my1= new MyThread("hey");
        my1.setName("first Thread");
        my1.setPriority(Thread.MAX_PRIORITY);
         my1.start();
         
        MyThread my2= new MyThread("Helo");
        my2.setName("Second Thread");
        my2.setPriority(Thread.MIN_PRIORITY);
        my2.start();
        
        MyThread my3= new MyThread("SHIVU");
        my3.setName("Third Thread");
        my3.setPriority(Thread.NORM_PRIORITY);
        my3.start();
        
    }
}

/*
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + " is running: " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.setName("Thread 1");
        thread1.setPriority(Thread.MAX_PRIORITY); // Highest priority

        MyThread thread2 = new MyThread();
        thread2.setName("Thread 2");
        thread2.setPriority(Thread.NORM_PRIORITY); // Normal priority

        MyThread thread3 = new MyThread();
        thread3.setName("Thread 3");
        thread3.setPriority(Thread.MIN_PRIORITY); // Lowest priority

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
*/
