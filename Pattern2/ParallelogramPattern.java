package Pattern2;
import java.util.*;
public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();

        int i=1;
        while(i<=n){
             int j=1;
            while(j<=i-1){
                System.out.print(' ');
                j=j+1;
            }
            int k=1;
            while(k<=n){
                System.out.print('*');
                k=k+1;
            }
            System.out.println();
            i=i+1;
        }
    }
}
