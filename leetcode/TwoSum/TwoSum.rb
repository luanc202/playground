# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum(nums, target)
  indices = []
  map = {}
  i = 0
  nums.each do |e|
      map[i] = e
      i+=1
  end

  map.each do |k, v|
  diff = target - v
      if map.value?(diff) && map.key(diff) != k
          indices = [k, map.key(diff)]
          break
      end
  end
  indices
end
