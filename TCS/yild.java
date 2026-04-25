public class yild extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        yild t1 = new yild();
        yild t2 = new yild();

        t1.start();
        t2.start();
    }
}
