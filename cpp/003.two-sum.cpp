#include <vector>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        for (int i=0;i<sizeof(nums);i++){
            for(int j=i+1;j<sizeof(nums);j++){
                if(target == nums[i] + nums[j]){
                    std::vector<int> res = {i,j};
                    return res;
                }
            }
        }
    }
};