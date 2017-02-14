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
public class ReverserStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //a Stack to use to reverse the array
        Stack myStack;
        //a StackElement to use within the loop
        StackElement myElement;
        //an array of at least 5 Strings
        String[] myArr = new String[5];
        
        myStack = new Stack();
        myElement = new StackElement();
        
        //loop through the array
        for (int i = 0; i< myArr.length; i++)
        {
            //put the current String in a StackElement
            myElement.setString(myArr[i]);
            //add the current String to the Stack 
            myStack.push(myElement);
        }//end for
        
        //now that all the Strings have been added to the Stack,
        //remove them from the Stack and they will be in reverse order
        for (int i = 0; i< myArr.length; i++)
        {
            myArr[i] = myStack.pop().getString();
        }//end for
        
        
    }//end main()
    
}//end class ReverserStack
