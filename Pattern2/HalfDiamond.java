package Pattern2;
import java.util.*;
public class HalfDiamond {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println('*');
        int i=1;
        while(i<=n){
            
            System.out.print('*');
            int j=1;
            int num=1;
            while(j<=i){
                System.out.print(num);
                num=num+1;
                j=j+1;
            }

            int k=1;
            int num2=i-1;
            while(k<=i-1){
                System.out.print(num2);
                num2=num2-1;
                k=k+1;
            }

            System.out.print('*');

            i=i+1;
            System.out.println();

        }

        int m=1;
        while(m<=n-1){
            System.out.print('*');
            int j=1;
            while(j<=n-m){
                System.out.print(j);
                j=j+1;
            }

            int k=1;
            int num3=n-m-1;
            while(k<=n-m-1){
                System.out.print(num3);
                num3=num3-1;
                k=k+1;
            }

            System.out.print('*');
            m=m+1;
            System.out.println();

        }
        System.out.println('*');




    }
    
}
