import java.util.*;


class  interSectionOfTwoSortedArray{

    static ArrayList<Integer> intersectionOfArray(int a[],int b[],int n,int m)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int vis[]=new int[m];


        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(a[i]==b[j] && vis[j]==0)
                {
                    ans.add(a[i]);
                    vis[j]=1;
                    break;

                }

                if(b[j]>a[i]) break;
            }
        }

        return ans;

    }


    public static void main(String[] args)
    {
        // intersection of two arrys

        int a[]={1,2,2,3,3,4,5,6,8};
        int b[]={2,3,3,4,5,6,7,8};
        int n=a.length;
        int m=b.length;

        // ArrayList<Integer> intersect = new ArrayList<>();
        ArrayList<Integer> intersect = intersectionOfArray(a,b,n,m);

        // for(int val: intersect)
        // {
        //     System.out.println(val);
        // }

        for(int i=0;i<intersect.size();i++)
        {
            System.out.println(intersect.get(i)+" ");
        }


    }
}