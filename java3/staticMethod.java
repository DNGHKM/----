//static은 class 소속 메소드
//static 없는것은 instance 소속 메소드임


class Print{
    public String delimiter;
    public void a(){ //instance 소속 메소드
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }
    public void b(){ //instance 소속 메소드
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
    }
    public static void c(String delimiter){ //class 소속 메소드
        System.out.println(delimiter);
        System.out.println("c");
        System.out.println("c");
    }
    }


public class staticMethod {
    public static void main(String[] args) {
        //instance
        Print t1 = new Print();
        t1.delimiter = "-";
        t1.a();
        t1.b();

        Print.c("##");

        Print t2 = new Print();
        t2.delimiter = "*";
        t2.a();
        t2.b();

    }

}