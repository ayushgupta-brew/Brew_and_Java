package Methods_Constructors;

// We can implement final keyword to methods ,  class and variables .

// final keyword make the variables constant means we cannot change the value of it
// final keyword make the class non-used to Inheritance means we cannot extend it
// final keyword make the methods non-changeable means we cannot override the method


//final class A3{
class A3{
    public final void show(){
        System.out.println("In A3 show");
    }

    public void add(int a  , int b){
        System.out.println(a+b);
    }
}

class B3 extends A3{
//    public void show(){}   // we cannot override it as the show method is final above
}


public class FinalKeyword {
    public static void main(String[] args) {

        final int num = 7;
        System.out.println(num);

        A3 obj = new A3();
        obj.add(2 , 3);
        obj.show();
    }
}
