package jp.itacademy.samples.api.basic;

public class WrapperClassSample {

	public static void main(String[] args) {

		Integer i1 = new Integer(123);
		System.out.println(i1);

		int i2 = Integer.parseInt("123");
		System.out.println(i2);

		int i3 = new Integer(123); // Integerオブジェクトをint型に代入
		System.out.println(i3);

		Integer i4 = 123; // int型値をInteger型の変数に代入
		System.out.println(i4);

	}

}
