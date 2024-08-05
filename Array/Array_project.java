package Array;
import java.util.*;
public class Array_project {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of days:");
        int days = sc.nextInt();
        int sum = 0;
        int arr[] = new int[days];
        for (int i = 0; i <days; i++) {
            System.out.println("Enter day "+ (i+1) + " temperature: ");
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        double avg = sum / days;
        int count = 0;
        System.out.println("Average Temperature is : " + avg);
        for (int i = 0; i < days; i++) {
            if (arr[i] >avg){
                System.out.println("Day " + (i+1) + " temperature is greater than average");
                count+=1;
            }
        }
        System.out.println(count + " days above average temperature");
        sc.close();
    }
    
}
