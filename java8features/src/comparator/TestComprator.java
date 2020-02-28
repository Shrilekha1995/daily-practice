package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestComprator {

	public static List<Emp> getEmp() {
		return new ArrayList<Emp>(
				Arrays.asList(new Emp(1, "a", 10500), new Emp(4, "abc", 10100), new Emp(3, "abc", 1000)));
	}

	public static void main(String[] args) {
		getEmp().stream().sorted(Comparator.comparing((Emp e) -> e.getName()).thenComparing(e -> e.getId()))
				.forEach(System.out::println);
		
	}
}
