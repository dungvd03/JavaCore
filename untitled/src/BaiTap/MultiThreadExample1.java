package BaiTap;

class MyRunnable implements Runnable {
    private String threadName;

    public MyRunnable(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Đang chạy: Lần " + i);
            try {
                Thread.sleep(500); // Dừng luồng trong 500ms
            } catch (InterruptedException e) {
                System.out.println(threadName + " bị gián đoạn.");
            }
        }
        System.out.println(threadName + " hoàn thành.");
    }
}

public class MultiThreadExample1 {
    public static void main(String[] args) {
        // Tạo đối tượng Runnable
        MyRunnable runnable1 = new MyRunnable("Luồng 1");
        MyRunnable runnable2 = new MyRunnable("Luồng 2");

        // Tạo các luồng từ đối tượng Runnable
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        // Bắt đầu chạy các luồng
        thread1.start();
        thread2.start();

        // Đảm bảo các luồng hoàn thành trước khi tiếp tục
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Quá trình chính bị gián đoạn.");
        }

        System.out.println("Chương trình chính hoàn thành.");
    }
}

