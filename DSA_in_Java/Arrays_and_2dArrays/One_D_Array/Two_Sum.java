package Arrays_and_2dArrays.One_D_Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args){


        int[] a = {2,6,5,8,11};
        int target = 14;
        int[] answer = usingHashMap(a , target);
        System.out.println(Arrays.toString(answer));

    }
    public static int[] usingNestedLoop(int[] a , int target){
        int n = a.length;
        for(int i = 0 ; i< n; i++){
            for(int j = i+1 ; j < n ; j++){
                if(a[i] + a[j] == target){
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{-1 , -1};
    }

    public static int[] usingHashMap(int[] array , int target){

        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < array.length ; i++){
            int complement = target - array[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement) , i};
            }
            map.put(array[i] , i);
        }
        return new int[]{-1 , -1};
    }
}
