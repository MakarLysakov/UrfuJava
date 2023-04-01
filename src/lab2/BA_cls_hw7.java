package lab2;

public class BA_cls_hw7 implements BA_hw7 {

    private int balance;

    private BA_cls_hw7() {
    }

    public void setBalance(int balance) {
        this.balance = 0;
    }

    @Override
    public void GetBalance() {
        System.out.println("Your balance is " + balance);
    }


    public static BA_cls_hw7 CreateBA() {
        return new BA_cls_hw7();

    }

    @Override
    public void Transaction() {

    }
}
