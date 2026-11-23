public class SecondLargestDistinct {
    public static void main(String[] args){
        int[] arr = {10,5,25,8,15,25,10};
        int largest =  Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i =0; i<arr.length;i++){
            if(arr[i]> largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(secondLargest);
        }
    }
}
