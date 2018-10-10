/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcelo
 */
public class ContaCorrenteTest {
    
    public ContaCorrenteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getChave method, of class ContaCorrente.
     */
    @Test
    public void testGetChave() {
        System.out.println("getChave");
        ContaCorrente instance = null;
        String expResult = "";
        String result = instance.getChave();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sacar method, of class ContaCorrente.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        double valor = 0.0;
        ContaCorrente instance = null;
        instance.sacar(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of depositar method, of class ContaCorrente.
     */
    @Test
    public void testDepositar() {
        System.out.println("depositar");
        double valor = 0.0;
        ContaCorrente instance = null;
        instance.depositar(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transferir method, of class ContaCorrente.
     */
    @Test
    public void testTransferir() {
        System.out.println("transferir");
        double valor = 0.0;
        ContaCorrente destino = null;
        ContaCorrente instance = null;
        instance.transferir(valor, destino);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class ContaCorrente.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        ContaCorrente instance = null;
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class ContaCorrente.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        ContaCorrente instance = null;
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAgencia method, of class ContaCorrente.
     */
    @Test
    public void testGetAgencia() {
        System.out.println("getAgencia");
        ContaCorrente instance = null;
        int expResult = 0;
        int result = instance.getAgencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAgencia method, of class ContaCorrente.
     */
    @Test
    public void testSetAgencia() {
        System.out.println("setAgencia");
        int agencia = 0;
        ContaCorrente instance = null;
        instance.setAgencia(agencia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class ContaCorrente.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        ContaCorrente instance = null;
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class ContaCorrente.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        ContaCorrente instance = null;
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSaldo method, of class ContaCorrente.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        ContaCorrente instance = null;
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ContaCorrente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ContaCorrente instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class ContaCorrente.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        Observer o = null;
        ContaCorrente instance = null;
        instance.register(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unregister method, of class ContaCorrente.
     */
    @Test
    public void testUnregister() {
        System.out.println("unregister");
        Observer o = null;
        ContaCorrente instance = null;
        instance.unregister(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of notifyObserver method, of class ContaCorrente.
     */
    @Test
    public void testNotifyObserver() {
        System.out.println("notifyObserver");
        ContaCorrente instance = null;
        instance.notifyObserver();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
