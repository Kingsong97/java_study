package scanner;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("시작을 원하시면 yes 를 입력하세요 : ");
        String startAnswer = scanner.nextLine();
        if (startAnswer.equals("yes")){
            for(;;){
                System.out.print("문자를 입력해보세요(종료 = exit) : ");
                String str = scanner.nextLine();
                if (str.equals("exit")) {
                    break;
                }
                System.out.println("입력한 문자열 : " + str);
            }
        } else {
            System.out.print("종료합니다.");
        }
    }
}
