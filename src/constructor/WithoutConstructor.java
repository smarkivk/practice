package constructor;

public class WithoutConstructor {
    private String message;

    public void setMessage(String msg) {
        message = msg;
    }

    public void showMessage() {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        WithoutConstructor obj = new WithoutConstructor();
        obj.setMessage("Hello, World!");
        obj.showMessage();
    }
}

