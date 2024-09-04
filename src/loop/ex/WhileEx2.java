package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 0;
        int add = 1;

        while (num < 20){
            num = num + add;
            num++;
            System.out.println(num);
        }
    }
}
