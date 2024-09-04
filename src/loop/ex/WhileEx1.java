package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        int count = 0;

        while(count < 10){
            count++;
            System.out.println("while문 : " + count);
        }

        for (count = 1; count <= 10; count++){
            System.out.println("for문 : " + count);
        }
    }
}
