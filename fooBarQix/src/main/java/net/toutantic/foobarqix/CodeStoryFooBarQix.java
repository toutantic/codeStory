package net.toutantic.foobarqix;

public class CodeStoryFooBarQix extends NumberConversionEngine {

	private final static String FOO = "Foo";
	private final static String BAR = "Bar";
	private final static String QIX = "Qix";

	@Override
	public void convert() {
		ifNumberCanBeDivideBy(3).append(FOO);
		ifNumberCanBeDivideBy(5).append(BAR);
		ifNumberCanBeDivideBy(7).append(QIX);
		while (nextDigit()) {
			ifDigitIs(3).append(FOO);
			ifDigitIs(5).append(BAR);
			ifDigitIs(7).append(QIX);
		}

		ifNoRuleApplied().append(numberToString());
	}
}
