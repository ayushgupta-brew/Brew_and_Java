package MathsForDSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Print_all_Divisors {
    public static void main(String[] args){
        int number = 36;
        System.out.println(bruteForceApproach(number));

        List<Integer> integerList = optimalApproach(number);
        Collections.sort(integerList);

        System.out.println(integerList);

    }
    public static List<Integer> bruteForceApproach(int n){
        List<Integer> result = new ArrayList<>();

        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> optimalApproach(int n){

        List<Integer> result = new ArrayList<>();

        for(int i = 1; i*i<=n; i++){
            if(n % i == 0){
                result.add(i);

                if(i != (n / i)){
                    result.add(n / i);
                }
            }
        }
        return result;
    }
}
