fun main(){

    //Valid Board 9x9
    val validBoard9x9 = arrayOf(
        arrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
        arrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        arrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
        arrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        arrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        arrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        arrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
        arrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        arrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )
    test("Valid 9x9 Board", isSudokuValid(validBoard9x9), true)

    // Invalid Row Board with number 3
    val invalidRowBoard9x9 = arrayOf(
        arrayOf('5', '3', '3', '-', '7', '-', '-', '-', '-'),
        arrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        arrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
        arrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        arrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        arrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        arrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
        arrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        arrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )
    test("Invalid Row in 9x9 Board", isSudokuValid(invalidRowBoard9x9), false)

    // Invalid Column Board with number 5
    val invalidColBoard9x9 = arrayOf(
        arrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
        arrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        arrayOf('5', '9', '8', '-', '-', '-', '-', '6', '-'),
        arrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        arrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        arrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        arrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
        arrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        arrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )
    test("Invalid Column in 9x9 Board", isSudokuValid(invalidColBoard9x9), false)

    // Invalid Box Board with number 5
    val invalidBoxBoard9x9 = arrayOf(
        arrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
        arrayOf('6', '5', '-', '1', '9', '5', '-', '-', '-'),
        arrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
        arrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        arrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        arrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        arrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
        arrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        arrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )
    test("Invalid Box in 9x9 Board", isSudokuValid(invalidBoxBoard9x9), false)

    //valid Board 4x4
    val validBoard4x4 = arrayOf(
        arrayOf('1', '2', '3', '4'),
        arrayOf('3', '4', '1', '2'),
        arrayOf('2', '1', '4', '3'),
        arrayOf('4', '3', '2', '1')
    )
    test("Valid 4x4 Board", isSudokuValid(validBoard4x4), true)

    //Invalid Row Board 4x4 with number 4
    val invalidBoard4x4 = arrayOf(
        arrayOf('1', '2', '3', '4'),
        arrayOf('3', '4', '1', '2'),
        arrayOf('2', '1', '4', '4'),
        arrayOf('4', '3', '2', '1')
    )
    test("Invalid 4x4 Board", isSudokuValid(invalidBoard4x4), false)

    //valid Board with Empty
    val emptyBoard = arrayOf(
        arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
        arrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-')
    )
    test("Empty Board", isSudokuValid(emptyBoard), true)

    // Invalid Board with number Letter a
    val boardWithLetter = arrayOf(
        arrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
        arrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        arrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
        arrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        arrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        arrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        arrayOf('-', '6', '-', '-', 'a', '-', '2', '8', '-'),
        arrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        arrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )
    test("Board with Letter", isSudokuValid(boardWithLetter), false)

    // Invalid Board with SpecialChar *
    val boardWithSpecialChar = arrayOf(
        arrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
        arrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        arrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
        arrayOf('8', '-', '-', '*', '6', '-', '-', '-', '3'),
        arrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        arrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
        arrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
        arrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        arrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )
    test("Board with Special Character", isSudokuValid(boardWithSpecialChar), false)

    // Invalid Board with 0
    val boardWithZero = arrayOf(
        arrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
        arrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
        arrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
        arrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
        arrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
        arrayOf('7', '-', '0', '-', '2', '-', '-', '-', '6'),
        arrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
        arrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
        arrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
    )
    test("Board with Zero", isSudokuValid(boardWithZero), false)

    // Valid Board 16x16
    val validBoard16x16 = arrayOf(
        arrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G'),
        arrayOf('5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4'),
        arrayOf('9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8'),
        arrayOf('D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C'),
        arrayOf('2', '1', '4', '3', '6', '5', '8', '7', 'A', '9', 'C', 'B', 'E', 'D', 'G', 'F'),
        arrayOf('6', '5', '8', '7', 'A', '9', 'C', 'B', 'E', 'D', 'G', 'F', '2', '1', '4', '3'),
        arrayOf('A', '9', 'C', 'B', 'E', 'D', 'G', 'F', '2', '1', '4', '3', '6', '5', '8', '7'),
        arrayOf('E', 'D', 'G', 'F', '2', '1', '4', '3', '6', '5', '8', '7', 'A', '9', 'C', 'B'),
        arrayOf('3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E'),
        arrayOf('7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2'),
        arrayOf('B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6'),
        arrayOf('F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A'),
        arrayOf('4', '3', '2', '1', '8', '7', '6', '5', 'C', 'B', 'A', '9', 'G', 'F', 'E', 'D'),
        arrayOf('8', '7', '6', '5', 'C', 'B', 'A', '9', 'G', 'F', 'E', 'D', '4', '3', '2', '1'),
        arrayOf('C', 'B', 'A', '9', 'G', 'F', 'E', 'D', '4', '3', '2', '1', '8', '7', '6', '5'),
        arrayOf('G', 'F', 'E', 'D', '4', '3', '2', '1', '8', '7', '6', '5', 'C', 'B', 'A', '9')
    )
    test("Valid 16x16 Board", isSudokuValid(validBoard16x16), true)

    // Invalid Board 16x16 (has repeated character 'A' in first row)
    val invalidBoard16x16 = arrayOf(
        arrayOf('1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'A', 'G'), // حرف A مكرر
        arrayOf('5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4'),
        arrayOf('9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8'),
        arrayOf('D', 'E', 'F', 'G', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C'),
        arrayOf('2', '1', '4', '3', '6', '5', '8', '7', 'A', '9', 'C', 'B', 'E', 'D', 'G', 'F'),
        arrayOf('6', '5', '8', '7', 'A', '9', 'C', 'B', 'E', 'D', 'G', 'F', '2', '1', '4', '3'),
        arrayOf('A', '9', 'C', 'B', 'E', 'D', 'G', 'F', '2', '1', '4', '3', '6', '5', '8', '7'),
        arrayOf('E', 'D', 'G', 'F', '2', '1', '4', '3', '6', '5', '8', '7', 'A', '9', 'C', 'B'),
        arrayOf('3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E'),
        arrayOf('7', '8', '5', '6', 'B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2'),
        arrayOf('B', 'C', '9', 'A', 'F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6'),
        arrayOf('F', 'G', 'D', 'E', '3', '4', '1', '2', '7', '8', '5', '6', 'B', 'C', '9', 'A'),
        arrayOf('4', '3', '2', '1', '8', '7', '6', '5', 'C', 'B', 'A', '9', 'G', 'F', 'E', 'D'),
        arrayOf('8', '7', '6', '5', 'C', 'B', 'A', '9', 'G', 'F', 'E', 'D', '4', '3', '2', '1'),
        arrayOf('C', 'B', 'A', '9', 'G', 'F', 'E', 'D', '4', '3', '2', '1', '8', '7', '6', '5'),
        arrayOf('G', 'F', 'E', 'D', '4', '3', '2', '1', '8', '7', '6', '5', 'C', 'B', 'A', '9')
    )
    test("Invalid 16x16 Board Repeated character", isSudokuValid(invalidBoard16x16), false)


    // Invalid Board Size 5x5 (non-standard size)
    val invalidSizeBoard = arrayOf(
        arrayOf('1', '2', '3', '4', '5'),
        arrayOf('3', '4', '5', '1', '2'),
        arrayOf('5', '1', '2', '3', '4'),
        arrayOf('2', '3', '4', '5', '1'),
        arrayOf('4', '5', '1', '2', '3')
    )
    test("Invalid Board Size 5x5", isSudokuValid(invalidSizeBoard), false)
}


fun test(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("success - $name")
    } else {
        println("failed - $name")
    }
}