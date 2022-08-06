class Solution {
    fun solution(numbers: IntArray): Int {
        return 45 - numbers.sum()
    }

}

fun main() {
    // https://school.programmers.co.kr/learn/courses/30/lessons/86051?language=kotlin
    val numbers = intArrayOf(1,2,3,4,6,7,8,0)
    println(Solution().solution(numbers))
}