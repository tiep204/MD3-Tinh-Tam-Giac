import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* System.out.println("mời bạn nhập vào 1 số nguyên dương");
        int number = Integer.parseInt(sc.nextLine());
        if (number % 2 == 0) {
            System.out.printf("số của bạn vừa nhập là: %d số chẵn \n", number);
        } else {
            System.out.printf("số của bạn vừa nhập là: %d số lẻ \n", number);
        }
        switch (number) {
            case 1:
                System.out.println("số bạn vừa nhập là số 1");
                break;
            case 2:
                System.out.println("số bạn vừa nhập là số 2");
                break;
            case 3:
                System.out.println("số bạn vừa nhập là số 3");
                break;
            case 4:
                System.out.println("số bạn vừa nhập là số 4");
                break;
            case 5:
                System.out.println("số bạn vừa nhập là số 5");
                break;
            case 6:
                System.out.println("số bạn vừa nhập là số 6");
                break;
            case 7:
                System.out.println("số bạn vừa nhập là số 7");
                break;
            case 8:
                System.out.println("số bạn vừa nhập là số 8");
                break;
            case 9:
                System.out.println("số bạn vừa nhập là số 9");
                break;
            default:
                System.out.println("không hỗ trợ");
        }*/
        //viết 1 chương trình cho phép nhập vào 3 cạnh của 1 tam giác , kiểm tra xem tam giác đó là loại tam giác nào:
        //vuông,cân,đều,không hợp lệ
        //nếu là tam giác thì tính chu vi diện tích của tam giác đó, diện tích

        System.out.println("Mời bạn nhập cạnh a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập cạnh b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập cạnh c: ");
        double c = Double.parseDouble(sc.nextLine());
        System.out.printf("Các cạnh bạn vừa nhập là: a = %f, b = %f, c = %f \n", a, b, c);
        if (a + b > c && a + c > b && b + c > a) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Đây là một tam giác vuông.");
            } else if (a == b && b == c && c == a) {
                System.out.println("Đây là một tam giác đều.");
            } else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b) {
                System.out.println("tam giác này là tam giác tù");
            } else if (a == b || a == c || b == c) {
                System.out.println("Đây là một tam giác cân.");
            } else {
                System.out.println("Đây là một tam giác nhọn.");
            }
            double chuVi = a + b + c;
            System.out.println("Chu vi của tam giác là: " + chuVi);
            double p = chuVi / 2;
            double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Diện tích của tam giác là: " + dienTich);
        } else {
            System.out.println("Số bạn vừa nhập không phải là một tam giác.");
        }
    }
}