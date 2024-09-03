package cond.ex;

public class ScoreEx2 {
    public static void main(String[] args) {
        int distance = 7;
        String tranceportation;
        if (distance <= 1){
            tranceportation = "도보";
        } else if (distance <= 10) {
            tranceportation = "자전거";
        } else if (distance <= 100) {
            tranceportation = "자동차";
        } else {
            tranceportation = "비행기";
        }

        System.out.println(tranceportation + "를 이용하세요.");
    }
}
