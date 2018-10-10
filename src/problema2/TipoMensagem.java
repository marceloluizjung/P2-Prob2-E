/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcelo
 */
public class TipoMensagem implements Observer{
    
    private List<Integer> serv;
    
    public TipoMensagem(Cliente cliente,int escolha) {
        
        serv = new ArrayList();
        
        if(cliente instanceof ClientePessoaFisica){
            
            switch(escolha){
                
                
                
            }
            
        }
        
        if(cliente instanceof ClientePessoaJuridica){
            
        }
        
    }
    
    @Override
    public void update() {
        
        
    }
    
}
