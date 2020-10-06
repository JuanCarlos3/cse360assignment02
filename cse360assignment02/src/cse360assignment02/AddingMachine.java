package cse360assignment02;
import java.util.*; 
/*
 * @author Hwan Kim
 * ASU ID: hkim354
 * CSE 360 Assignment 02
 */

/**
 * Adding Machine class
 * Adds and Subtracts values and prints out result
 * Has a value total
 */
public class AddingMachine {
  private ArrayList<Integer> list = new ArrayList<Integer>();  
  private int total;
  private String result;
  
  /**
   * Constructor Method
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    result = "";
  }
  
  /**
   * Gets and returns the total
   * @return the total
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * Adds given value to total
   * @param value: the value being added
   */
  public void add (int value) {
	  total += value;
	  list.add(value);
  }

  /**
   * subtracts given value to total
   * @param value: the value being subtracted
   */
  public void subtract (int value) {
	  total -= value;
	  value = value * -1;
	  list.add(value);
  }

  /**
   * prints out given information & previous transaction
   * @return string of all past additions and subtractions
   */
  public String toString() {
	  for (int i = 0; i < list.size(); i++) {
	        if(list.get(i) >= 0) {
	        	result =result + " + " + list.get(i);
	        }
	        else {
	        	int temp_value = -1 * list.get(i);
	        	result += " - " + temp_value;
	        }
	  }
	  return "0" + result;
  }

  /**
   * clears values in array or "memory"
   */
  public void clear() {
	  ArrayList<Integer> list = new ArrayList<Integer>();
	  result = "";
  }
  
}