package abstracao_cliente;

public class Pessoa_Fisica extends Cliente {
	
	String cpf;
	String dataNasc;
	String estadoCivil;
	
	public String getCPF() {
    	return cpf;
    }
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    public String DataNasc() {
    	return dataNasc;
    }
    public void DataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    public String getEstadoCivil() {
    	return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
	public String tipo_Conta() {
		return "Pessoa Física";//se não chamar este método terá problemas pois ele está vazio na classe mãe
	}
}
