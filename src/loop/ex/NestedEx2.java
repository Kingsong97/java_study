package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {

        int rows = 10;

        for (int i = 0; i <= rows; i++){
            for (int k = 1; k <= rows - i; k++){
                System.out.print(" ".repeat(i));
            }
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
