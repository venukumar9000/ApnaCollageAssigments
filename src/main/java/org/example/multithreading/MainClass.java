package org.example.multithreading;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
     Thread threadA= new Thread(new MyTask("A"));
     Thread threadB = new Thread(new MyTask("B"));

     threadA.start();
     threadB.start();

        Thread thread = new Thread(()->{
            for(int i=1;i<5;i++){
                System.out.println("C "+i);
                try {
                    Thread.sleep(5);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        });
        Thread thread2= new Thread(()->{
            for(int i=1;i<5;i++){
                System.out.println("D "+i);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        thread.start();
        thread2.start();
    }



}

class MyTask implements Runnable{

   String value;
   MyTask(String value){
       this.value=value;
   }
    @Override
    public void run() {
       for(int i=0;i<5;i++){
           System.out.println(value+" "+i);
           try{
               Thread.sleep(1000);
           }catch (InterruptedException e){
               e.printStackTrace();
           }
       }
    }
}

