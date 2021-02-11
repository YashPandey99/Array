import java.util.Arrays;
import java.util.Scanner;

/**
 * Rotate1
 */
public class Rotate1 {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter from where to rotate");
        int d = sc.nextInt();   
        int b[] = new int[d];
        for(int j = 0; j < d; j++)
        {
            b[j] = a[j];
        }
        int p = a.length-d;        
        int q = d;  
        int[] result = new int[p + q];   
        System.arraycopy(a, 0, result, d,p);  
        System.arraycopy(b, 0, result, p, q);
        for(int f=0;f<n;f++){
            System.out.println(result[f]);
        }
        
}


    }
