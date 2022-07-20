package Pattern2;
import java.util.*;


public class Pyramid {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(' ');
                spaces=spaces+1;
            }

            int num=1;
            while(num<=i){
                System.out.print('*');
                num=num+1;
            }

            int stars=1;
            while(stars<=i-1){
                System.out.print('*');
                stars=stars+1;
            }


            System.out.println();
            i=i+1;
        }
    }
    
}
