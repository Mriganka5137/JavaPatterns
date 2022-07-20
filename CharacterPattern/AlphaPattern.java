package CharacterPattern;
import java.util.*;

public class AlphaPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int i=1;
        while(i<=n){
            int j=1;
            char c=(char)('A'+i-1);
            while(j<=i){
                
                System.out.print(c);
                j=j+1;
            }
            System.out.println();
            i=i+1;
    
        }
    }
}
