class IsomorphicStrings {

    companion object {

        fun isIsomorphic(s: String, t: String): Boolean {
            if (s.length != t.length) return false

            val sChars = s.toCharArray()
            val tChars = t.toCharArray()

            val sMap = mutableMapOf<Char, Char>()
            val tMap = mutableMapOf<Char, Char>()

            sChars.forEachIndexed { index, c ->

                if (!sMap.contains(c) && !tMap.contains(tChars.get(index))) {
                    sMap.put(c, tChars.get(index))
                    tMap.put(tChars.get(index), c)
                } else {
                    if (sMap.get(c) != tChars.get(index) || tMap.get(tChars.get(index)) != c) return false
                }


            }

            return true
        }


        }
        fun isIsomorphicN2(s: String, t: String): Boolean {

            if (s.length != t.length) return false

            val sChars = s.toCharArray()
            val tChars = t.toCharArray()

            val sMap = mutableMapOf<Char, MutableList<Int>>()
            val tMap = mutableMapOf<Char, MutableList<Int>>()

            sChars.forEachIndexed { index, c ->
                sMap.put(c, sMap.getOrDefault(c, mutableListOf()).also { list -> list.add(index) })
            }

            tChars.forEachIndexed { index, c ->
                tMap.put(c, tMap.getOrDefault(c, mutableListOf()).also { list -> list.add(index) })
            }

            sChars.forEachIndexed { index, c ->
                val sCharList = sMap.get(c)!!
                val tCharList = tMap.get(tChars.get(index))!!

                if (sCharList.size != tCharList.size) return false

                sCharList.forEachIndexed { innerIndex, i ->
                    if (i - tCharList.get(innerIndex) != 0) return false
                }
            }

            return true
        }

    }
}