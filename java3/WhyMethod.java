public class WhyMethod {
    public static void main(String[] args) {
        printTwoTimes("A","*"); //A, * : 인자, "argument"
        System.out.println(TwoTimes("A","-"));

        printTwoTimes("B","$");
        printTwoTimes("C","#");
        
    }
    public static void printTwoTimes(String text,String delimiter){ //method 정의, 안에 있는 변수는 "매개변수"
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
        }
    public static String TwoTimes(String text, String delimiter){
        String out = "";
        out = out + delimiter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out;

    }  
}
