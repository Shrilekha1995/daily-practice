package com.springConfigWithJava;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestClass {
/*
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach=(Coach) context.getBean("tennisCoach",Coach.class);
		System.out.println(coach.getFortune());
		//System.out.println(coach.getDailyWorkout());
		Coach coach1=(Coach) context.getBean("tennisCoach",Coach.class);
		System.out.println(coach1.getFortune());
		Coach coach2=(Coach) context.getBean("tennisCoach",Coach.class);
		System.out.println(coach2.getFortune());
	}
*/
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int d=4;
		 int temp;
	      for(int i=0;i<d;i++)
	      {
	          temp=a[0];
	          for(int j=0;j<a.length-1;j++)
	          {
	              a[j]=a[j+1];
	          }
	          a[a.length-1]=temp;
           
	          for(int k=0;k<a.length;k++)
	          {
	          System.out.print(a[k]+" ");
	          }
	          System.out.println();
	      }
	      
	      
   /* int n = in.nextInt();
    int d,q,x,y;
    int arr[]=new int[3];
    System.out.println(arr.length);
    ArrayList[] set = new ArrayList[n];
    for(int i=0;i<n;i++)
    {   
    	System.out.println("ENter number of elements");
        d = in.nextInt();
        set[i] = new ArrayList();
        for(int j=0;j<d;j++)
        {  
            set[i].add(in.nextInt());                
        }
    }
    System.out.println("ENter number of queries");
    q=in.nextInt();
    for(int i=0;i<q;i++)
    {
    	System.out.println("Enter x and y position");
        x=in.nextInt();
        y=in.nextInt();
        try{
            System.out.println(set[x-1].get(y-1));
        } catch(Exception e){
            System.out.println("ERROR!");
        }
    }
*/
}}
