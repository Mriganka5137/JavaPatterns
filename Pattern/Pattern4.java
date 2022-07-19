package Pattern;
import java.util.*;
public class Pattern4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int i=1;
        while(i<=n){
            int j=1;
            int a=n;
            while(j<=n){
                System.out.print(a);
                j=j+1;
                a=a-1;
            }
            System.out.println();
            i=i+1;
        }


    }
}