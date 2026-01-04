package definingThreadWithExtendingThreadClass;

public class ThreadDemoFour {
    public static void main(String[] args) {
        ThreadClassWithOveriddingStartMethod t =
                new ThreadClassWithOveriddingStartMethod();
        t.start();
        System.out.println("main thread");
    }
}
