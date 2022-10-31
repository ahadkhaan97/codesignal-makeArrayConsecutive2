fun main() {
    print(solution(mutableListOf(6, 2, 3, 8)))
}

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