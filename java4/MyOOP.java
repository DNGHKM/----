class Print{    
    public String delimiter;
    public Print(String delimiter){//생성자라고 함, class명과 동일한 메소드 정의함으로서 초기화함
        this.delimiter = delimiter; //this는 내가 생성한 인스턴스를 가르키는 단어임
    }
    public void A(){
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
        public void B(){
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
public class MyOOP {
    public static void main(String[] args) {
        Print p1 = new Print("----");
        p1.A();

        Print p2 = new Print("****");
        p2.B();
        //..
    }

    
} 
