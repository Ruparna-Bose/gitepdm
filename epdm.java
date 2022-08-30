package streamapi;
//Java Program to illustrate FILTER & COLLECT Operations

//Importing input output classes
import java.io.*;

//Importing utility class for List and ArrayList classes
import java.util.*;

//Importing stream classes
import java.util.stream.*;
class ArithmeticUtils {

    public static int add(int a, int b) {
        return a + b;
    }
}
//Main class
public class Test1 {
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(6);
		al.add(9);
		al.add(4);
		al.add(20);
		Integer sum = al.stream()
				// .reduce(0, (a, b) -> a + b);
				//.reduce(0, Integer::sum);
				.mapToInt(Integer::intValue)
				.sum();
				//.reduce(0, ArithmeticUtils::add);
		
		System.out.println(sum);

		System.out.println("Printing the collection : "
						+ al);

		// Printing new line for better output readability
		System.out.println();

		// Stream operations
		// 1. Getting the stream from this collection
		// 2. Filtering out only even elements
		// 3. Collecting the required elements to List
		List<Integer> ls
			= al.stream()
				.filter(i -> i % 2 == 0)
				.collect(Collectors.toList());
				
		
		long count = al.stream()
				 .peek(i->System.out.print(i+"\t"))
				 .map(i->i*i)
				 .peek(i->System.out.println(i))
				 .count();
	     System.out.println("\nCount: " + count);
	     
	     
		// Print the collection after stream operation
		// as stored in List object
		System.out.println(
			"Printing the List after stream operation : "
			+ ls);
	}
}

