package accessSpecifier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class demoClass
{
    int a = 1;
 
    void func()
    {
        demo obj = new demo();
        obj.display();
    }
 
 
    class demo
    {
        int b = 2;
 
        void display()
        {
            System.out.println("na = " + a);
        }
    }
 
    void get()
    {
        //System.out.println("nb = " + b);
    }
}
 
 
class B
{
    public static void main(String[] args) throws FileNotFoundException
    {
    	
    	File f=new File("F:\\clink\\backend\\clinkProject\\src\\images\\file10.txt");
    	
   
    	
    	try {
			f.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
    	  FileReader fr=new FileReader("F:\\clink\\backend\\clinkProject\\src\\images\\file10.txt");    
          int i;    
          try {
			while((i=fr.read())!=-1)    
			  System.out.print((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
          try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
 
    }
}