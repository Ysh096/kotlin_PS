class Solution02 {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer = 0
        absolutes.forEachIndexed { index, element ->
            if (signs[index]) {
                answer += element
            } else {
                answer -= element
            }
        }
        return answer
    }
}

fun main() {
    val absolutes = intArrayOf(4, 7, 12)
    val signs = booleanArrayOf(true, false, true)

    println(Solution02().solution(absolutes, signs))
}