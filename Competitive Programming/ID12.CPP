#include <iostream>
using namespace std;

int main() {
    string s1, s2;
    cin >> s1 >> s2;

    for (size_t i = 0; i < s1.size(); i++) {
        cout << (s1[i] != s2[i]); 
    }
    
    return 0;
}