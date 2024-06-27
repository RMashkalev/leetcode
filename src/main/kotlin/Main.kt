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

//fun main(args: Array<String>) {
//    val tmp = Solution()
//    val array = intArrayOf(3,3)
//    val target = 6
//    val result = tmp.twoSum(array, target)
//    result.forEach {
//        println("$it ")
//    }
//}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1tmp = l1
        var l2tmp = l2
        var dummyHead = ListNode(0)
        var current = dummyHead
        var carry = 0

        while (l1tmp != null || l2tmp != null) {
            var sum = carry
            l1tmp?.let {
                sum += it.`val`
                l1tmp = it.next
            }

            l2tmp?.let {
                sum += it.`val`
                l2tmp = it.next
            }

            carry = sum / 10
            current.next = ListNode(sum % 10)
            current = current.next!!
        }

        if (carry > 0) {
            current.next = ListNode(carry)
        }

        return dummyHead.next
    }

    private fun findMaxSize(l1: ListNode?, l2: ListNode?): Int {
        var size = 1
        var l1tmp = l1
        var l2tmp = l2
        while (l1tmp?.next != null || l2tmp?.next != null) {
            size++
            if (l1tmp?.next != null) l1tmp = l1tmp.next
            if (l2tmp?.next != null) l2tmp = l2tmp.next
        }
        return size
    }

    fun print(l: ListNode?) {
        var lptr = l
        print("${lptr?.`val`} ")
        while (lptr?.next != null) {
            print("${lptr!!.next?.`val`} ")
            lptr = lptr.next
        }
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
//    val l1 = ListNode(3)
//    l1.next = ListNode(4)
//    l1.next!!.next = ListNode(2)
//
//    val l2 = ListNode(4)
//    l2.next = ListNode(6)
//    l2.next!!.next = ListNode(5)

    val l1 = ListNode(9)
    l1.next = ListNode(9)
    l1.next!!.next = ListNode(9)
    l1.next!!.next!!.next = ListNode(9)
    l1.next!!.next!!.next!!.next = ListNode(9)
    l1.next!!.next!!.next!!.next!!.next = ListNode(9)
    l1.next!!.next!!.next!!.next!!.next!!.next = ListNode(9)

    val l2 = ListNode(9)
    l2.next = ListNode(9)
    l2.next!!.next = ListNode(9)
    l2.next!!.next!!.next = ListNode(9)

    val l3 = solution.addTwoNumbers(l1, l2)
    solution.print(l3)
}