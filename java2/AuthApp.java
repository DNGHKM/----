public class AuthApp {
    public static void main(String[] args) {
        System.out.println(args[0]);

        String id = "dongha";
        String inputId = args[0];

        String pass = "1111";
        String inputPass = args[1];

        System.out.println("hi.");

        if(inputId.equals(id)&&pass.equals(inputPass)){  
            //왜 inputId == id로 하면 false지?
            //원시데이터타입이냐 아니냐에 따라서 저장위치가 동등할수도, 다를수도있음
            //이에 따라서 equals(내용이 같냐?)를 쓰는것이 안전
            //if는 같은 곳에 저장되어있냐는 뜻
            //(원시데이터는 "==", 원시데이터가 아니면 "equals")
            //중간에 sysout으로 확인해봐야함
            System.out.println("Master!");
        } else {
            System.out.println("Who are you?");
        }
    }
}
