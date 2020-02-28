package exceptionPractice;

import java.util.TreeSet;

public class ExceptionPractice{

	 
public static void main(String[] args) 
{ 
    TreeSet<String> treeSet = new TreeSet<>(); 
    treeSet.add("Geeksc"); 
    treeSet.add("For"); 
   treeSet.add("for"); 
    treeSet.add("Geeksb");
    treeSet.add("Geeksa");
   // treeSet.add("GeeksforGeeks"); 


    for (String temp : treeSet) 
        System.out.printf(temp + " "); 

    System.out.println("\n"); 
} 
}