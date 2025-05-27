public class Exercise26 {
    public static void main(String[] args) {
        MessagePrinter t1 = new MessagePrinter("Hello from Thread 1");
        MessagePrinter t2 = new MessagePrinter("Hello from Thread 2");
        t1.start();
        t2.start();
    }
}
class MessagePrinter extends Thread {
    private String message;

    public MessagePrinter(String message) {
        this.message = message;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
