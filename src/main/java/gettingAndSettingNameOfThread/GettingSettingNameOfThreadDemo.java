package gettingAndSettingNameOfThread;

class MyThreadTwo extends Thread{

}
public class GettingSettingNameOfThreadDemo {
    public static void main(String[] args) {
        MyThreadTwo t = new MyThreadTwo();
        System.out.println(t.getName());
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Customised Name for main Thread");
        System.out.println("main Thread name is set to: "+Thread.currentThread().getName());
        System.out.println(10/0);
    }
}
