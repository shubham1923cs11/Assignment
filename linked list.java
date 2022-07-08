public class Main
{
  
public Node head = null;
  
class Node
  {
    
private int data;
     
private Node next;
     
public Node (int data)
    {
      
this.data = data;
      
this.next = null;
  
} 
} 
public void addNodeAtTheBeginning (int data)
  {
    
System.out.println ("Add a node with data " + data +
			 " in the beginning.");
    
Node newNode = new Node (data);
    
if (this.head == null)
      {
	
this.head = newNode;
      
}
    else
      {
	
newNode.next = this.head;
	
this.head = newNode;
      
}
  
}
  
public void addNodeAtTheEnd (int data)
  {
    
System.out.println ("Add a node with data " + data + " at the end.");
    
Node newNode = new Node (data);
    
if (this.head == null)
      {
	
this.head = newNode;
      
}
    else
      {
	
Node cur = this.head;
	
while (cur.next != null)
	  {
	    
cur = cur.next;
	  
}
	
cur.next = newNode;
      
}
  
}
  
public void add (int position, int data)
  {
    
System.out.println ("Add a node with data " + data +
			 " at the position " + position);
    
 
Node newNode = new Node (data);
    
 
 
Node cur = this.head, prev = this.head;
    
 
if (position == 1)
      {
	
 
newNode.next = head;
	
 
this.head = newNode;
	
return;
      
}
    
 
 
while (cur.next != null && --position > 0)
      {
	
 
prev = cur;
	
cur = cur.next;
      
}
    
 
prev.next = newNode;
    
 
newNode.next = cur;
  
}
  
 
public void print ()
  {
    
if (this.head == null)
      {
	
System.out.println ("The List is empty.");
      
}
    else
      {
	
System.out.println ("The contents of the Singly Linked List are : ");
	
Node cur = this.head;
	
while (cur != null)
	  {
	    
System.out.print (cur.data + " -> ");
	    
cur = cur.next;
	  
}
	
System.out.println ("NULL\n");
      
}
  
}
  
 
public static void main (String[]args)
  {
    
Main list = new Main ();
    
System.out.println ("Created a singly linked list .....");
    
list.print ();
    
list.addNodeAtTheBeginning (100);
    
list.print ();
    
list.addNodeAtTheBeginning (200);
    
list.print ();
    
list.addNodeAtTheEnd (900);
    
list.print ();
    
list.addNodeAtTheEnd (800);
    
list.print ();
    
list.add (1, 150);
    
list.print ();
    
list.add (4, 250);
    
list.print ();
    
list.add (6, 250);
    
list.print ();

} 
}
