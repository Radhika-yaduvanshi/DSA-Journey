class linear_Search
{

//     Problem statement
// You are given an array ‘arr’ containing ‘n’ integers. You are also given an integer ‘num’, and your task is to find whether ‘num’ is present in the array or not.

// If ‘num’ is present in the array, return the 0-based index of the first occurrence of ‘num’. Else, return -1.

// Example:
// Input: ‘n’ = 5, ‘num’ = 4 
// 'arr' =  [6,7,8,4,1] 

// Output: 3

// Explanation:
// 4 is present at the 3rd index.


    public static void main(String[] args)
    {
        int arr[] ={1,2,3,4,4,5};

        int num=4;

        int n=5;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
                System.out.println(num+"is present at the "+i+"  index.") ;
            }
        }
        // return -1;
    }
}