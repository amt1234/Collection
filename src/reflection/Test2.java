package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test2 {

	public static void main(String[] args) throws Exception {
		
		Empolyee1 e=new Empolyee1();
		Class c=e.getClass();
		Field[] fild=c.getDeclaredFields();
		for(Field f:fild)
		{
			System.out.println("Field name :"+f.getName());
			System.out.println("Field Type :"+f.getType());
			
			int i=c.getModifiers();
			System.out.println("Access Modifier :"+Modifier.toString(i));
			System.out.println("values "+f.get(i));
			System.out.println("--------------------");
		}
		
		Method[] meth=c.getDeclaredMethods();
		
		
		for(Method m:meth)
		{
			System.out.println("Method name :"+m.getName());
			System.out.println("Method Type :"+m.getReturnType());
			Class[] cls=m.getExceptionTypes();
			System.out.println("method exceptions :");
			for(Class cl2:cls)
			{
				System.out.println(cl2.getName());
			}
			System.out.println("---------------------------");
			
		}
		}
		

}
