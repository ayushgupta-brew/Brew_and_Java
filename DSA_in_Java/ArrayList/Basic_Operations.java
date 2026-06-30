package ArrayList;

import java.util.ArrayList;

public class Basic_Operations {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);

        swap(arrayList);

        for (int i : arrayList) {
            System.out.print(i + " ");
        }
    }

    public static void swap(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
}
