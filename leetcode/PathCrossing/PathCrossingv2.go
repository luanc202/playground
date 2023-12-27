func isPathCrossing(path string) bool {
	var visitedPaths [][]int
	visitedPaths = append(visitedPaths, []int{0, 0})

	for i := 0; i < len(path); i++ {
		if path[i] == 'N' {
			visitedPaths = append(visitedPaths, []int{visitedPaths[i][0] + 1, visitedPaths[i][1]})
		} else if path[i] == 'S' {
			visitedPaths = append(visitedPaths, []int{visitedPaths[i][0] - 1, visitedPaths[i][1]})
		} else if path[i] == 'E' {
			visitedPaths = append(visitedPaths, []int{visitedPaths[i][0], visitedPaths[i][1] + 1})
		} else {
			visitedPaths = append(visitedPaths, []int{visitedPaths[i][0], visitedPaths[i][1] - 1})
		}
	}

	for i := 0; i < len(visitedPaths)-1; i++ {
		currentPos := visitedPaths[i]
		for j := i + 1; j < len(visitedPaths); j++ {
			otherPos := visitedPaths[j]
			if currentPos[0] == otherPos[0] && currentPos[1] == otherPos[1] {
				return true
			}
		}
	}

	return false
}