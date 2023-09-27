package dataStructures.linkedList

fun main() {
    val linkedList = LinkedList<Int>()
    linkedList.apply {
        push(1)
        push(2)
        push(3)
    }.also {
        it.iterate()
    }
}