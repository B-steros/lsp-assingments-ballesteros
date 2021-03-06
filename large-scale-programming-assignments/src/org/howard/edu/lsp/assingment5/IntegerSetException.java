package org.howard.edu.lsp.assingment5;
/**
 * IntegerSetException class inherits from Exception class. 
 * Throws IntegerSetException error if set length is less than or equal to zero.
 */
public class IntegerSetException extends Exception {
/**
* Method throws IntegerSetException when called from largest() and smallest() methods.
* @param ExceptionMsg, String defines the error message which will be printed
* by the largest() and smallest() methods.
*/
public IntegerSetException(String ExceptionMsg) { 
super(ExceptionMsg); //Exception Message is defined under largest() and smallest() methods
}
}
