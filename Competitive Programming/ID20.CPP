#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    cin>>s;
    
    vector<int> result;
    
    for(char c: s)
    {
        if(c != '+')
        {
            result.push_back(c-'0');
        }
    }
    sort(result.begin(),result.end());
    
    for(int i=0;i<result.size();i++)
    {
        if(i>0)
        {
            cout<<"+";
        }
        cout<<result[i];
    }

    return 0;
}