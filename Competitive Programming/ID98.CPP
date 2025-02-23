#include <bits/stdc++.h>
using namespace std;
int main()
{
    
int n;
cin>>n;
vector<int>a(n);
vector<int>b(n);
for(int i=0;i<n;i++)
{
    cin>>a[i];
}

for(int i=0;i<n;i++)
{
   b[i]=a[i]; 
}

sort(b.begin(),b.end());

int l=0;
int r=n-1;

while(l<n && a[l]==b[l])
{
    l++;
}

while(r>=0 && a[r]==b[r])
{
    r--;
}

if(l>=r)
{
    cout<<"yes"<<endl;
    cout<<1<<" "<<1;
    return 0;
}

reverse(a.begin()+l,a.begin()+r+1);

if(a==b)
{
    cout<<"yes"<<endl;
    cout<<l+1<<" "<<r+1;
    
}
else
{
    cout<<"no";
}
    return 0;
}