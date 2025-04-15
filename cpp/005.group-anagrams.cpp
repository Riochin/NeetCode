#include <iostream>
#include <vector>
#include <string>
#include <unordered_map>
#include <algorithm>
using namespace std;

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> anagramGroups;

        for (string s : strs) {
            string sortedStr = s;
            sort(sortedStr.begin(), sortedStr.end()); // 文字列をソート
            anagramGroups[sortedStr].push_back(s);   // ソートした文字列をキーに追加
        }

        vector<vector<string>> result;
        for (auto& pair : anagramGroups) {
            result.push_back(pair.second); // グループ化されたアナグラムを結果に追加
        }

        return result;
    }
};

int main() {
    Solution solution;
    vector<string> strs = {"act", "pots", "tops", "cat", "stop", "hat"};
    vector<vector<string>> result = solution.groupAnagrams(strs);

    for (const auto& group : result) {
        cout << "[";
        for (const auto& word : group) {
            cout << word << " ";
        }
        cout << "]" << endl;
    }

    return 0;
}