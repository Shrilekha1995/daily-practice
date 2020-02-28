package collector;

import java.util.Arrays;
import java.util.List;


public class Sorted_States_Cities {

	public static void main(String[] args) {

		List<String> stateList = Arrays.asList("Maharshtra-Pune", "Gujrat-Surat", "Karnataka-Banglore",
				"Maharshtra-Mumbai", "Maharshtra-Latur", "Punjab-Chandigarh");

		stateList.stream().sorted().forEach(System.out::println);

	}

}
