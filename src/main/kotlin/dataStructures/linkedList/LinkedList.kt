package dataStructures.linkedList

class LinkedList<T : Any> {
    var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty() = size == 0

    override fun toString(): String {
        return if (isEmpty()) {
            "Empty list"
        } else {
            head.toString()
        }
    }

    /**
     * This function is used to add a new element to the beginning of the list.
     * It creates a new node with the given value and assigns it to the head of the list.
     * If the list was empty (tail is null), it also assigns the new node to the tail.
     * Finally, it increments the size of the list by one.
     *
     * @param value The value to be added to the list.
     */
    fun push(value: T) {
        head = Node(value = value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
    }

    /**
     * This function is used to iterate over the elements of the linked list.
     * It starts from the head of the list and traverses through each node, printing the value of each node.
     * The iteration continues until it reaches a node that doesn't have a next node (i.e., the end of the list).
     */
    fun iterate() {
        var currentNode = head
        while (currentNode != null) {
            print("${currentNode.value} ")
            currentNode = currentNode.next
        }
    }
}