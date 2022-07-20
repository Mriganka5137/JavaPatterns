package Pattern2;
import java.util.*;
public class SumPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            System.out.print('1');
            int j=1;
            int k=2;
            while(j<=i-1){
                System.out.print('+');
                System.out.print(k);
                j=j+1;
                k=k+1;
            }

            sum=sum+i;
            System.out.print('=');
            System.out.print(sum);
            System.out.println();
            i=i+1;
            
        }

        
    }
    
}
