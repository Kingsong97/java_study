package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("이름을 입력하세요 (종료 입력 시 종료) : ");
            String name = input.nextLine();

            if (name.equals("종료")){
                System.out.println("종료합니다.");
                break;
            }

            System.out.print("나이 : ");
            int age = input.nextInt();
            input.nextLine();

            System.out.println("이름 : " + name + ", 나이 : " + age);
        }
    }
}
