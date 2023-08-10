public class OutputMethod {
    public static String a(){ //void 대신 String(리턴값이 스트링이다.)
        //...
        return "a"; //리턴은 메소드를 끝내기도 함
    }
    public static int one(){ //void 대신 one(리턴값이 정수다.)
        //...
        return 1;
    }

    public static void main(String[] args) { //void(리턴값이 없다.)
        System.out.println(a());
        System.out.println(one());
    }
}
