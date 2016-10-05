/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.studentregistration.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fergalbroderick
 */
public class UsernameTest {
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void getUsernameTest() {
        Student Mike = new Student("Michael Healy", "22/06/1985", 31);
        
        String Expected = "michaelhealy31";
        String Actual = Mike.getUsername();
        assertEquals(Expected, Actual);
              
    }
}
