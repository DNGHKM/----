public class ArrayApp {
    public static void main(String[] args) {
        String[] users = new String[3];
        users[0]="dongha";
        users[1]="pureum";
        users[2]="yeohyung";


        System.out.println(users[0]);
        System.out.println(users.length);

        int[] score = {90,85,100};
        System.out.println(score[1]);
        System.out.println(score.length);
        System.out.println(score); // 전체 배열 값 어떻게 출력하지?
    }
}
