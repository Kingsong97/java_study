package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCost = 0;

        while (true){
            System.out.println("1. 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scanner.nextInt();

            if (option == 1){
                scanner.nextLine();

                System.out.print("상품명 입력 : ");
                String product = scanner.nextLine();

                System.out.print("가격 입력 : ");
                int price = scanner.nextInt();

                System.out.print("수량 입력 : ");
                int quantity = scanner.nextInt();

                totalCost += price * quantity;
                System.out.println("상품 : " + product + "가격 : " + price + "수량 : " + quantity);
            } else if (option == 2) {
                System.out.println("총 비용 : " + totalCost);
                totalCost = 0;
            } else if (option == 3) {
                System.out.println("종료!");
                break;
            } else {
                System.out.println("에러");
            }
        }
    }
}
