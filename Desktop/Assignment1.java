import java.util.Scanner;
class Assignment1
{
    static int binarySearch(int arr[], int low, int high)
    {
        if(high >= low)
        {
            /* low + (high - low)/2; */
            int mid = (low + high)/2;
            if(mid == arr[mid])
                return mid;
            if(mid > arr[mid])
                return binarySearch(arr, (mid + 1), high);
            else
                return binarySearch(arr, low, (mid -1));
        }

        /* Return -1 if there is
           no Fixed Point */
        return -1;
    }

    //main function



    public static void main(String[] args) {
        System.out.println("Enter size");

Scanner f=new Scanner(System.in);
 int n=f.nextInt();
     int[] arr = new int[n+1];
           System.out.println("Enter elements");
     for(int i=1;i<n+1;i++)
     {
         arr[i]=f.nextInt();
     }
        Assignment1 mbs = new Assignment1();

   int x=mbs.binarySearch(arr,1,n);
if(x==-1)
{
    System.out.println("NOT_FOUND");
}
else
{
     System.out.println(x);
}
        }
}
//hello