package Recursion;

import java.util.ArrayList;

public class returnArrayList {
    public static void main(String[] args) {
        System.out.println(arrayList(new int[]{1, 2, 3, 4, 4, 5}, 4, 0, new ArrayList<>()));
    }
    static ArrayList<Integer> arrayList(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (target == arr[index]){
            list.add(index);
        }
        return arrayList(arr, target, index+1, list);
    }
}
