package Basics;

// constructor , private keyword in enums

enum server{
    Running(200) , Failed(400) , Pending(600) , Success(800);

   private int no;

    public int getI() {
        return no;
    }

    public void setI(int no) {
        this.no = no;
    }

    server(int no) {
        this.no =  no;
    }
//   private  server(int no) {
//        this.no = no;
//    }
}

public class Enums2 {
    public static void main(String[] args) {

        server s1 = server.Failed;

        System.out.println(s1.ordinal());

        server[] s = server.values();

        for (server a : s){
            System.out.println(a.name() +" : "+a.getI());
        }
        System.out.println(s.length);
    }
}
