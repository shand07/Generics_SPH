
public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		GenericLinkedList myGenericList = new GenericLinkedList();
		
		GenericNode genericNode = new GenericNode();
		genericNode.setData(1);
		myGenericList.addGenericNode(genericNode);
		genericNode = new GenericNode();
		genericNode.setData(2.0);
		myGenericList.addGenericNode(genericNode);
		genericNode = new GenericNode();
		genericNode.setData("Data");
		myGenericList.addGenericNode(genericNode);
		
		GenericNode generictempnode=myGenericList.getGenericList();
		do 
		{
			System.out.println(generictempnode.getData());
			generictempnode=generictempnode.getGenericNextNode();
		} while (generictempnode!=null);
		

	}//end main

}//end class
