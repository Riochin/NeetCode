#include <iostream>
#include <vector>
#include <cctype>
using namespace std;

class Solution {
public:
    bool isPalindrome(string s) {
        vector<char> chars;
        for(char c :s){
            if(isalnum(c)){
                chars.push_back(tolower(c));
            }
        }

        for(int i=0;i<chars.size()/2;i++){
            if(chars[i] != chars[chars.size()-i-1]) return false;
        }

        return true;
    }
};