package Pattern2;
import java.util.*;

public class Diamond {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=(n/2)+1;
        int b=(n/2);

        int i=1;
        while(i<=a){
            int spaces=1;
            while(spaces<=a-i){
                System.out.print(' ');
                spaces=spaces+1;
            }

            int stars=1;
            while(stars<=i){
                System.out.print('*');
                stars=stars+1;
            }

            int star2=1;
            while(star2<=i-1){
                System.out.print('*');
                star2=star2+1;
            }
            i=i+1;
            System.out.println();   
        }


        int j=1;
        while(j<=b){
            int spaces=1;
            while(spaces<=j){
                System.out.print(' ');
                spaces=spaces+1;
            }

            int stars=1;
            while(stars<=b-j+1){
                System.out.print('*');
                stars=stars+1;
            }

            int star2=1;
            while(star2<=b-j){
                System.out.print('*');
                star2=star2+1;
            }


            j=j+1;
            System.out.println();
        }
        
    }
    
}
