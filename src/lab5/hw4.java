package lab5;

public class hw4 {
    public static void main(String[] args) {
        Thread Thread1 = new Thread(() ->
                System.out.println(Thread.currentThread().getName())
        );
        Thread Thread2 = new Thread(() ->
                System.out.println(Thread.currentThread().getName())
        );
        Thread Thread3 = new Thread(() ->
                System.out.println(Thread.currentThread().getName())
        );
        Thread Thread4 = new Thread(() ->
                System.out.println(Thread.currentThread().getName())
        );
        Thread Thread5 = new Thread(() ->
                System.out.println(Thread.currentThread().getName())
        );
        Thread Thread6 = new Thread(() ->
                System.out.println(Thread.currentThread().getName())
        );
        Thread Thread7 = new Thread(() ->
                System.out.println(Thread.currentThread().getName())
        );
        Thread Thread8 = new Thread(() ->
                System.out.println(Thread.currentThread().getName())
        );
        Thread Thread9 = new Thread(() ->
                System.out.println(Thread.currentThread().getName())
        );
        Thread Thread10 = new Thread(() ->
                System.out.println(Thread.currentThread().getName())
        );
        Thread1.start();
        Thread2.start();
        Thread3.start();
        Thread4.start();
        Thread5.start();
        Thread6.start();
        Thread7.start();
        Thread8.start();
        Thread9.start();
        Thread10.start();
    }
}
