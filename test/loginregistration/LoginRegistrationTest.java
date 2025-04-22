/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package loginregistration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class LoginRegistrationTest {
    
    public LoginRegistrationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of registerUser method, of class LoginRegistration.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        String expResult = "";
        String result = LoginRegistration.registerUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateUsername method, of class LoginRegistration.
     */
    @Test
    public void testValidateUsername() {
        System.out.println("validateUsername");
        String username = "";
        String expResult = "";
        String result = LoginRegistration.validateUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validatePassword method, of class LoginRegistration.
     */
    @Test
    public void testValidatePassword() {
        System.out.println("validatePassword");
        String password = "";
        String expResult = "";
        String result = LoginRegistration.validatePassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUsername method, of class LoginRegistration.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("checkUsername");
        String username = "";
        boolean expResult = false;
        boolean result = LoginRegistration.checkUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class LoginRegistration.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        boolean expResult = false;
        boolean result = LoginRegistration.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellNumber method, of class LoginRegistration.
     */
    @Test
    public void testCheckCellNumber() {
        System.out.println("checkCellNumber");
        String phoneNumber = "";
        boolean expResult = false;
        boolean result = LoginRegistration.checkCellNumber(phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class LoginRegistration.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String registeredUsername = "";
        String registeredPassword = "";
        String enteredUsername = "";
        String enteredPassword = "";
        boolean expResult = false;
        boolean result = LoginRegistration.loginUser(registeredUsername, registeredPassword, enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class LoginRegistration.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String registeredUsername = "";
        String registeredPassword = "";
        String enteredUsername = "";
        String enteredPassword = "";
        String firstname = "";
        String lastname = "";
        String expResult = "";
        String result = LoginRegistration.returnLoginStatus(registeredUsername, registeredPassword, enteredUsername, enteredPassword, firstname, lastname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class LoginRegistration.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        LoginRegistration.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
