package com.abc.check;
import java.util.*;
import com.abc.node.*;

public class Checking {
	public void checkIfPairExists(Node node, int sum) {
	    List<Integer> list = new ArrayList<>();
	    
	    inorder(node, list);
	     if(checkIfPairExistsUtil(sum, list)==false)
	     {
	    	 System.out.println("pairs not found");
	     }
	     
	  }
	  
	  public void inorder(Node node, List<Integer> list) {
	    if(node == null) {
	      return;
	    }
	    
	    inorder(node.left, list);
	    
	    list.add(node.data);
	    
	    inorder(node.right, list);
	  }
	  
	  private boolean checkIfPairExistsUtil(int sum, List<Integer> list) {
	    int start = 0;
	    int end = list.size() - 1;
	    
	    
	    while(start < end) {
	      int currentSum = list.get(start) + list.get(end);
	      
	      if(currentSum == sum) {
	    	  System.out.println("the pairs for the sum " +sum+ " are "+list.get(start)+" and "+list.get(end));
	        return true;
	      } else if(currentSum < sum) {
	        start++;
	      } else {
	        end--;
	      }
	    }
	    
	    return false;
	  }

}
