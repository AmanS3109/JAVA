public class resizeArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println("the size of original array: " + arr.length);
        int[] newArr = resize(arr, 10);
        System.out.println("The array size after resizing: " + newArr.length);
    }
    static int[] resize(int[] arr, int capacity){
        int [] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }
}
