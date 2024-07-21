public class moveZero
{
    // public static void main(String[] args)
    // {
    //     System.out.println("hello");
    // }

        void move(int arr[],int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            arr[count++]=arr[i];
        }
        while(count<n)
        {
            arr[count++]=0;
        }
    }
    public static void main(String[] args)
    {
        // System.out.println("hello");
        moveZero n1=new moveZero();
        int arr[]={1,0,2,0,3,4,0,0,5};
        int n = arr.length;
        n1.move(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}