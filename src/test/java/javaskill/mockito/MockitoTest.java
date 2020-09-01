package javaskill.mockito;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class MockitoTest  {

    @Mock
    MyDatabase databaseMock; 

    @Rule public MockitoRule mockitoRule = MockitoJUnit.rule(); 

    @Test
    public void testQuery()  {
        ClassToTest t  = new ClassToTest(databaseMock);
        //when(databaseMock.query(any(String.class))).thenReturn(true);
        boolean check = t.query("* from t"); 
        
        assertTrue(check); 
        verify(databaseMock).query("* from t"); 
    }
    
   
}