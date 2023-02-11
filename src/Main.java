public class Main {
    public static void main(String[] args) throws InterruptedException {
//
//        System.out.println(Thread.currentThread().getName());
//
//        MyThread myRunnable1 = new MyThread("Thread no 1");
//        Thread newThread1 = new Thread(myRunnable1, "Thread_1");
//        newThread1.start();
//        System.out.println(newThread1.getName());
//
//        MyThread myRunnable2 = new MyThread("Thread no 2");
//        Thread newThread2 = new Thread(myRunnable2, "Thread_2");
//        System.out.println(newThread2.getName());
//        newThread2.start();
//
//        Thread.sleep(10000);
//        myRunnable1.turnOffSafely();
//
//        Thread.sleep(3000);
//        myRunnable2.turnOffSafely();

        Worker john = new Worker("John");
        Worker max = new Worker("Max");
        Worker sophie = new Worker("Sophie");
        Worker tom = new Worker("Tom");
        Worker alex = new Worker("Alex");
        alex.promote();

        alex.startWork();

    }
}