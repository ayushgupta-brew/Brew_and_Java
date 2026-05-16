package OOPS_concept;

//  we create the object of  the concrete class

abstract class car{  // abstract class

    public abstract void drive(); // here we don't define , we declare it
    public abstract int sum(int num);

    public void music(){
        System.out.println("Play music..");
    }
}

class WagonR extends car{  // concrete class

    public void drive() {
        System.out.println("driving..");
    }

    public int sum(int num) {
        return num + 1;
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {

    car obj = new WagonR();

    obj.drive();
    obj.music();

    System.out.println(obj.sum(2));

    }
}
