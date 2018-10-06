/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author Marcelo
 */
public class TestesMain {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(0, 0, true, true, true, true, true);
        try {
            
        cc.depositar(10000);      
        cc.sacar(1000);
        cc.transferir(0, cc);
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
}
