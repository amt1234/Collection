package reflection;

public class Test1{  
 public static void main(String args[]) throws Exception{  
	 Simple s=new Simple();
  Class c=Class.forName("reflection.Simple");  
  System.out.println(c.getName());  
 }  
}  

