package Recursion;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 5, 9};
        System.out.println(Search(arr, 5, 0));
        System.out.println(searchIndex(arr, 5, 0));
        System.out.println(searchIndexLast(arr, 5, arr.length-1));
        searchAllIndex(arr, 5, 0);
        System.out.println((list));
    }
    static boolean Search(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || Search(arr, target, index+1);
    }

    static int searchIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return searchIndex(arr, target, index+1);
    }

    static int searchIndexLast(int[] arr, int target, int index){
        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return searchIndexLast(arr, target, index - 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void searchAllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        searchAllIndex(arr, target, index+1);
    }
}

