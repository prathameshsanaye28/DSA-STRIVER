public class secondLargestEle {
    static void mergeSort(int[] arr, int p, int q)
    {
        if (p<q)
        {
            int r=(p+q)/2;
            mergeSort(arr, p, r);
            mergeSort(arr, r+1, q);
            secondLargestEle.merge(arr, p, r, q);
        }

        else return;
        
    }

    static void merge(int[] arr, int p, int q, int r){
        int n1=q-p+1;
        int n2=r-q;
        int i,j;
        int [] L= new int[n1];
        int [] R= new int[n2];
        for (i=0;i<n1;i++)
        L[i] = arr[p + i];
    for (j=0;j<n2;j++)
        R[j] = arr[q + 1 + j];

        i = 0;
    j = 0;
    int k = p;
    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
        }
        else {
            arr[k] = R[j];
            j++;
        }
        k++;
    }


    while (i < n1) {
        arr[k] = L[i];
        i++;
        k++;
    }


    while (j < n2) {
        arr[k] = R[j];
        j++;
        k++;
    }
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        int[] result = new int[2];
       // int n = result.length;
       secondLargestEle.mergeSort(a, 0, n-1);
        result[1]=a[1];
        result[0]=a[n-2];
        return result;
    }
}
