package solutions_2026

class IntersectionOfTwoLinkedLists {

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    /**
     * Example:
     * var li = ListNode(5)
     * var v = li.`val`
     * Definition for singly-linked list.
     * class ListNode(var `val`: Int) {
     *     var next: ListNode? = null
     * }
     */

    val nodes = mutableMapOf<ListNode, Int>()

    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        headA?.let { goTroughNodeAndPutToMap(it) }
        return headB?.let { goTroughNodeAndPutToMap(it) }
    }

    private fun goTroughNodeAndPutToMap(node: ListNode): ListNode? {
        if (nodes[node] != null) return node

        nodes[node] = 1
        return node.next?.let { next -> goTroughNodeAndPutToMap(next) }
    }

}