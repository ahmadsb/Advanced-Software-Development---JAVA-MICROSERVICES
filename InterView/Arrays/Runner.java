package InterView.Arrays;

public class Runner {
    //1. getShuffle every each time in different arrange using Random function
    public static void getShuffle(int[] arr){

        int N = arr.length;
        int[] output = new int[arr.length];
        for(int i =0 ; i < N ; ++i){
            int R = (int)(Math.random() *100);
            int index = R%(N - i);
            output[i] = index;
            swap(arr,index, arr.length-1 - i);
        }

    }
    //Aux. Methods
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int[] arr){
        for(int e:arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int[] arr = {2,4,5,6,7};
        printArray(arr);

        getShuffle(arr);
        printArray(arr);

        getShuffle(arr);
        printArray(arr);
    }
}
