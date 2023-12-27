func isPathCrossing(path string) bool {
	visitedPositions := make(map[int]map[int]bool)
	currentX := 0
	currentY := 0
	visitedPositions[0] = make(map[int]bool)
	visitedPositions[0][0] = true

	for _, move := range path {
		switch move {
		case 'N':
			currentY++
		case 'S':
			currentY--
		case 'E':
			currentX++
		case 'W':
			currentX--
		}
		if _, ok := visitedPositions[currentX]; !ok {
			visitedPositions[currentX] = make(map[int]bool)
		}
		if visitedPositions[currentX][currentY] == true {
			return true
		}
		visitedPositions[currentX][currentY] = true
	}

	return false
}