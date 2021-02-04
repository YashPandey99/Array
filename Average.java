/**
 * Average
 */
import java.util.*;
public class Average {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+= arr[i];
        }
        
        float Average = ((float)sum)/n;
        System.out.println(Average);
    }
}
