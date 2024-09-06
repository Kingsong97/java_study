package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름 : ");
        String foodName = scanner.nextLine();

        System.out.print("음식 가격 : ");
        int foodPrice = scanner.nextInt();

        System.out.print("음식 수량 : ");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.print(foodName + " " + foodQuantity + " 개 를 주문하셨습니다. 총 가격은 " + totalPrice + " 입니다.");
    }
}
