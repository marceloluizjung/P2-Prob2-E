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
public class AnaliseInvestimento implements Observer{

    private AnaliseInvestimento ai;
    
    @Override
    public void update() {
        this.teste();
        System.out.println("Foi realizada a análise de investimento");
    }
 
    public AnaliseInvestimento teste(){ 
        if(ai == null){ 
            ai = new AnaliseInvestimento(); 
        }
        return ai;
    }
    
}
