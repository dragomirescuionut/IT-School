package session16_funcitonal_infterface_lambda.practice.thread_practice;

public class ThreadPractice {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Running in a separate thread.");
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}