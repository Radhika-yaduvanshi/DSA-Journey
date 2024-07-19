#include <bits/stdc++.h>
using namespace std;

int main()
{
    int arr[5] = {5, 3, 2, 6, 3};

    int smallest = arr[0];
    int ssmallest = INT_MAX;

    for (int i = 1; i < 5; i++)
    {
        if (arr[i] < smallest)
        {
            ssmallest = smallest;
            smallest = arr[i];
        }
        else if (arr[i] != smallest && arr[i] < ssmallest)
        {
            ssmallest = arr[i];
        }
    }

    cout << "Second smallest : " << ssmallest;
}