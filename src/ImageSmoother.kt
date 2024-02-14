class ImageSmoother {

    //todo! not solved

//    private var result = mutableListOf<IntArray>()
//
//    fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
//
//        img.forEachIndexed {index, array ->
//
//            val tmpList = mutableListOf<Int>()
//
//            array.forEachIndexed {innerIndex, x ->
//
//                var arraysForCalculation = mutableListOf<IntArray>()
//                var considerableArrays = mutableListOf<IntArray>()
//
//                considerableArrays.add(array)
//
//                if (index == 0) {
//                    considerableArrays.add(img[index + 1])
//
//                } else if (index == img.lastIndex) {
//                    considerableArrays.add(img[index - 1])
//                } else {
//                    considerableArrays.add(img[index + 1])
//                    considerableArrays.add(img[index - 1])
//                }
//
//                if (innerIndex == 0) {
//                        arraysForCalculation.addAll(array.copyOfRange(0, 1).toList())
//                } else if (innerIndex == array.lastIndex) {
//                    arraysForCalculation.addAll(it.subArray(innerIndex - 1, innerIndex))
//                } else {
//                    arraysForCalculation.addAll(it.subArray(innerIndex - 1, innerIndex + 1))
//                }
//
//                tmpList.add(calculateAvarage(arraysForCalculation.toTypedArray()))
//
//            }
//
//            result.add(tmpList)
//
//        }
//
//        return result
//    }
//
//    private fun calculateAvarage(array: Array<IntArray>): Int {
//        var elements = 0
//        var sum = 0
//
//        array.forEach {
//            it.forEach { number ->
//                elements++
//                sum += number
//            }
//        }
//
//        return sum / elements
//    }
}