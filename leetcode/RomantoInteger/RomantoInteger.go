func romanToInt(s string) int {
	romanToIntMap := map[string]int{
		"I": 1,
		"V": 5,
		"X": 10,
		"L": 50,
		"C": 100,
		"D": 500,
		"M": 1000,
	}

	if len(s) == 1 {
		return romanToIntMap[s]
	}

	numberAsInt := 0

	for i := 0; i < len(s)-1; i++ {
		currentNumeral := romanToIntMap[string(s[i])]
		nextNumeral := romanToIntMap[string(s[i+1])]
		if currentNumeral >= nextNumeral {
			numberAsInt += currentNumeral
		} else {
			numberAsInt -= currentNumeral
		}
		if i == len(s)-2 {
			numberAsInt += nextNumeral
			return numberAsInt
		}
	}
	return numberAsInt
}