class checkIfArrayIsSortedAndRotated
{

    //1752. Check if Array Is Sorted and Rotated
            public static boolean check(int arr[])
            {
                int count=0;
                int n=arr.length;

                for(int i=0;i<n;i++)
                {
                    if(arr[i]>arr[(i+1)%n])
                    {
                        count++;
                    }
                }
                if(count>1) return false;
                return true;
            }

        public static void main(String[] args)
       {


            int arr[]={1,2,3,4,5};

            boolean ans = check(arr);
            System.out.println(ans);
       }
}