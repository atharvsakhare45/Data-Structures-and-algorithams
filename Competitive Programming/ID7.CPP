#include <iostream>
using namespace std;

int main()
{
  string s;
  cin>>s;
  int lower=0;
  int upper=0;
  for(int i=0;i<s.size();i++)
  {
      if(s[i] >= 65 && s[i]<=90)
      {
          upper++;
      }
      else{
          lower++;
      }
  }
  
  if(lower < upper)
  {
      for(int i=0;i<s.size();i++)
      {
           if(s[i] >= 97 && s[i]<= 122)
           {
               s[i] = s[i] - 32;
           }
      }
  }
  
  if(upper <= lower )
  {
      for(int i=0;i<s.size();i++)
      {
          if(s[i] >= 65 && s[i]<=90)
          {
              s[i] = s[i] + 32;
          }
          
      }
  }
  
  cout<<s;
  

    return 0;
}