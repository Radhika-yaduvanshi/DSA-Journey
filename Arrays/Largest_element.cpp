#include <bits/stdc++.h>
using namespace std;

int main()
{
    int arr[7] = {3, 4, 6, 10, 6, 7, 8};

    int largest = arr[0];

    for (int i = 0; i < 7; i++)
    {
        if (arr[i] > largest)
            largest = arr[i];
    }

    cout << "Largest element is : " << largest;
}