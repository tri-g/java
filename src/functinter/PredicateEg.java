package functinter;
import java.util.function.Predicate;
public class PredicateEg {

	public static void main(String[] args) {
		Predicate<Integer> p=(a)->(a>10);
		System.out.println(p.test(45));
		
		

	}

}
