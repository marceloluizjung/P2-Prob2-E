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
public class NotificaoObserver implements Observer{

    @Override
    public void update() {
        System.out.println("O serviço foi realizado!");
    }
    
}
