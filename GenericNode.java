

/**
 * This class models a Node object which contains Strings. Each
 * node has its internal data (a String) and pointers to the next 
 * node in the list.
 * 
 * @author rkelley/njohnson/shand
 * Programming Project 1 Start Project
 * CS131ON
 */
public class GenericNode<T> {
	
	private T data;  //data that the object stores
	private GenericNode nextGenericNode; //pointer to the nextNode that will be in LinkedList
	
	/**
	 * Constructor build GenericNode object. Initializes nextGenericNode and data
	 * to null.
	 */
	public GenericNode()
	{
		setGenericNextNode(null);
		data=null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the data of the object.
	 * @param data
	 */
	public void setData(T data) {
		this.data=data;
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return String (data)
	 */
	public T getData() {
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return
	 */
	public GenericNode getNode() {
		return this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next genericnode.
	 * @param nextNode
	 */
	public void setGenericNextNode(GenericNode nextGenericNode)
	{
		this.nextGenericNode=nextGenericNode;
	}//end setNextNode
	
	/**
	 * This method returns the genericnode stored in the next genericnode pointer.
	 * @return Node object
	 */
	public GenericNode getGenericNextNode() {
		return nextGenericNode;
	}//end getNextNode
	
}//end class

