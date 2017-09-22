package map2;


import java.util.Arrays;
import java.util.List;

public class MapSample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
		List<String> list2 = Arrays.asList("pedro", "lenguajes", "programacion", "Java", "haskell");


		//List<Integer> result  = Map.map(list, new Increment());
		List<Integer> result  = Map.map(list, x -> x+1);
		for (Integer elem:result)
			System.out.println(elem);

		//result  = Map.map(list, new Square());
		result  = Map.map(list, x -> x*x);
		for (Integer elem:result)
			System.out.println(elem);


		//List<String> result2 = Map.map(list2, new Capitals());
		List<String> result2 = Map.map(list2, x-> x.toUpperCase());
		for (String elem:result2)
			System.out.println(elem);


		List<Integer> result3 = Map2.map2(list2, x-> x.length());
		for (Integer elem:result3) System.out.println(elem);

	}

}
