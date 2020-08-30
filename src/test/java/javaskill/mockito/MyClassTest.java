package javaskill.mockito;
import static org.mockito.Mockito.*;

import java.util.Iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import javaskill.mockito.MyClass;
import javaskill.mockito.Todo;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MyClassTest {
	@Test
	public void test1() {
		// create mock
		MyClass test = mock(MyClass.class);

		// define return value for method getUniqueId()
		when(test.getUniqueId()).thenReturn(43);

		// use mock in test....
		assertEquals(test.getUniqueId(), 43);
	}

// demonstrates the return of multiple values
	@Test
	public void testMoreThanOneReturnValue() {
		Iterator<String> i = mock(Iterator.class);
		when(i.next()).thenReturn("Mockito").thenReturn("rocks");
		String result = i.next() + " " + i.next();
		// assert
		assertEquals("Mockito rocks", result);
	}

// this test demonstrates how to return values based on the input
	@Test
	public void testReturnValueDependentOnMethodParameter() {
		Comparable<String> c = mock(Comparable.class);
		when(c.compareTo("Mockito")).thenReturn(1);
		//when(c.compareTo("Eclipse")).thenReturn(2);
		// assert
		assertEquals(1, c.compareTo("Mockito"));
	}

// this test demonstrates how to return values independent of the input value

	@Test
	public void testReturnValueInDependentOnMethodParameter() {
		Comparable<Integer> c = mock(Comparable.class);
		when(c.compareTo(anyInt())).thenReturn(-1);
		// assert
		assertEquals(-1, c.compareTo(9));
	}

// return a value based on the type of the provide parameter

	@Test
	public void testReturnValueInDependentOnMethodParameter2() {
		Comparable<Todo> c = mock(Comparable.class);
		when(c.compareTo(isA(Todo.class))).thenReturn(0);
		// assert
		assertEquals(0, c.compareTo(new Todo(1)));
	}
}