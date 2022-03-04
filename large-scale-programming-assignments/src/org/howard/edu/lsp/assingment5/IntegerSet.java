package org.howard.edu.lsp.assingment5; //source code package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Class IntegerSet defines the methods that change the content of an ArrayList.
 * ArrayLists declared in TestFile class are objects of IntegerSet class.
 */
public class IntegerSet {
private List<Integer> set = new ArrayList<Integer>();

/**
* get method, called by equal(), union(), intersect(), and diff() methods.
*/
public List<Integer> getSet() {
return set;
}

/**
* Method clears items in set, then prints empty set to be vizualized.
*/
public void clear(){
set.clear();
System.out.println("Cleared Set: " + set);
}

/**
* Method finds length of set and returns length value.
* An integer is used for length of set.
*/
public int length() {
int length = set.size();
return length;
}

/**
* Compares two sets to measure equality. 
* Will return equal if the sets have same values and false if they don't.
*/

public boolean equals(IntegerSet b) { 
boolean equal = true;
List<Integer> Set2 = b.getSet();
for (int i=0; i<set.size(); i++) {
int set1val = set.get(i);
for (int j=0; j<Set2.size(); j++) {
int set2val = Set2.get(i);
if (set1val == set2val) {
equal = true;
}
else {
equal = false;
}
}
}
return equal;
}

/**
* Searches for specific value in set. Returns true if value is in set.
* @param value, the value this method searches for in set.
* @return contained, boolean set to true by default. 
* If value is in set boolean remains true if not then false. 
*/
public boolean contains(int value) {
boolean contained = true;
if (set.contains(value)) {
contained = true;
}
else {
contained = false;
}
return contained;
}    

/**
* If set length is null, throws IntegerSetException error.
* @return max, if set has value of 1 then this will be max value.
* @throws IntegerSetException exception class for empty sets.
*/
public int largest() throws IntegerSetException {
int max = 0;
if (set.size() <= 0) {
throw new IntegerSetException("ArrayList has no length, so there is no largest item.");
}
else if (set.size() > 0) {
max = Collections.max(set);
}
return max;
}

/**
* If set length is null, throws IntegerSetException error.
* @return min, if set length is 1< then this is minimum value.
* @throws IntegerSetException exception class for empty sets.
*/
public int smallest() throws IntegerSetException {
int min = 0;
if (set.size() <= 0) {
throw new IntegerSetException("ArrayList has no length, so there is no smallest item.");
}
else if (set.size() > 0) {
min = Collections.min(set);
}
return min;
} 

/**
* Searches set for specific item.
* If item does is not in set, method will add to set.
* @param item denotes the value to be added to the set by this method.
*/
public void add(int item) {
if (set.contains(item) == false) {
set.add(item);
}
}

/**
* Searches set for specific item, If item is in set, method removes item.
* @param item denotes the value to be removed from the set by this method.
*/
public void remove(int item) {
if (set.contains(item) == true) {
set.removeAll(Arrays.asList(item));
}
} 

/**
* Combines two sets together and deletes duplicate sets.
* @param intSetb, is the set to be compared to another set.
*/
public void union(IntegerSet intSetb) {
List<Integer> Set2 = intSetb.getSet();
for (int i=0; i<Set2.size(); i++) {
add(Set2.get(i)); 
}
set.toString();
}

/**
* Examines two sets and prints shared elements.
* @param intSetb, intSetb is the set to be compared to another set.
*/
public void intersect(IntegerSet intSetb) {
List<Integer> Set2 = intSetb.getSet();
for (int i=0; i<Set2.size(); i++) {
set.retainAll(Set2);
}
set.toString();
}

/**
* Examines two sets and prints elements not shared.
* @param intSetb, intSetb is the set to be compared to another set.
*/
public void diff(IntegerSet intSetb) {
List<Integer> Set2 = intSetb.getSet();
for (int i=0; i<Set2.size(); i++) {
set.removeAll(Set2);
}
set.toString();
} 

/**
* Determines whether or not a set is empty
* @return boolean empty, default true. 
* If set is null, returns true. If set has values, returns false.
*/
public boolean isEmpty() {
boolean empty = true;
int length = set.size();
if (length > 0) {
empty = false;
}
else if (length == 0){
empty = true;
}
return empty;
}

/**
* Converts Integer Set to String, and prints the String.
* @return String setasstring, converted set to a String.
*/
public String toString() {
String setasstring = set.toString();
return setasstring; 
}
}
