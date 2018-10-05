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
public class Servico {

    private boolean saque;
    private boolean deposito;
    private boolean transferencia;
    private boolean analiseFluxoCaixa;
    private boolean baixaAutomaticaInvestimento;

    //Construtor
    public Servico(boolean saque, boolean deposito, boolean transferencia, boolean analiseFluxoCaixa, boolean baixaAutomaticaInvestimento) {
        this.setSaque(saque);
        this.setDeposito(deposito);
        this.setTransferencia(transferencia);
        this.setAnaliseFluxoCaixa(analiseFluxoCaixa);
        this.setBaixaAutomaticaInvestimento(baixaAutomaticaInvestimento);
    }

    //Get and Set
    public boolean isSaque() {
        return saque;
    }

    public void setSaque(boolean saque) {
        this.saque = saque;
    }

    public boolean isDeposito() {
        return deposito;
    }

    public void setDeposito(boolean deposito) {
        this.deposito = deposito;
    }

    public boolean isTransferencia() {
        return transferencia;
    }

    public void setTransferencia(boolean transferencia) {
        this.transferencia = transferencia;
    }

    public boolean isAnaliseFluxoCaixa() {
        return analiseFluxoCaixa;
    }

    public void setAnaliseFluxoCaixa(boolean analiseFluxoCaixa) {
        this.analiseFluxoCaixa = analiseFluxoCaixa;
    }

    public boolean isBaixaAutomaticaInvestimento() {
        return baixaAutomaticaInvestimento;
    }

    public void setBaixaAutomaticaInvestimento(boolean baixaAutomaticaInvestimento) {
        this.baixaAutomaticaInvestimento = baixaAutomaticaInvestimento;
    }

}
