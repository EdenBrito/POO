package fidelidade_viagens;

public class Passageiro {
	
	public String codigoViagem;
	public String nome;
	public String cpf;
	public String dataN;
	public String dataV;
	public Modal modal;
	
	
	public Passageiro(String codigoViagemX, String nomeX,
			String cpfX, String dataNX, String dataVX, Modal modalX){
		
		this.codigoViagem = codigoViagemX;
		this.nome = nomeX;
		this.cpf = cpfX;
		this.dataN = dataNX;
		this.dataV = dataVX;
		this.modal = modalX;
	}

	public int calcularPontos(String tipoX) {
		return modal.calcularPontos(tipoX);
	}
	
	public void imprimir() {
		
		System.out.println("\nCódigo Viagem: " + codigoViagem);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Data de Nascimento: " + dataN);
		System.out.println("Data da Viagem: " + dataV);
		System.out.println("Tipo: " + modal.tipo);
	}
}
