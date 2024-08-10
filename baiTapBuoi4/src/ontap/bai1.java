package ontap;

import java.util.*;

public class bai1 {
    public static void main(String[] args) {
        int choose;
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> chuHoList = new ArrayList<>();
        chuHoList.add("Vũ Đức Dũng");
        chuHoList.add("Nguyễn Văn Cường");
        chuHoList.add("Lê Văn Truong");
        chuHoList.add("Phạm Thị Duyên");
        chuHoList.add("Hoàng Văn Khá");
        chuHoList.add("Đỗ Thị Quyên");
        chuHoList.add("Võ Văn Dũng");
        chuHoList.add("Phan Thị Hương");
        chuHoList.add("Bùi Văn Vỹ");
        chuHoList.add("Lý Thị Cường");

        ArrayList<Integer> kWhList = new ArrayList<>();
        kWhList.add(45);
        kWhList.add(75);
        kWhList.add(120);
        kWhList.add(200);
        kWhList.add(250);
        kWhList.add(320);
        kWhList.add(400);
        kWhList.add(450);
        kWhList.add(500);
        kWhList.add(600);

        ArrayList<Double> tienPhaiTraList = new ArrayList<>();



        do {
            System.out.println("===========================================================");
            System.out.println("============================Menu===========================");
            System.out.println("1. Tính và hiển thị danh sách các hộ gia đình cùng với số kwh điện tiêu thụ và số tiền phải trả, mỗi hộ gia đình trên 1 dòng");
            System.out.println("2. Hiển thị 3 hộ gia đình có số kwh điện tiêu thụ nhiều nhất.");
            System.out.println("3. Hiển thị các hộ gia đình có chủ hộ tên \"Truong\".");
            System.out.println("4. Sắp danh sách các hộ gia đình theo tên với thứ tự bảng chữ cái.");
            System.out.println("5. Sắp xếp danh sách các hộ gia đình theo số kwh điện tăng dần.");
            System.out.println("6. Thoát.");
            System.out.print("Chọn: ");

            try {
                choose = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Nhập không phải số!");
                return;
            }

            switch (choose) {
                case 1:
                    for (int kWh : kWhList) {
                        tienPhaiTraList.add(tinhTienDien(kWh));
                    }
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println(String.format("%-5s | %-30s | %10s | %15s ", "STT", "Chu ho", "So dien", "Tien(VND)"));
                    for (int i = 0; i < chuHoList.size(); i++) {
                        System.out.println("----------------------------------------------------------------------");
                        System.out.println(String.format("%-5s | %-30s | %10d | %15s ", i+1, chuHoList.get(i), kWhList.get(i), tienPhaiTraList.get(i)));
                    }
                    System.out.println("----------------------------------------------------------------------");
                    break;
                case 2:
                    showTop3(chuHoList, kWhList, tienPhaiTraList);
                    break;
                case 3:
                    showFillName(chuHoList, kWhList, tienPhaiTraList);
                    break;
                case 4:
                    sortByName();
                    break;
                case 5:
                    sortByKw();
                    break;
                case 0:
                    System.out.println("Thoát.....");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }

        } while (choose != 0);
    }

    private static double tinhTienDien(int kWh) {
        double tien = 0;
        if (kWh <= 50) {
            tien = kWh * 1678;
        } else if (kWh <= 100) {
            tien = 50 * 1678 + (kWh - 50) * 1734;
        } else if (kWh <= 200) {
            tien = 50 * 1678 + 50 * 1734 + (kWh - 100) * 2014;
        } else if (kWh <= 300) {
            tien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (kWh - 200) * 2536;
        } else if (kWh <= 400) {
            tien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + (kWh - 300) * 2834;
        } else {
            tien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (kWh - 400) * 2927;
        }
        return tien;
    }



    private static void showTop3(ArrayList<String> chuHoList, ArrayList<Integer> kWhList, ArrayList<Double> tienPhaiTraList) {
        ArrayList<Integer> sapXepChiSo = new ArrayList<>();
        for (int i = 0; i < kWhList.size(); i++) {
            sapXepChiSo.add(i);
        }

        Collections.sort(sapXepChiSo, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return kWhList.get(i2) - kWhList.get(i1);
            }
        });
        System.out.println("3 hộ gia đình có số kWh tiêu thụ nhiều nhất:");
        for (int i = 0; i < 3; i++) {
            int index = sapXepChiSo.get(i);
            System.out.println("Chủ hộ: " + chuHoList.get(index) + ", Số kWh tiêu thụ: " + kWhList.get(index) + ", Số tiền phải trả: " + tienPhaiTraList.get(index) + " VND");
        }

    }

    private static void showFillName(ArrayList<String> chuHoList, ArrayList<Integer> kWhList, ArrayList<Double> tienPhaiTraList) {
        for (int i = 0; i < chuHoList.size(); i++) {
            if(chuHoList.get(i).contains("Truong")){
                System.out.println("Chu ho :" + chuHoList.get(i) + ", Số kWh tiêu thụ: " + kWhList.get(i) + ", Số tiền phải trả: " + tienPhaiTraList.get(i) + " VND");
            }
        }

    }

    private static void sortByName() {
        System.out.println("sortByName");

    }

    private static void sortByKw() {
        System.out.println("sortByKw");

    }
}
