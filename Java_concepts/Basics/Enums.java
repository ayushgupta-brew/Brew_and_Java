package Basics;

// Enum -> Enumeration
// Enums  is a special data type in programming used to define a collection of related, fixed constants. Instead of using hard-to-remember numbers or prone-to-typo strings, you assign meaningful names to represent a specific set of choices (like
// days of the week or user roles)

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
