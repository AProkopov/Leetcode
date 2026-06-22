package solutions_2026

import kotlin.collections.mutableListOf

// TODO needs work (not completed)
class IfPathExistsInGraph {
    fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {
        if (source == destination) return true
        val map = hashMapOf<Int, MutableList<Int>>()

        for ((a, b) in edges) {
            map.getOrPut(a) { mutableListOf() }.add(b)
            map.getOrPut(b) { mutableListOf() }.add(a)
        }

        return map[source]?.contains(destination) ?: false
    }
}

//[[4,3],[1,4],[4,8],[1,7],[6,4],[4,2],[7,4],[4,0],[0,9],[5,4]]
//n = 10
//source = 5
//destination = 9