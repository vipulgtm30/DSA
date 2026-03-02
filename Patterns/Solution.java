import java.util.Scanner;

class Solution{
    public static void intersections(int[] arr1, int[] arr2) {
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+ " ");
                }
            }
        }

    }   

    public static void prefixSum(int []arr){
        if(arr.length != 0 || arr.length != 1){
            //Write your code here
            for(int i=1; i<arr.length; i++){
                arr[i] = arr[i] + arr[i-1];
            }
        }
    }

    public static int binarySearch(int []a, int l, int r, int key){
        while(l <= r){
            int mid = (l+r)/2;
            if(a[mid] == key){
                return mid;
            }else if(a[mid] > key){
                r = r - 1;
            }else if(a[mid] < key){
                l = l + 1;
            }
        }
        return -1;
    }

}