package concurrency.pargma.day1;

public class App {
    private static int sum = 0;
    public static void main(String[] args) throws InterruptedException {

        new Thread(()->{
            for(int  i = 1; i <= 100000; ++i) {
                sum += 1;
            }
        }).start();

        new Thread(()->{
            for(int  i = 1; i <= 100000; ++i) {
                sum += 1;
            }
        }).start();
        Thread.sleep(1000);
        System.out.println(sum);
    }


}
