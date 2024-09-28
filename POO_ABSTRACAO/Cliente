package abstracao_cliente;

public abstract class Cliente {
	
	private String nome;
	private int agencia;
	private int conta;
	private double saldo;
	public String data;
	
	public abstract String tipo_Conta();//este metodo pode estar vazio, mas deve ser mencionado nas classes filhas
	
	public String getNome() {//O método get é usado para recuperar o valor de um atributo privado de uma classe.
        return nome;
    }
    public void setNome(String nome) {	//set - Um método set é usado para definir ou alterar o valor de um atributo privado.
    	this.nome = nome;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
    	this.agencia = agencia;
    }
    public int getConta() {
    	return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
    	this.saldo = saldo;
    }
    public String getData() {
    	return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void imprimir() {
    	System.out.println("Saldo: " + saldo);
		System.out.println("Agencia: " + agencia);
		System.out.println("Conta: " + conta);
	}
}
