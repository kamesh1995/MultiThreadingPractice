package definingthread;

public class MyThreadDemoTwo {
    public static void main(String[] args) {
        MyThreadWithOverloadedRun t = new MyThreadWithOverloadedRun();
        t.start();
        System.out.println("main thread");
    }
}
