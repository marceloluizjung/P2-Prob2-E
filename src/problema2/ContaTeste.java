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
public class ContaTeste {
    
    public static void main(String[] args) {
        //Serviços 
        NotificaoObserver no = new NotificaoObserver(); 
        FluxoDeCaixaObserver fco = new FluxoDeCaixaObserver(); 
        BaixaInvestimentoObserver bio = new BaixaInvestimentoObserver(); 
        
        
        Cliente cliente = new ClientePessoaFisica("abc", "123", "123", "123");
        ContaCorrente cc = new ContaCorrente(1, 1); 
        cliente.addConta(cc); 
        
        cc.register(no);
        cc.register(fco);
        cc.register(bio); 
        
        
        cc.sacar(0);  
        cc.depositar(0);
        cc.transferir(0, cc);
        
        
        
    }
    
    
}
