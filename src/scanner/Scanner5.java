package scanner;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("각 항목에 0을 넣으면 종료됩니다.");

        while(true){
            System.out.print("첫번째 값을 입력하세요 : ");
            int num1 = scanner.nextInt();

            System.out.print("두번째 값을 입력하세요 : ");
            int num2 = scanner.nextInt();

            if(num1 == 0 && num2 == 0){
                System.out.println("종료");
                break;
            }

            int sum = num1 + num2;
            System.out.println("두 값의 합은 : " + sum);
        }
    }
}
