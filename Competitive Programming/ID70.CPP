#include <bits/stdc++.h>
using namespace std;
int main()
{ 
string s1;
cin>>s1;

string s2;
cin>>s2;

if(s1.size() != s2.size())
{                          //if size is not same.
    cout<<"NO";
    return 0;
}

vector<int> ans;

for(int i=0;i<s1.size();i++)
{
    if(s1[i] != s2[i])   // finding the mismatch index
    {
        ans.push_back(i);
    }
}

if(ans.size() == 0)  // already same 
{
    cout<<"YES";
    return 0;      
}
if(ans.size()==2)
{
int i=ans[0];
int j=ans[1];

if(s1[i]==s2[j] && s1[j]==s2[i]) // checking that mismatch index element are same or not
{
    cout<<"YES";
    return 0;
}

}

cout<<"NO";

    return 0;
}