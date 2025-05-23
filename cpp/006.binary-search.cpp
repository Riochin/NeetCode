using namespace std;
#include <iostream>
#include <vector>

class Solution {
    public:
        int search(vector<int>& nums, int target) {
            int l = 0;
            int r = nums.size();
            // cout << l << r;
    
            while(l <= r){
                int m = (l+r)/2;
                if(nums[m] == target){
                    return m;
                } else if(target > nums[m]){
                    l = m+1;
                } else {
                    r = m-1;
                }  
            }
            
            return -1;
        }
    };
    