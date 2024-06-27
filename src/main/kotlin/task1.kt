//class Solution {
//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        val result = mutableMapOf<Int, Int>()
//        nums.mapIndexed { index, value ->
//            if (target - value in result) return intArrayOf(result.getValue(target - value), index)
//            result.put(value, index)
//        }
//        return intArrayOf()
//    }
//}
//
//fun main(args: Array<String>) {
//    val tmp = Solution()
//    val array = intArrayOf(3,3)
//    val target = 6
//    val result = tmp.twoSum(array, target)
//    result.forEach {
//        println("$it ")
//    }
//}