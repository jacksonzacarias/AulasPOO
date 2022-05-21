package aula05;

public class ContaBanco {
    //Atributos
    public Integer numConta;
    protected String tipo;
    private String dono;
    private Float saldo;
    private Boolean status;

     //Metodos personalizados

    public void abrirConta() {

    }
    public  void fecharConta(){

    }
    public void depositar(){

    }
    public  void sacar(){

    }
    public void pagarMensal(){

    }

    // metado especial contrutor
    public void ContaBanco(){

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

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Float getSaldo() {
        return saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
