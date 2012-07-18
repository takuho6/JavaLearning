package jp.itacademy.samples.ensyu;

import java.util.ArrayList;
import java.util.List;

public class SosuUnder100 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<>();
		List<Integer> intListSosu = new ArrayList<>();

		// step1
		for (int i = 2; i <= 100; i++) {
			intList.add(i);
		}

		// step2
		intListSosu.add(intList.get(0));

		// step3
//		for (intList ) {
//			if (i % 2 == 0) {
//				intList.remove(i);
//			}
//		}
		System.out.println(intList);
	}
}
