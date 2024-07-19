#include <bits/stdc++.h>
using namespace std;

int main()
{
    int arr[6] = {
        1,
        1,
        2,
        3,
        3,
        2,
    };

    int i = 0;
    for (int j = 1; j < 6; j++)
    {
        if (arr[i] != arr[j])
        {
            arr[i + 1] = arr[j];
            i++;
        }
    }
    // for (int i = 0; i < 6; i++)
    // {
    //     cout << arr[i];
    // }

    return i + 1;
}