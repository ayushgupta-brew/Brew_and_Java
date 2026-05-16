package OOPS_concept;

// In Inheritance, we can use multi level inheritance

// two classes is single level and multiple class is multi level Inheritance

class Calc {  // Parent class or Super class

    public int add(int n1 , int n2){
        return n1 + n2;
    }

    public int sub(int n1 , int n2){
        return n1 - n2;
    }
}

class AdvCalc extends Calc{ // extends keyword means extends from the super class. This is Sub or child class

    public int multi(int n1 , int n2){
        return n1 * n2;
    }

    public int div(int n1 , int n2){
        return n1 / n2;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
       int r1= obj.add(2 , 3);
       int r2= obj.sub(3 , 1);
       int r3= obj.multi(2 , 3);
       int r4= obj.div(15 , 3);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}
