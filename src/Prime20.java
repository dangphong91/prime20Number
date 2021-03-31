import java.util.Scanner;

public class Prime20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố cần in:");
        int number = scanner.nextInt();
        boolean check = true;
        int N = 2;
        for (int count = 0; count < number;) {
            for (int i = 2; i<= N/2; i++) {
                if (N%i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(N);
                count++;
            }
            check = true;
            N++;
        }
    }
}
