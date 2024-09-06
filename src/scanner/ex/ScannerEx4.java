package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수 를 입력 : ");
        int num = scanner.nextInt();

        System.out.println(num + "단 의 구구단 출력 : ");
        for (int i = 1; i <= 9; i++){
            int result = num * i;
            System.out.println(
                    num + " * " + i + " = " + result
            );
        }
    }
}
