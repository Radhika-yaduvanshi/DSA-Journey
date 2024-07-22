public class m2zero
{

    void move(int arr[],int n)
    {
        int temp[] = new int[n];
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp[i]=arr[i];
            }

        }
        int nz = temp.length;
        for(int i=0;i<nz;i++)
        {
            arr[i]=temp[i];
        }
        for(int i=nz;i<n;i++)
        {
            arr[i]=0;
        }
    }
    public static void main(String[] args)
    {
        // System.out.println("hello");

        int arr[]={1,2,0,0,0,3,4,2};
        int n=arr.length;
        m2zero m2=new m2zero();
        move(arr,n);
        for(int i=0;i<n;i++)
        {System.out.println(arr[i]+" ");}
    }
}