package java8f;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConImpl implements Consumer<Integer>
{
	public void accept(Integer i)
	{
		System.out.println(i);
		
		
	}
	
}
public class ConsumerDemo {

	
	public static void main(String[] args) {
	
		List<Integer> values=Arrays.asList(4,5,3,7);
		
		Consumer<Integer> con=new ConImpl();
		values.forEach(con);
		
	}

}
