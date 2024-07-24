
// import java.util.*;

// class unionOfTwoArrays
// {
//     static ArrayList<Integer> UnionArray(int a[],int b[],int n1,int n2)
//     {

//         HashSet<Integer> s = new HashSet<>();
//         ArrayList <Integer> union= new ArrayList<>();

//         for(int i=0;i<n1;i++)
//         {
//             s.add(a[i]);
//         }
//         for(int i=0;i<n2;i++)
//         {
//             s.add(a[i]);
//         }

//         for(int it:s)
//         {
//             union.add(it);
//         }

//         return union;
//     }


//     public static void main(String args[])
//     {
//         // int n1=6;
//         // int n2=7;
//         int a[]={1,2,3,5,6,7};
//         int b[]={1,2,3,4,5,8,9};
//         int n1=a.length;
//         int n2=b.length;


//         ArrayList <Integer> union = UnionArray( a, b,n1,n2);

//         System.out.println("Union of arr1 and arr2 is ");

//         // UnionArray(a,b);

//         for(int it:union )
//         {
//             System.out.println(it+" ");
//         }
//     }
// }


// sulution from take you forward
import java.util.*;

class unionOfTwoArrays{
static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
  HashSet <Integer> s=new HashSet<>();
  ArrayList < Integer > Union=new ArrayList<>();
  for (int i = 0; i < n; i++)
    s.add(arr1[i]);
  for (int i = 0; i < m; i++)
    s.add(arr2[i]);
  for (int it: s)
    Union.add(it);
  return Union;
}
public static void main(String args[]) {
  int n = 10, m = 7;
  int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int arr2[] = {2, 3, 4, 4, 5, 11, 12};
  ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
  System.out.println("Union of arr1 and arr2 is ");
  for (int val: Union)
    System.out.print(val+" ");
}
}




