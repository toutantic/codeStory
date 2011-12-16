package net.toutantic.foobarqix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumberConversionEngine {

	// This is a nullObject used to implement a fluent api
	// Ex:
	// ifNumberCanBeDivideBy(3).append(FOO);
	// ifNumberCanBeDivideBy(3) if this is true We return the current object and FOO is appended to the result
	// ifNumberCanBeDivideBy(3) if this is false We return the nullObject and append(FOO) does nothing.
	private final static NumberConversionEngine nullObject = new NumberConversionEngine();

	private int numberToConvert;
	private StringBuilder outPutString = new StringBuilder();
	private Integer currentDigit;
	private Iterator<Integer> digitIterator;

	protected void init(int number) {
		this.numberToConvert = number;
		this.outPutString = new StringBuilder();
		this.digitIterator = convertNumberToAlistOfDigit().iterator();
	}

	public String convert(int number) {
		init(number);
		convert();
		return getResult();
	}

	/**
	 * childs overide this to implement their own convertion rules.
	 */
	protected void convert() {

	}

	public String getResult() {
		return outPutString.toString();
	}

	protected String numberToString() {
		return Integer.toString(numberToConvert);
	}

	protected boolean nextDigit() {
		if (digitIterator.hasNext()) {
			currentDigit = digitIterator.next();
			return true;
		} else {
			return false;
		}
	}

	protected List<Integer> convertNumberToAlistOfDigit() {
		char[] digits = numberToString().toCharArray();
		List<Integer> digitList = new ArrayList<Integer>();
		for (char digit : digits) {
			digitList.add(Character.digit(digit, 10));
		}
		return digitList;
	}

	protected NumberConversionEngine ifDigitIs(int testNumber) {
		return thisIfTrue(currentDigit == testNumber);
	}

	protected NumberConversionEngine ifNumberCanBeDivideBy(int divisor) {
		return thisIfTrue(numberToConvert % divisor == 0);
	}

	protected NumberConversionEngine ifNoRuleApplied() {
		return thisIfTrue(outPutString.length() == 0);
	}

	protected NumberConversionEngine thisIfTrue(boolean result) {
		return result ? this : nullObject;
	}

	protected void append(String string) {
		outPutString.append(string);
	}

}
