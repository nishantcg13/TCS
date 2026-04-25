public class Threads extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "In run");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            System.out.println("In main before sleep");
        }

        Threads t = new Threads();
        t.start();
        Thread.sleep(1);

        for (int i = 0; i < 10; i++) {
            System.out.println("In main after sleep");
        }

    }
}
