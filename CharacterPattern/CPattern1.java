package CharacterPattern;
import java.util.*;
public class CPattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int i=1;
        while(i<=n){
            int j=1;
            
            while(j<=n){
                char c=(char)('A'+j-1);
                System.out.print(c);
                j=j+1;
            }
            System.out.println();
            i=i+1;
    
        }
    }
}
