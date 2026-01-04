package gettingAndSettingNameOfThread;

public class MyThread extends Thread{
    public void run(){
        System.out.println("run method is executed by: "+
                Thread.currentThread().getName());
    }
}
