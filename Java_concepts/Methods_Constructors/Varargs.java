package Methods_Constructors;// VarArgs = allow a method to accept a varying number or amount of arguments which  makes method more  flexible , no need for overloading methods
// Java will pack the arguments into an array ...(ellipsis)

public class Varargs {
    public static void main(String[] args) {

        System.out.println(add(1, 2, 3, 4));
        System.out.println(average());
    }
    static int add (int... numbers){ // here, it's creating an array of integers where we can pass any number of values we want .
        int sum = 0;
        for(int num : numbers){
            sum += num ;
        }
        return sum;
    }

    static int average(int... Numbers){

        int sum = 0;
        if (Numbers.length == 0){
            throw new IllegalArgumentException("Arguments cannot be 0 or empty"); // throwing an exception here to tell that array cannot be empty or with null values.
        }
        for(int num : Numbers){
            sum += num;
        }
        return sum / Numbers.length;
    }
}
