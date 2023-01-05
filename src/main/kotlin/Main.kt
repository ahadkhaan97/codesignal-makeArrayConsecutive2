fun main() {
    print(solution(mutableListOf(6, 2, 3, 8)))
}

//iterative approach
fun solution(statues: MutableList<Int>): Int {
    statues.sort()
    var statuesToBeAdded = 0
    for (i in 1 until statues.size) {
        if (statues[i] - statues[i - 1] > 1) {
            statuesToBeAdded += statues[i] - statues[i - 1] - 1
        }
    }

    return statuesToBeAdded
}

//formula driven approach
fun solution2(statues: MutableList<Int>): Int {
    return statues.maxOrNull()!! - (statues.minOrNull()!! - 1) - statues.size
}