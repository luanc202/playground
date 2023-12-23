func isPalindrome(x int) bool {
	numberAsString := strconv.Itoa(x)
	var invertedNumberString string
	for i := len(numberAsString) - 1; i >= 0; i-- {
		invertedNumberString += string(numberAsString[i])
	}
	return (invertedNumberString == numberAsString)
}