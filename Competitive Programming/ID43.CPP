#include <iostream>
using namespace std;
int main()
{
    
string s;
string t;

cin>>s;
cin>>t;

if(s.size() != t.size())
{
    cout<<"NO";
    return 0;
}
int p1=s.size()-1;
int p2=0;

while(p1>=0 && p2<=s.size())
{
    if(s[p1] != t[p2])
    {
        cout<<"NO";
        return 0;
    }
    p1--;
    p2++;
}

cout<<"YES";

    return 0;
}