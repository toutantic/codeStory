package net.toutantic.foobarqix;

import static org.junit.Assert.*;

import org.junit.Test;

public class fooBarQixTest {

    String expected[]= new String[]{
		"1",
		"2",
		"FooFoo",
		"4",
		"BarBar",
		"Foo",
		"QixQix",
		"8",
		"Foo",
		"Bar",
		"11",
		"Foo",
		"Foo",
		"Qix",
		"FooBarBar",
		"16",
		"Qix",
		"Foo",
		"19",
		"Bar",
		"FooQix",
		"22",
		"Foo",
		"Foo",
		"BarBar",
		"26",
		"FooQix",
		"Qix",
		"29",
		"FooBarFoo",
		"Foo",
		"Foo",
		"FooFooFoo",
		"Foo",
		"BarQixFooBar",
		"FooFoo",
		"FooQix",
		"Foo",
		"FooFoo",
		"Bar",
		"41",
		"FooQix",
		"Foo",
		"44",
		"FooBarBar",
		"46",
		"Qix",
		"Foo",
		"Qix",
		"BarBar",
		"FooBar",
		"Bar",
		"BarFoo",
		"FooBar",
		"BarBarBar",
		"QixBar",
		"FooBarQix",
		"Bar",
		"Bar",
		"FooBar",
		"61",
		"62",
		"FooQixFoo",
		"64",
		"BarBar",
		"Foo",
		"Qix",
		"68",
		"Foo",
		"BarQixQix",
		"Qix",
		"FooQix",
		"QixFoo",
		"Qix",
		"FooBarQixBar",
		"Qix",
		"QixQixQix",
		"FooQix",
		"Qix",
		"Bar",
		"Foo",
		"82",
		"Foo",
		"FooQix",
		"BarBar",
		"86",
		"FooQix",
		"88",
		"89",
		"FooBar",
		"Qix",
		"92",
		"FooFoo",
		"94",
		"BarBar",
		"Foo",
		"Qix",
		"Qix",
		"Foo",
		"Bar"};

    
    @Test
    public void testNumberByNumber() {
	FooBarQix fooBarQix = new FooBarQixImpl();
	
	for (int i = 1; i < expected.length+1; i++) {
	    assertEquals(""+i, expected[i-1], fooBarQix.convert(i));
	}
    }
    
    @Test
    public void testAllInOne() {
	FooBarQix fooBarQix = new FooBarQixImpl();
	
	assertEquals(getExpected(), fooBarQix.computeFromOneToHundred());
    }
    
    public String getExpected() {
	StringBuilder builder = new StringBuilder();
	for (String line : expected) {
	    builder.append(line);
	    builder.append("\n");
	}
	
	return builder.toString();
	
    }
}
