package solutions_2026

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun sortedArrayToBST(nums: IntArray): TreeNode? {
    return build(nums, 0, nums.lastIndex)
}

private fun build(nums: IntArray, left: Int, right: Int): TreeNode? {
    if (left > right) return null
    val mid = (left + right) / 2
    val node = TreeNode(nums[mid])
    node.left = build(nums, left, mid - 1)
    node.right = build(nums, mid + 1, right)

    return node
}