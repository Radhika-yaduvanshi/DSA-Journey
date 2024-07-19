#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n = 5;
    int arr[n] = {1, 22, 3, 4, 5};

    int temp = arr[0];
    cout << "Original array : ";

    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }

    for (int i = 1; i < n; i++)
    {
        arr[i - 1] = arr[i];
    }
    arr[n - 1] = temp;

    cout << "After rotation by 1 place : ";

    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
}