package aula05;

import javax.swing.*;

public class ContaBanco {
    //Atributos
    public Integer numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private Boolean status;

     //Metodos personalizados
    public void estadoAtual(){
        System.out.println("-------------------------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono(a)"+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: " +this.getStatus());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
         if (t.equals("CC")) {
            this.setSaldo(50);
         } else if (t.equals("CP")){
             this.setSaldo(150);
         }
        JOptionPane.showConfirmDialog(null, "Conta foi Aberta com sucesso!");
    }
    public  void fecharConta(){
        if (this.getSaldo() > 0){
            JOptionPane.showConfirmDialog(null,"Conta não pode ser fechada porque ainda tem dinheiro nela, Sr."+this.getDono());
        }else if (this.getSaldo() < 0){
            JOptionPane.showConfirmDialog(null, "Conta não pode ser fechada por que esta em débito, Sr. "+this.getDono());
        }else{
            setStatus(false);
            JOptionPane.showConfirmDialog(null, "Conta foi fechada com sucesso, Sr. "+this.getDono());
        }
    }
    public void depositar(float v){
        if (this.getStatus() .equals(true)){
            this.setSaldo(getSaldo() + v);
            JOptionPane.showConfirmDialog(null, "Deposito realizado na conta " +this.getDono()+ " com sucesso!");
        }else{
            JOptionPane.showConfirmDialog(null, "Imporssivel depositar nessa conta por que esta fechada.");
        }
    }
    public  void sacar(float v){
        if (this.getStatus().equals(true)){
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                JOptionPane.showConfirmDialog(null, "Saque realizado na conta de "+this.getDono()+" do valor "+v);
            } else  {
                JOptionPane.showConfirmDialog(null, "Saldo insuficiente. \n Seu saldo atual é de: " + this.getSaldo());
            }
        }else {
            JOptionPane.showConfirmDialog(null, "Imporssivel sacar de uma conta fechada!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo().equals("CC")) {
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        if (this.getStatus().equals(true)) {
            if (this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
            } else{
                JOptionPane.showConfirmDialog(null, "mensalidade paga com sucesso por "+this.getDono());
            }
        }else{
            JOptionPane.showConfirmDialog(null, "Imporssivel pagar um conta fechada!");
        }
    }

    // metado especial contrutor
    public void ContaBanco(){
        this.status = false;
        this.saldo = 0;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
