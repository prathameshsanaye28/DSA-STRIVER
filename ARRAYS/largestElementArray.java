import java.util.* ;
import java.io.*; 
public class largestElementArray {
    static int largestElement(int[] arr, int n) {
        int result=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>result)
            result=arr[i];
        }
    return result;
    }
}
