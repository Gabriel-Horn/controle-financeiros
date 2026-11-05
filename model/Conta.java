package model;

public class Conta {
    
    private String numeroConta;
    private String titular;
    private double saldo;
    private double limite;
    
    //CONSTRUTOR
    public Conta (String numeroConta, String titular) {
        
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

     public Conta() {

    }
    
    //Getters e Setters
    
    public String getNumeroConta() {
        return this.numeroConta;
    }
   
    public String getTitular() {
        return this.titular;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public double getLimite() {
        return this.limite;
    }
    
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;                                                                                                                                  
    }

    public void setCliente(String cliente) {
        this.titular = titular;
    }
    
};
 
