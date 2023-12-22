func twoSum(nums []int, target int) []int {
	numsComplementOfTargetMap := make(map[int]int)
	for index, element := range nums {
		numsComplementOfTargetMap[target-element] = index
	}

	for index, element := range nums {
		value, ok := numsComplementOfTargetMap[element]
		if ok && index != value {
			return []int{numsComplementOfTargetMap[element], index}
		}
	}
	return []int{}
}