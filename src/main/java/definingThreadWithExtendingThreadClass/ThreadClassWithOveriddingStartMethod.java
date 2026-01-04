package definingThreadWithExtendingThreadClass;

public class ThreadClassWithOveriddingStartMethod extends Thread{

    @Override
    public void start(){
        super.start();
        System.out.println("start method");
    }

    @Override
    public void run() {
        System.out.println("run method");
    }
}
