package cond.ex;

public class GradeSwitchEx {
    public static void main(String[] args) {
        String grade;
        grade = "";
        String mean;
        switch (grade) {
            case "A":
                mean = "탁월한 성과입니다!";
                break;

            case "B":
                mean = "좋은 성과입니다!";
                break;

            case "C":
                mean = "준수한 성과입니다!";
                break;

            case "D":
                mean = "향상이 필요합니다!";
                break;

            case "F":
                mean = "불합격입니다.";
                break;

            default:
                mean = "잘못된 학점입니다.";
                break;

        }
        System.out.println(mean);
    }
}
