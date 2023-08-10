public class LoopArray {
    public static void main(String[] args) {
        String[] users = new String[3]; //배열 갯수를 사전에 정하고 나중에 못바꾸나?
        users[0]="dongha";
        users[1]="pureum";
        users[2]="yeohyung";

        for(int i=0; i<users.length; i++){
            if(i<users.length-1){
        System.out.println(users[i]+",");
        }else{
            System.out.println(users[i]);
        }
    }
        
    }
}
