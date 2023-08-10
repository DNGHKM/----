public class AuthApp3 {
    public static void main(String[] args) {

        //String[] users = {"dongha","pureum", "yeohyung"};
        String[][] users = { //이중배열
            {"dongha","1111"},
            {"pureum","2222"},
            {"yeohyung","3333"},
        };
        String inputId = args[0]; //dongha
        String inputPass = args[1]; //1111

        boolean isLogined = false;
        for(int i=0; i<users.length; i++){
            String[] current = users[i];
            if( current[0].equals(inputId)&& //이 부분에서 current[0]은 users = {a,b} 의 a를 나타냄
                current[1].equals(inputPass)) //이 부분에서 current[1]은 users = {a,b} 의 b를 나타냄
            {
                isLogined = true;
                break;
            }
        }
        System.out.println("hi, ");
        if(isLogined){
            System.out.println("Master!");
        } else {
            System.out.println("who are you?");
        }

    }
}
