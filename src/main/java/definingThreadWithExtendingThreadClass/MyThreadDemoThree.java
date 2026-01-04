package definingThreadWithExtendingThreadClass;

public class MyThreadDemoThree {
    public static void main(String[] args) {
        MyThreadWithNoRunMethod t = new MyThreadWithNoRunMethod();
        t.start();
        System.out.println("main thread");
    }
}
