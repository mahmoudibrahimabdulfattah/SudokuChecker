import kotlin.math.sqrt

fun isSudokuValid(board: Array<Array<Char>>): Boolean {
    val size = board.size

    // Check Board Size should 4x4 or 9x9 or 16x16
    if (size != 4 && size != 9 && size != 16) {
        return false
    }

    // Check box is Square (rows = columns)
    for (row in board) {
        if (row.size != size) {
            return false
        }
    }

    val boxSize = sqrt(size.toDouble()).toInt()

    // Check for invalid characters (only numbers or dash)
    for (row in 0 until size) {
        for (col in 0 until size) {
            val current = board[row][col]

            // Check Valid Letter
            if (current != '-' && !(current.isDigit() && current.toString().toInt() in 1..size) && current !in 'A'..'G') {
                return false
            }
        }
    }

    // Check rows and columns simultaneously
    for (i in 0 until size) {
        val rowSeen = mutableSetOf<Char>()
        val colSeen = mutableSetOf<Char>()

        for (j in 0 until size) {
            // Check row
            val rowVal = board[i][j]
            if (rowVal != '-' && !rowSeen.add(rowVal)) {
                return false
            }

            // Check column
            val colVal = board[j][i]
            if (colVal != '-' && !colSeen.add(colVal)) {
                return false
            }
        }
    }

    // Check subgrids
    for (boxRow in 0 until size step boxSize) {
        for (boxCol in 0 until size step boxSize) {
            val seen = mutableSetOf<Char>()

            // Check Every Cell in Box
            for (row in boxRow until boxRow + boxSize) {
                for (col in boxCol until boxCol + boxSize) {
                    val current = board[row][col]
                    if (current != '-' && !seen.add(current)) {
                        return false
                    }
                }
            }
        }
    }

    // If all checks passed, the board is valid
    return true
}