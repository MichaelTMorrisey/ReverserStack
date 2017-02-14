/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverserstack;

/**
 *
 * @author Michael.T.Morrisey
 */
public class Stack {
    //a pointer to the head of the Stack, where all adding and removing will take place
    StackElement head;
    //an int to keep track of how many StackElements are on the list
    int size;
    
    //a default constructor Stack()
    Stack()
    {
        head = null;
        size = 0;
    }//end default constructor Stack()
    
    //initializing constructor Stack()
    Stack(StackElement myHead)
    {
        head = myHead;
        //update size
        size = 1;
    }//end initializing constructor Stack()
    
    //pop() removes a StackElement from the Stack and returns it
    public StackElement pop()
    {
        //a StackElement to return
        StackElement result;
        //set result to point to the head, since that is where we remove from
        result = head;
        //update head to point to the next StackElement
        //(or null, if this is the end of the stack)
        head = head.getNext();
        //decrement size
        size--;
        //return the StackElement that was previously at the head of the Stack
        return result;
    }//end pop()
    
    //push() adds a StackElement to the Stack
    public void push(StackElement myStackElement)
    {
        //set the new StackElement to point to the head of the Stack
        myStackElement.setNext(head);
        //update head to point to the new StackElement
        head = myStackElement;
        //increment size
        size++;
    }//end push()
    
    //peek() prints the toString of the current head
    //i.e. peek() prints a String that shows what String is currently at the head
    //of the Stack
    public void peek()
    {
        System.out.println(head.toString());
    }//end peek()
    
    public void print()
    {
        //a pointer to iterate the Stack
        StackElement current;
        //set current to point to the head of the Stack
        current = head;
        
        while (current != null)
        {
            //print the toString for each element in the list
            System.out.println(current.toString());
            //update current to point to the next StackElement down the Stack
            current = current.next;
        }//end while
            
    }//end print()
    
}//end class Stack
