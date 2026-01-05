package threadpriority;

class MyThreadThree extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++)
          System.out.println("child thread");
    }
}
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        MyThreadThree t = new MyThreadThree();
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        for (int i = 0; i < 10; i++)
            System.out.println("main three");
    }
}
