public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());

        MyThread myRunnnable1 = new MyThread("Thread no 1");
        Thread newThread1 = new Thread(myRunnnable1, "Thread_1");
        newThread1.start();
        System.out.println(newThread1.getName());

        MyThread myRunnable2 = new MyThread("Thread no 2");
        Thread newThread2 = new Thread(myRunnable2, "Thread_2");
        System.out.println(newThread2.getName());
        newThread2.start();

        Thread.sleep(10000);

        myRunnnable1.turnOffSafely();

    }

}