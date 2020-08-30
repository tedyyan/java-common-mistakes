

package javaskill.mockito;
public class ClassToTest{
	MyDatabase databaseMock;
	public ClassToTest(MyDatabase databaseMock) {
		this.databaseMock = databaseMock;
	}

	public boolean query(String string) {
		
		return this.databaseMock.query(string);
	}
	
}
