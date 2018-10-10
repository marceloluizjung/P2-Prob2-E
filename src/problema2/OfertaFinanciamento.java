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
public class OfertaFinanciamento implements Observer{

        private OfertaFinanciamento of;
    
    @Override
    public void update() {
        this.testeOF();
        System.out.println("Foi realizada a oferta de financiamento");
    }
 
    public OfertaFinanciamento testeOF(){ 
        if(of == null){ 
            of = new OfertaFinanciamento(); 
        }
        return of;
    }
 
    
}
