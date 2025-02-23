#include <iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    
  int arr[7];
  for(int i=0;i<7;i++)
  {
      cin>>arr[i];
  }
  int sum=0;
  int i=0;
  while(sum<n)
  {   if(i==7)
       {
         i=0;
       }
      sum=sum+arr[i];
      
      i++;
  }
  cout<<i;

    return 0;
}