
/**
 * This class models a linked list in which each node has a pointer
 * to the node after it, except the tail which does not have a node after.
 * @author rkelley/njohnson/shand
 * Programming Project 1 Start Project
 * CS131ON
 */
public class GenericLinkedList<T> {

	private GenericNode head; //generic node to represent the head of the list
	private GenericNode tail; //generic node to represent the tail (end) of the list
	private int length; //variable to keep track of the number of elements in the list
	
	/**
	 * The constructor for this object initializes the list such that
	 * it is empty (no head or tail) generic node.
	 */
	public GenericLinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}//end empty-argument constructor
	
	/**
	 * Method to see if there are any elements in the list.
	 * @return boolean true/false
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}//end isEmpty
	
	/**
	 * This method returns the head generic node of the list from which
	 * you can traverse the entire by following generic node links.
	 * @return
	 */
	public GenericNode getGenericList()
	{
		return head;
	}//end getList
	
	/**
	 * This method adds a new generic node to the list. It first checks to see
	 * if the list is empty. If so, it sets the head and the tail nodes
	 * to the node passed in. If the list is not empty it places the node
	 * at the end of the list and updates the pointers in the tail. This
	 * implementation does not support adding entries to the middle
	 * of the list.
	 * @param aNode
	 */
	public void addGenericNode(GenericNode aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		
		tail.setGenericNextNode(aNode);
		tail=tail.getGenericNextNode();
		tail.setGenericNextNode(null);
		length++;
		
	}//end addGenericNode

}//end class

