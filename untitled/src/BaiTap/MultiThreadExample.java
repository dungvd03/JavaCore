package BaiTap;
class MyThread extends Thread {
    private String threadName;

    public MyThread(String name) {
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

public class MultiThreadExample {
    public static void main(String[] args) {
        // Tạo hai đối tượng luồng
        MyThread thread1 = new MyThread("Luồng 1");
        MyThread thread2 = new MyThread("Luồng 2");

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
