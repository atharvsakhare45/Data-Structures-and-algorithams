#include <iostream>
using namespace std;
int main()
{
   string s;
   cin>>s;
   
   int arr[26]={0};
   int count=0;
   for(int i=0;i<s.size();i++)
   {
       if(arr[s[i]-97]!=1)
       {
          arr[s[i]-97]=1; 
          count++;
       }
   }
   
 if(count%2==0)
 {
     cout<<"CHAT WITH HER!";
 }
 else
 {
     cout<<"IGNORE HIM!";
 }

    return 0;
}