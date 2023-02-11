public class MyThread implements Runnable {
    String name;
    private boolean stop = false;

    public MyThread (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public synchronized void turnOffSafely () {
        System.out.println("Turning off " + this.name);
        this.stop = true;
    }

    private synchronized boolean keepRunning () {
        return !this.stop;
    }

    @Override
    public void run () {
        while (keepRunning()) {
            System.out.println(this.name + " is running");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }

}
