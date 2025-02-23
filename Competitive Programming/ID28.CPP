#include<iostream>
using namespace std;
 
int main()
{
    int n;
    cin>>n;
    
    int count=0;
    while(n)
    {
        int a,b,c;
        cin>>a>>b>>c;
        
        if(a+b==2 || b+c==2 || c+a==2)
        {
            count=count+1;
        }
        n--;
    }
    cout<<count;
    return 0;
}