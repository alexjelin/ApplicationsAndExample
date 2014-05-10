// Fig. 17.3: List.java
// ListNode and List class definitions.
package listimp;
// class to represent one node in a list
class ListNode<E>
{
   // package access members; List can access these directly
 E data; // data for this node
   ListNode nextNode; // reference to the next node in the list

   // constructor creates a ListNode that refers to object
   ListNode( E object ) 
   { 
      this( object, null ); 
   } // end ListNode one-argument constructor 

   // constructor creates ListNode that refers to 
   // Object and to next ListNode
   ListNode( E object, ListNode node )
   {
      data = object;    
      nextNode = node;  
   } // end ListNode two-argument constructor

   // return reference to data in node
   Object getObject() 
   { 
      return data; // return Object in this node
   } // end method getObject

   // return reference to next node in list
   ListNode getNext() 
   { 
      return nextNode; // get next node
   } // end method getNext
} // end class ListNode

// class List definition
public class List<E>
{
   private ListNode firstNode;
   private ListNode lastNode;
   private String name; // string like "list" used in printing

   // constructor creates empty List with "list" as the name
   public List() 
   { 
      this( "list" ); 
   } // end List no-argument constructor

   // constructor creates an empty List with a name
   public List( String listName )
   {
      name = listName;
      firstNode = lastNode = null;
   } // end List one-argument constructor

   // insert Object at front of List
   public void insertAtFront( E insertItem )
   {
      if ( isEmpty() ) // firstNode and lastNode refer to same object
         firstNode = lastNode = new ListNode( insertItem );
      else // firstNode refers to new node
         firstNode = new ListNode( insertItem, firstNode );
   } // end method insertAtFront

   // insert Object at end of List
   public void insertAtBack( E insertItem )
   {
      if ( isEmpty() ) // firstNode and lastNode refer to same Object
         firstNode = lastNode = new ListNode( insertItem );
      else // lastNode's nextNode refers to new node
         lastNode = lastNode.nextNode = new ListNode( insertItem );
   } // end method insertAtBack

   // remove first node from List
   public E removeFromFront() throws EmptyListException
   {
      if ( isEmpty() ) // throw exception if List is empty
         throw new EmptyListException( name );

      E removedItem = firstNode.data; // retrieve data being removed

      // update references firstNode and lastNode 
      if ( firstNode == lastNode )
         firstNode = lastNode = null;
      else
         firstNode = firstNode.nextNode;

      return removedItem; // return removed node data
   } // end method removeFromFront

   // remove last node from List
   public E removeFromBack() throws EmptyListException
   {
      if ( isEmpty() ) // throw exception if List is empty
         throw new EmptyListException( name );

      E removedItem = lastNode.data; // retrieve data being removed

      // update references firstNode and lastNode
      if ( firstNode == lastNode )
         firstNode = lastNode = null;
      else // locate new last node
      { 
         ListNode current = firstNode;

         // loop while current node does not refer to lastNode
         while ( current.nextNode != lastNode )
            current = current.nextNode;
   
         lastNode = current; // current is new lastNode
         current.nextNode = null;
      } // end else

      return removedItem; // return removed node data
   } // end method removeFromBack

   // determine whether list is empty
   public boolean isEmpty()
   { 
      return firstNode == null; // return true if list is empty
   } // end method isEmpty
  
   // get the first element contents

   public E peekFirst()
   { 
      return (firstNode == null)?null:firstNode.getObject(); // return Object in firstNode
   } // end method peekFirst

    // get the first element contents

   public E peekLast()
   { 
      return (lastNode == null)?null:lastNode. // return Object in lastNode
   } // end method peekLast()
    

  
} // end class List

