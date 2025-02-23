#include <iostream>
using namespace std;
int main()
{
   int n;
   cin>>n;
   
  int m;
  cin>>m;
 
  for(int i=n+1;i<=m;i++)
  {
      int count=0; 
  for(int j=1;j<=i;j++)
  {
      if(i%j==0)
      {
          count++;
      }
      
  }
  if(count==2)
  {  
      if(i==m)
  {
      cout<<"YES"; 
     return 0;
  }
  else
  {
      cout<<"NO";
      return 0;
  }
     
  }
 
  }
  cout<<"NO";
    return 0;
}