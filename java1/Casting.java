public class Casting {
    public static void main(String[] args) {
        double a = 1.1;
        System.out.println(a);
        double b = 1;
        System.out.println(b);
        double b2 = (double) 1; //같은이야기임, 손실없어서 바로 변환 가능
        System.out.println(b2);

        // int c = 1.1; //double형을 int로 변환 불가(소수점 아래 숫자 날아가니까 안됨)
        double d = 1.1;
        int e = (int)1.1; //1.1을 강제로 int형으로 바꾸는 명령어
        System.out.println(d);
        System.out.println(e);
        
        String s= Integer.toString(1); //숫자 1을 문자로 강제로 바꿈
        System.out.println(s);
    }
    
}
