func isPathCrossing(path string) bool {
	type Coordinate struct {
		X int
		Y int
	}
	var visitedPaths []Coordinate
	visitedPaths = append(visitedPaths, Coordinate{X: 0, Y: 0})

	pathMoves := map[string]Coordinate{
		"N": Coordinate{X: 1, Y: 0},
		"S": Coordinate{X: -1, Y: 0},
		"E": Coordinate{X: 0, Y: 1},
		"W": Coordinate{X: 0, Y: -1},
	}

	for i := 0; i < len(path); i++ {
		visitedPaths = append(visitedPaths, Coordinate{
			X: visitedPaths[i].X + pathMoves[string(path[i])].X,
			Y: visitedPaths[i].Y + pathMoves[string(path[i])].Y,
		})
	}

	for i := 0; i < len(visitedPaths)-1; i++ {
		currentPos := visitedPaths[i]
		for j := i + 1; j < len(visitedPaths); j++ {
			otherPos := visitedPaths[j]
			if currentPos.X == otherPos.X && currentPos.Y == otherPos.Y {
				return true
			}
		}
	}

	return false
}