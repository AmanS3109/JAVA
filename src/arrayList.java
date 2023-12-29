import java.util.Arrays;

public class arrayList {

    public static class ArrayList{
        int[] arr = new int[5];
        int index = 0;
        int size = 0;
        public void add(int element){
            if (size == arr.length){
                int[] brr = Arrays.copyOf(arr, arr.length*2);
                arr = new int[brr.length];
                arr = Arrays.copyOf(brr, brr.length);
            }
            arr[index] = element;
            index++;
            size++;
        }
    }
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(2);
        arr.add(4);
        arr.add(1);
        System.out.println(arr.size);

    }
}
