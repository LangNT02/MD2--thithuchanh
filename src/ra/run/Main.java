package ra.run;

import ra.entity.Laptop;
import ra.entity.LaptopType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Laptop> laptops = new ArrayList<>();
    private static List<LaptopType> laptopTypes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("******************LAPTOP-MANAGEMENT******************");
            System.out.println("1. Quản lý loại laptop");
            System.out.println("2. Quản lý laptop");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    laptopTypeMenu();
                    break;
                case 2:
                    laptopMenu();
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    }
    private static void laptopTypeMenu() {
        while (true) {
            System.out.println("*******************LAPTOP_TYPE-MENU********************");
            System.out.println("1. Hiển thị danh sách các loại laptop");
            System.out.println("2. Thêm mới loại laptop");
            System.out.println("3. Cập nhật thông tin loại laptop");
            System.out.println("4. Xóa loại Laptop");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    displayLaptopTypes();
                    break;
                case 2:
                    addLaptopType();
                    break;
                case 3:
                    updateLaptopType();
                    break;
                case 4:
                    deleteLaptopType();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    }
    private static void laptopMenu() {
        while (true) {
            System.out.println("********************LAPTOP-MENU*********************");
            System.out.println("1. Danh sách Laptop");
            System.out.println("2. Thêm mới Laptop");
            System.out.println("3. Cập nhật thông tin Laptop");
            System.out.println("4. Xóa Laptop");
            System.out.println("5. Thống kê số lượng laptop theo từng loại");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    displayLaptops();
                    break;
                case 2:
                    addLaptop();
                    break;
                case 3:
                    updateLaptop();
                    break;
                case 4:
                    deleteLaptop();
                    break;
                case 5:
                    statisticsLaptopByType();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    }
    private static void displayLaptopTypes() {
        laptopTypes.stream()
                .filter(laptopType -> !laptopType.isDeleted())
                .forEach(System.out::println);
    }

    private static void addLaptopType() {
        System.out.println("Nhập tên loại laptop: ");
        String typeName = scanner.nextLine();
        System.out.println("Nhập mô tả: ");
        String description = scanner.nextLine();

//    Validate
        if (typeName.isEmpty()||description.isEmpty()) {
            System.out.println("Tên và mô tả không được để trống.");
            return;
        }
        for (LaptopType type : laptopTypes) {
            if (type.getTypeName().equalsIgnoreCase(typeName)) {
                System.out.println("Tên loại laptop đã tồn tại.");
                return;
            }
        }

        LaptopType newType = new LaptopType();
        newType.setTypeName(typeName);
        newType.setDescription(description);
        laptopTypes.add(newType);

        System.out.println("Thêm mới loại laptop thành công.");
    }

    private static void updateLaptopType() {
        System.out.println("Nhập mã loại laptop cần cập nhật: ");
        int typeId = Integer.parseInt(scanner.nextLine());

        LaptopType typeToUpdate = laptopTypes.stream()
                .filter(type -> type.getTypeId() == typeId && !type.isDeleted())
                .findFirst()
                .orElse(null);

        if (typeToUpdate == null) {
            System.out.println("Không tìm thấy loại laptop.");
            return;
        }

        System.out.println("Nhập tên mới (để trống nếu không thay đổi): ");
        String newName = scanner.nextLine();
        System.out.println("Nhập mô tả mới (để trống nếu không thay đổi): ");
        String newDescription = scanner.nextLine();

        if (!newName.isEmpty()) {
            typeToUpdate.setTypeName(newName);
        }
        if (!newDescription.isEmpty()) {
            typeToUpdate.setDescription(newDescription);
        }
        System.out.println("Cập nhật thông tin loại laptop thành công.");

    }

    private static void deleteLaptopType() {
        System.out.println("Nhập mã laptop cần xóa: ");
        int typeId = Integer.parseInt(scanner.nextLine());

        LaptopType typeToDelete = laptopTypes.stream()
                .filter(type -> type.getTypeId() == typeId && !type.isDeleted())
                .findFirst()
                .orElse(null);

        if (typeToDelete == null) {
            System.out.println("Không tìm thấy loại laptop.");
            return;
        }

        typeToDelete.setDeleted(true);
        System.out.println("Xóa loại laptop thành công.");

    }

    private static void displayLaptops() {

    }

    private static void addLaptop() {

    }

    private static void updateLaptop() {

    }

    private static void deleteLaptop() {

    }

    private static void statisticsLaptopByType() {

    }
}
