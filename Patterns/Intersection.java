import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int n=sr.nextInt();
            int[] arr1=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr1[i]=sr.nextInt();
            }
            int m =sr.nextInt();
            int[] arr2=new int[m];
            for (int i =0 ; i<m;i++)
            {
                arr2[i]=sr.nextInt();
            }
            System.out.println("Answer");
            Solution. intersections(arr1, arr2);
            System.out .println();
            t -= 1;
        }

        sr.close();
    }
}
