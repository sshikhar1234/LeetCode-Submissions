# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
    search = Hash.new
    nums.each_with_index do |num,ind| 
        i = search[target-num]
        return [i,ind] if i
        search[num] = ind
    end
end

