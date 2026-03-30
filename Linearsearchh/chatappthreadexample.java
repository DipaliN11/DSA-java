
class MessageReceiver implements Runnable {
    public void run() {
        String[] incomingMessages = {
            "Hello!", "How are you?", "Are you coming today?", "Let's catch up soon!"
        };

        for (String msg : incomingMessages) {
            try {
                Thread.sleep(2000);  // Simulate delay in receiving
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("📥 Received: " + msg);
        }
    }
}

class MessageSender implements Runnable {
    public void run() {
        String[] outgoingMessages = {
            "Hey!", "I'm good, thanks!", "Yes, I'll be there.", "Sure, looking forward to it!"
        };

        for (String msg : outgoingMessages) {
            try {
                Thread.sleep(3000);  // Simulate delay in sending
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("📤 Sent: " + msg);
        }
    }
}

public class chatappthreadexample {
    public static void main(String[] args) {
        Runnable receiver = new MessageReceiver();
        Runnable sender = new MessageSender();

        Thread receiveThread = new Thread(receiver);
        Thread sendThread = new Thread(sender);

        receiveThread.start();
        sendThread.start();
    }
}