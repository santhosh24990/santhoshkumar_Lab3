package com.abc.driver;
import com.abc.treesetup.*;
import com.abc.node.*;
import com.abc.check.*;
public class Main {

	  public static void main(String[] args) {
	    BST a = new BST();
	    Node root = null;
	    
	    root = a.insert(root, 40);
	    root = a.insert(root, 20);
	    root = a.insert(root, 60);
	    root = a.insert(root, 10);
	    root = a.insert(root, 30);
	    root = a.insert(root, 50);
	    root = a.insert(root, 70);
	    Checking b= new Checking();
	    b.checkIfPairExists(root, 25);
	  }

	}