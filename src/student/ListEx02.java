package student;

import java.util.*;

class ListEx02 {

	public static void main(String[] args) {
		String[] aName = { "희동이", "둘  리", "공실이" };
		int[] vJumSu = { 90, 80, 77 };

		List<String> dtoL = new ArrayList<String>();
		ListEx02 objDB = new ListEx02();

		for (int i = 0; i < aName.length; i++) {
			dtoL.add(aName[i]);
			dtoL.add(vJumSu[i]);
		}

		System.out.println("===>" + dtoL.size());

		for (int i = 0; i < dtoL.size(); i++) {
			System.out.println(dtoL.get(i));
		}

	}
}