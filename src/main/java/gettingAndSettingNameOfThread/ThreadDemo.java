package gettingAndSettingNameOfThread;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        System.out.println("main method is executed by: "+
                Thread.currentThread().getName());
    }
}
