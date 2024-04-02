package Recursion;

import java.util.ArrayList;

public class returnArrayList {
    public static void main(String[] args) {
        System.out.println(arrayList2(new int[]{1, 2, 3, 4, 4, 5}, 4, 0));
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
    //return arrayList without being in argument
    static ArrayList<Integer> arrayList2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length){ //base case
            return list;
        }
        if (target == arr[index]){  //base case
            list.add(index);
        }
        ArrayList<Integer> fromBelowCalls = arrayList2(arr, target, index+1); // recurrence relation
        list.addAll(fromBelowCalls);
        return list;
    }
}
