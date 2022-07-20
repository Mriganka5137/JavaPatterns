package Pattern2;
import java.util.*;


public class Pyramid2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int i=1;
        
        while(i<=n){
            int a=i;
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(' ');
                spaces=spaces+1;
            }

            int num=1;
            while(num<=i){
                System.out.print(a);
                a=a+1;
                num=num+1;
            }

            int stars=1;
            int b=a-2;
            while(stars<=i-1){
                System.out.print(b);
                stars=stars+1;
                b=b-1;
            }


            System.out.println();
            i=i+1;
        }
    }
    
}
