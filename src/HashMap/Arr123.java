package HashMap;

public class Arr123 {
    static int[] searchRange (int[] arr, int key) {
        int[] ar = new int[2] ;
        int first =Integer.MIN_VALUE;
        int last = Integer.MAX_VALUE;
        int counter = 0;

        for(int i=0;i<arr.length;i++){
            if (arr[i] == key){
                if (counter==0) {
                    first = i;
                    counter++;
                }
                if (arr[i+1]!=key) {
                    last = i;
                }
            }
        }
        ar[0] = first;
        ar[1] = last;

        return ar;
        // add your logic here
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5,6};
        int ar1[] = searchRange(arr,4);
        for(int i:ar1){
            System.out.println(i);
        }
    }
}
