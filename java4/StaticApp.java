class Foo{
    public static String classVar = "I class var"; 
    public String instanceVar = "I instance var";
    public static void calssMethod(){
        System.out.println(classVar); //접근가능
        // System.out.println(instanceVar); //접근불가
    }
    public void instanceMethod() {
        System.out.println(classVar); //접근가능
        System.out.println(instanceVar); //접근가능

    }

}
public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Foo.classVar); //접근가능
        // System.out.println(Foo.instanceVar); //접근불가
        Foo.calssMethod();//접근가능
        // Foo.instanceMethod();//접근불가
        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println(f1.classVar); // I class var
        System.out.println(f1.instanceVar); // I instance var
        
        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar); // changed by f1
        System.out.println(f2.classVar); // changed by f1

        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar); //changed by f1
        System.out.println(f2.instanceVar); //I instance var

        //static이 써있는 class 소속 변수는 모든 인스턴스와 변동 일치됨
        //static이 안써있는 instance 소속 변수는 개별적으로 변화가능


    }
}
