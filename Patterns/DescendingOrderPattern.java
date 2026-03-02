import java.util.Scanner;

public class DescendingOrderPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print(N-j);
                System.out.print(" ");
            }
            System.out.println();
        }


        sc.close();
    }
}


/*
BEGIN

    INPUT N
    FOR i FROM 0 to N-1
        FOR j FROM 0 to i
            OUTPUT N-j
            OUTPUT space
        PRINTLN

END
*/