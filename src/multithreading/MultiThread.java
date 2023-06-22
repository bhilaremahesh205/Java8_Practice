package multithreading;

public class MultiThread extends Thread{
/*
    public void run(){
           System.out.println("inside");
           try {
               Thread.sleep(5);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        MultiThread m = new MultiThread();
        m.start();
    }*/

    public void run() {
        for(int i=0;i<2;i++) {
            System.out.println("Music Playing ...... ");
        }
    }

    public static void main(String Args[])
    {
        MultiThread p=new MultiThread();
        p.start();

        for(int i=0;i<5;i++) {
            System.out.println("coding");
        }
    }
}
