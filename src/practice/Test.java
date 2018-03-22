package practice;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//get name of class
public class Test {

	public static void main(String[] args) throws Exception {
		
		
		Class c=Class.forName("practice.P");
		System.out.println("name : "+c.getName());
		System.out.println("super class name:"+c.getSuperclass());
		Class[] c1=c.getInterfaces();
		System.out.println("interfaces :");
		for(Class clas:c1)
		{
			System.out.println(" "+clas.getName());
			int i=clas.getModifiers();
			System.out.println("access modifier :"+Modifier.toString(i));
			System.out.println("---------------------");
		}
		System.out.println("===================================================");
		Field[] fild=c.getDeclaredFields();
		
		for(Field f:fild)
		{
			System.out.println("field :"+f.getName());
			System.out.println("Data Type :"+f.getType().getName());
			System.out.println("value :"+f.get(f));
			System.out.println("------------------------------------------------");
		}
		System.out.println("=============================================");
		
		Method[] meth=c.getDeclaredMethods();
		
		for(Method m:meth)
		{
			System.out.println("method name:"+m.getName());
			System.out.println("returnType:"+m.getReturnType());
			int j=c.getModifiers();
			System.out.println("access modifies :"+Modifier.toString(j));
			Class[] cls=m.getExceptionTypes();
			System.out.println("Method exception :");
			for(Class cl2:cls)
			{
				System.out.println(cl2.getName());
			}
			System.out.println("------------------------------------");
			
		}

	}

}
