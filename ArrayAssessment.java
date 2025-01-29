import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ArrayAssessment {

    public static void main(String[] args) {
        int temp;
        int inc = 0;
        int[] arr = new int[] {3, 1, 4, 5, 8, 6, 7, 2, 0, 9};
        System.out.println("1. Array of integers with 10 elements");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }

        //sorting
        for(int i=0 ; i< arr.length ; i++)
        {
            for(int j=i+1 ; j< arr.length ; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("sorting");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        System.out.println("2. largest and smallest element in the array is "+arr[0]+" and "+arr[9]);

        System.out.println("3. Reverse");
        for(int k=arr.length-1 ; k >=0 ; k--)
        {
            System.out.print(arr[k]+" ");
        }

        System.out.println("4. SUM and Average");
        for(int i : arr)
        {
            inc = inc + i;
        }
        System.out.println("SUM = "+inc);
        float avg = (float) inc/10;
        System.out.println("Average = "+avg);

        
    }
    
}
