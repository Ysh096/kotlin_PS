class Solution03 {
    fun solution(s: String): Int {
        val dict = mapOf<String, String>(
            "zero" to "0",
            "one" to "1",
            "two" to "2",
            "three" to "3",
            "four" to "4",
            "five" to "5",
            "six" to "6",
            "seven" to "7",
            "eight" to "8",
            "nine" to "9",
        )
        var answer = s
        dict.forEach {
            answer = answer.replace(it.key, it.value)
        }
        return answer.toInt()
    }
}

fun main() {
    val input1 = "one4seveneight" // 1478
    val input2 = "23four5six7" // 234567
    val input3 = "2three45sixseven" // 234567
    val input4 = "123" // 123

    println(Solution03().solution(input1))
    println(Solution03().solution(input2))
    println(Solution03().solution(input3))
    println(Solution03().solution(input4))
}