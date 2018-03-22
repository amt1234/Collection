package reflection;
import java.lang.reflect.*;

public class Test {

	public static void main(String[] args)throws Exception
	{
		try
		{
		Class c=Class.forName("reflection.Employee");
		System.out.println("Name :"+c.getName());
		System.out.println("Super class :"+c.getSuperclass().getName());
		
		Class[] class1=c.getInterfaces();
		System.out.println("interface list :");
		for(Class cls:class1)
		{
			System.out.print(cls.getName()+" ");
		}
		System.out.println();
		int i=c.getModifiers();
		System.out.println("access modifiers : "+Modifier.toString(i));
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}

	}

}
