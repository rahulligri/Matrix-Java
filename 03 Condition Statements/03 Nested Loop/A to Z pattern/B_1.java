/* 
 * * * * *
 *       *
 * * * * *
 *       *
 * * * * * 
*/
import java.util.Scanner;
public class B_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num=sc.nextInt();
        int i=1,j,mid=(num+1)/2;
        while(i<=num)
        {
            j=1;
            while(j<=num)
            {
                if(j==1 || i==1 || i==mid || i==num ||j==num )
                    System.out.print("* ");
                else
                    System.out.print("  ");
                j++;

            }
            System.out.println();
            i++;
        }
    }
    
}
