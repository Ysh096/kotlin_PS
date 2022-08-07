class Solution04 {
    fun solution(a: IntArray, b: IntArray): Int {
        var answer = 0
        a.forEachIndexed { idx, i ->
            answer += i * b[idx]
        }
        return answer
    }

    fun solutionZip(a: IntArray, b: IntArray): Int {
        return a.zip(b).sumOf { it.first * it.second }
    }
}

fun main() {
    val inputA1 = intArrayOf(1,2,3,4)
    val inputB1 = intArrayOf(-3,-1,0,2)
    val inputA2 = intArrayOf(-1,0,1)
    val inputB2 = intArrayOf(1,0,-1)

    println(Solution04().solution(inputA1, inputB1))
    println(Solution04().solution(inputA2, inputB2))

    Solution04().solutionZip(inputA1, inputB1)
}