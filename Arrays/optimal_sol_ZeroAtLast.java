class optimal_sol_ZeroAtLast
{

    public static int[] moveZeros(int arr[] , int n)
    {
        int j=-1;

        //place the pointer at j
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }

        // if no non-zero elements:
        if(j==-1) return arr;

        for(int i=j+1;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

        return arr;

    }

    //optimal solution for place all the zeros at the last in array.
    public static void main(String[] args)
    {
        int n=10;
        int arr[]={1,0,2,3,2,0,0,4,5,1};

        int ans[]=moveZeros(arr,n);

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+ " ");
        }
    
    }
}