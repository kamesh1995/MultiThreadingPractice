package definingThreadWithExtendingThreadClass;

public class MyThreadWithOverloadedRun extends Thread{
    @Override
    public void run() {
        System.out.println("no args");
    }

    public void run(int a ) {
        System.out.println("args args");
    }
}
