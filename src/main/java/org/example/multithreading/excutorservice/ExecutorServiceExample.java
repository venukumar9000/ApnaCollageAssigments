package org.example.multithreading.excutorservice;

import java.util.concurrent.*;

public class ExecutorServiceExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
     executorServiceRunnable();
     executorServiceCallable();
     completableFuture();

    }
    public static void executorServiceRunnable() throws ExecutionException, InterruptedException {
        ExecutorService executor =  Executors.newFixedThreadPool(3);

        Runnable task1 =()->{
//            try {
//                Thread.sleep(1000);
                System.out.println("runniing task1 "+Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        };
        Runnable task2 =()->{
//            try {
//                Thread.sleep(1000);
                System.out.println("running task2 "+Thread.currentThread().getName());
//            }
//            catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

        };
        Runnable task3 =()->{
            System.out.println("running task3 "+Thread.currentThread().getName());
        };
        Runnable task4 =()->{
            System.out.println("running task4 "+Thread.currentThread().getName());
        };
        Runnable task5 =()->{
            System.out.println("running task5 "+Thread.currentThread().getName());
        };

        executor.execute(task1);
        executor.execute(task2);
        executor.execute(task3);
        executor.execute(task4);
        executor.execute(task5);

        for(int i=6;i<11;i++){
            int taskno=i;

            executor.execute(()->{
                System.out.println("running thread "+taskno+" by "+Thread.currentThread().getName());
            });
        }

        executor.shutdown();

    }
    public static void executorServiceCallable() throws ExecutionException, InterruptedException {
        ExecutorService executor =  Executors.newFixedThreadPool(3);
        Callable<Integer > callable =()->{
            System.out.println("running thread callable "+Thread.currentThread().getName());
            return 5+5;
        };

        Future<Integer> future = executor.submit(callable);
        System.out.println(future.get());

    }
    public static void completableFuture() throws InterruptedException {
        ExecutorService  service= Executors.newFixedThreadPool(3);
       CompletableFuture<Integer> cf = CompletableFuture.supplyAsync(()->{
           sleep(1000);
           System.out.println("running thread cf "+Thread.currentThread().getName());
           return 10 ;
       });
       CompletableFuture<Integer>cf1 = CompletableFuture.supplyAsync(()->{
           sleep(1000);
           System.out.println("running thread cf1 "+Thread.currentThread().getName());
           return 20;
       });
       CompletableFuture<Integer> cf2 = CompletableFuture.supplyAsync(()->{
           sleep(1000);
           System.out.println("running thread cf2 "+ Thread.currentThread().getName());
           return 30;
       });
       CompletableFuture<Integer> res = cf.thenCombine(cf1,Integer::sum)
               .thenCombine(cf2,Integer::sum);

        System.out.println(res.join());
   service.shutdown();

    }

    public static void sleep(int ms){
            try {
                Thread.sleep(ms);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }


    }



}
