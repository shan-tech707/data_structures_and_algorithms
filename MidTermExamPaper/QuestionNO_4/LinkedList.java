package mcs_3E.DSA.MidTermExamPaper.QuestionNO_4;

class LinkedList
{
	Node head; // head of list

	/* Function to swap Nodes x and y in linked list by
       changing links */
	public void swapNodes(int node1, int node2) {
		// Nothing to do if node1 and node2 are same
		if (node1 == node2) return;

		// Search for node1 (keep track of prevNode1 and CurrNode1)
		Node prevNode1 = null, currNod1 = head;
		while (currNod1 != null && currNod1.data != node1) {
			prevNode1 = currNod1;
			currNod1 = currNod1.next;
		}

		// Search for Node2 (keep track of prevNode2 and currNod2)
		Node prevNode2 = null, currNode2 = head;
		while (currNode2 != null && currNode2.data != node2) {
			prevNode2 = currNode2;
			currNode2 = currNode2.next;
		}

		// If either node1 or node2 is not present, nothing to do
		if (currNod1 == null || currNode2 == null)
			return;

		// If node1 is not head of linked list
		if (prevNode1 != null)
			prevNode1.next = currNode2;
		else //make node2 the new head
			head = currNode2;

		// If node2 is not head of linked list
		if (prevNode2 != null)
			prevNode2.next = currNod1;
		else // make node1 the new head
			head = currNod1;

		// Swap next pointers
		Node temp = currNod1.next;
		currNod1.next = currNode2.next;
		currNode2.next = temp;
	}

	/* Function to add Node at beginning of list. */
	public void push(int new_data) {
		/* 1. alloc the Node and put the data */
		Node new_Node = new Node(new_data);

		/* 2. Make next of new Node as head */
		new_Node.next = head;

		/* 3. Move the head to point to new Node */
		head = new_Node;
	}

	/* This function prints contents of linked list starting
       from the given Node */
	public void printList() {
		Node tNode = head;
		while (tNode != null)
		{
			System.out.print(tNode.data+" ");
			tNode = tNode.next;
		}
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();

        /* The constructed linked list is:
            1->2->3->4->5->6->7 */
		llist.push(7);
		llist.push(6);
		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);

		System.out.print("\n Linked list before calling swapNodes() ");
		llist.printList();

		llist.swapNodes(4, 3);

		System.out.print("\n Linked list after calling swapNodes() ");
		llist.printList();
	}
}