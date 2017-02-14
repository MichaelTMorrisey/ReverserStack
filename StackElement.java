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
public class StackElement {
    //each stack element holds one String
    String localString; 
    //each stack element also contains a pointer to the next item down the stack
    StackElement next;
    
    //default constructor StackElement()
    StackElement()
    {
        localString = "";
        next = null;
    }//end default constructor
    
    //initializing constructor StackElement(String)
    StackElement(String myString)
    {
        localString = myString;
        next = null;
    }//end initializing constructor StackElement(String)
            
    //initializing constructor StackElement(String, StackElement)
    StackElement(String myString, StackElement myStackElement)
    {
        localString = myString;
        next = myStackElement;
    }//end initializing constructor StackElement(String, StackElement)
    
    //setString() sets the "localString" property using the String passed as a parameter
    public void setString(String myString)
    {
        localString = myString;
    }//end setLocalString()
    
    //getString() returns the "localString" property
    public String getString()
    {
        return localString;
    }//end getString()
    
    //setNext() sets the "next" property using the pointer passed as a parameter
    public void setNext(StackElement myNext)
    {
        next = myNext;
    }//end setNext()
    
    //getNext() returns the "next" property 
    public StackElement getNext()
    {
        return next;
    }//end getNext()
    
    //toString() creates and returns a String which labels the localString property
    public String toString()
    {
        //a String to return
        String result;
        //convert the properties of the stackElement to a String
        result = "String = " + localString;
        return result;
    }//end toString()
    
}//end class StackElement
