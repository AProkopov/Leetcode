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

    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        var a = headA
        var b = headB

        while (a != b) {
            a = if (a != null) a.next else headB
            b = if (b != null) b.next else headA
        }

        return a
    }


    val nodes = mutableMapOf<ListNode, Int>()

    fun getIntersectionNodeSlow(headA: ListNode?, headB: ListNode?): ListNode? {
        headA?.let { goTroughNodeAndPutToMap(it) }
        return headB?.let { goTroughNodeAndPutToMap(it) }
    }

    private fun goTroughNodeAndPutToMap(node: ListNode): ListNode? {
        if (nodes[node] != null) return node

        nodes[node] = 1
        return node.next?.let { next -> goTroughNodeAndPutToMap(next) }
    }

}