package net.toutantic.foobarqix;

public class FooBarQixImpl implements FooBarQix {

	public static void main(String[] args) {
		String result = new FooBarQixImpl().computeFromOneToHundred();
		System.out.println(result);
	}

	public String convert(int number) {
		return new CodeStoryFooBarQix().convert(number);
	}

	public String computeFromOneToHundred() {
		CodeStoryFooBarQix codeStoryFooBarQix = new CodeStoryFooBarQix();
		StringBuilder builder = new StringBuilder();
		int currentNumber = 1;
		for (; currentNumber <= 100; currentNumber++) {
			builder.append(codeStoryFooBarQix.convert(currentNumber));
			builder.append("\n");
		}
		return builder.toString();
	}

}
