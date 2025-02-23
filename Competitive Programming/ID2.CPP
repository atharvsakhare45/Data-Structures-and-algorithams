#include<iostream> 
using namespace std;
 
int main()
{
    int arr[5][5];
    int row;
    int col;
    
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<5;j++)
        {
            cin>>arr[i][j];
            if(arr[i][j]==1)
            {
                row=i;
                col=j;
            
            }
        }
    }
    int res=abs(2-row)+abs(2-col);
    cout<<res;
    return 0;
}