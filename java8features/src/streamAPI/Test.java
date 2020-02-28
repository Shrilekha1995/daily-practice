package streamAPI;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {

		String[] magzine = { "give", " me", " one", "grand", " today", "night" };
		String[] note = { "give ", "one", "grand", "today" };

		checkMagazine(magzine, note);
	}

	static void checkMagazine(String[] magazine, String[] note) {
		boolean flag = true;

		if (note.length > magazine.length) {
			flag = false;
		} else {
			HashMap<String, Integer> hm = new HashMap<>();

			for (int i = 0; i < note.length; i++) {
				if (hm.containsKey(note[i])) {

					hm.put(note[i], hm.get(note[i]) + 1);

				} else {
					hm.put(note[i], 1);
				}
			}
			System.out.println("hm note " + hm);

			HashMap<String, Integer> hm2 = new HashMap<>();

			for (int i = 0; i < magazine.length; i++) {
				if (hm2.containsKey(magazine[i])) {

					hm2.put(magazine[i], hm.get(magazine[i]) + 1);

				} else {
					hm2.put(magazine[i], 1);
				}
			}
			System.out.println("hm2 magazine " + hm2);

			for (int i = 0; i < note.length; i++) {

				if (hm2.containsKey(note[i])) {
					if (hm.get(note[i]) <= hm2.get(note[i])) {
						flag = true;
					} else {
						flag = false;

					}
				} else {
					flag = false;
				}
			}

			if (flag == true) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}

		}

	}

}
