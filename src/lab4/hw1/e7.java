package lab4.hw1;

public class e7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            try {
                System.out.println("1");
                throw new ArithmeticException();
            } catch (ArithmeticException f) {
                System.out.println("2");
            }
            System.out.println("3");
        }

    }
}
