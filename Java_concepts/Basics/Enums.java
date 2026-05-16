package Basics;

// Enum -> Enumeration

enum Status{
 Running , Failed , Pending , Success
}

public class Enums {
    public static void main(String[] args) {

        Status s = Status.Running;
//        System.out.println(s.ordinal());  // ordinal method means it give the index

//        Status[] ss = Status.values();
//
//        for(Status s : ss){
//            System.out.print(s + " ");
//        }

        switch (s){  // here we can implement enum to switch
            case Failed -> System.out.println("Try Again");
            case Pending -> System.out.println("Please Wait");
            case Success -> System.out.println("Done");
            default -> System.out.println("All Good");
        }
    }
}
