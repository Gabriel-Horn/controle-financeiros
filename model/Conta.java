package model;

public class Conta {
    
    private String numero;
    private String cliente;
    private double saldo;
    private double limite;
    
    //CONSTRUTOR
    public Conta (String numero, String cliente) {
        
        this.numero = numero;
        this.cliente = cliente;
    }
    
    //Getters e Setters
    
    public String getNumero() {
        return this.numero;
    }
   
    public String getCliente() {
        return this.cliente;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public double getLimite() {
        return this.limite;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
}
