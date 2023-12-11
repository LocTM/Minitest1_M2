import java.util.Scanner;

public class Minitest1_M2 {
    public static void main(String[] args) {
        login();
    }

    static void login() {
        Scanner scanner = new Scanner(System.in);
        int a = 0;

        while (a < 3) {
            System.out.print("User: ");
            String userInput = scanner.nextLine();
            System.out.print("Password: ");
            String passwordInput = scanner.nextLine();

            if (userInput.equals("admin") && passwordInput.equals("123456")) {
                System.out.println("Đăng nhập thành công!\n");
                menu();
                break;
            } else {
                System.out.println("Tên người dùng hoặc mật khẩu không đúng. Vui lòng thử lại.\n");
                a++;
            }
        }

        if (a == 3) {
            System.out.println("Bạn đã nhập sai quá 3 lần. Chương trình sẽ tự đóng.");
            System.exit(0);
        }
    }

    static void drawRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        int width = scanner.nextInt();
        System.out.print("Nhập chiều cao: ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void drawRightTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh a: ");
        int side1 = scanner.nextInt();
        System.out.print("Nhập độ dài cạnh b: ");
        int side2 = scanner.nextInt();

        for (int i = 1; i <= side2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void drawIsoscelesTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao: ");
        int height = scanner.nextInt();
        System.out.print("Nhập độ dài cạnh đáy của tam giác cân: ");
        int base = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void menu() {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Vẽ hình chữ nhật");
            System.out.println("2. Vẽ tam giác vuông");
            System.out.println("3. Vẽ tam giác cân");
            System.out.println("4. Thoát chương trình");
            System.out.print("Chọn một trong các tùy chọn trên (1/2/3/4): ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    drawRectangle();
                    break;
                case "2":
                    drawRightTriangle();
                    break;
                case "3":
                    drawIsoscelesTriangle();
                    break;
                case "4":
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Chỉ chọn 1 2 3 4");
            }
        } while (!choice.equals("4"));
    }
}

