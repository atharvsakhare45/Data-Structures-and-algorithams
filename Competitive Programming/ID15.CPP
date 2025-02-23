#include <iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    
    double sum=0;
    int a;
    for(int i=0;i<n;i++)
    {
        cin>>a;
        sum=sum+a;
    }
    
    float ans=static_cast<double>(sum) / n;
    cout<<ans;
    
    return 0;
}