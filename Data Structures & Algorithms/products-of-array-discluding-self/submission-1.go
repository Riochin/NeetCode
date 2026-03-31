func productExceptSelf(nums []int) []int {
    l := len(nums)
    res := make([]int, l)

    // 左側の積（prefix）を res に入れる
    prefix := 1
    for i := 0; i < l; i++{
        res[i] = prefix
        prefix *= nums[i]
    }

    // 右側の積（suffix）を掛け合わせる
    suffix := 1
    for i := l -1; i >=0; i--{
        res[i] *= suffix
        suffix *= nums[i]
    }
    
    return res
}
