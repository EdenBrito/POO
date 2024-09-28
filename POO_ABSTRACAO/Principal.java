package abstracao_cliente;

public class Principal {

	public static void main(String[] args) {
		
		//criando um objeto de Pessoa_Fisica
		Cliente pf1 = new Pessoa_Fisica ();
		
		pf1.setNome("Charles Bronson");
		pf1.setAgencia(1);
		pf1.setConta(1052);
		pf1.setSaldo(500);
		pf1.setData("01/01/2021");
		pf1.tipo_Conta();
		((Pessoa_Fisica)pf1).cpf = "123.456.789-10";
		((Pessoa_Fisica)pf1).dataNasc = "28/01/1987";
		((Pessoa_Fisica)pf1).estadoCivil = "casado";
		pf1.imprimir();
		System.out.println("Tipo de conta: " + pf1.tipo_Conta() +"\n");
		
		//Ao final deverá exibir na tela o Saldo, o tipo da Conta a agencia e conta
		
		//criando um objeto de Pessoa_Juridica
		Cliente pj1 = new Pessoa_Juridica();
		
		pj1.setNome("Bronson's.S.A");
		pj1.setAgencia(13);
		pj1.setConta(2525);
		pj1.setSaldo(1000);
		pj1.setData("01/01/2024");
		pj1.tipo_Conta();
		((Pessoa_Juridica)pj1).cnpj = "123.456.789-10";
		((Pessoa_Juridica)pj1).responsavel = "Charles Bronson";
		((Pessoa_Juridica)pj1).porteEmpresa = "Medio";
		pj1.imprimir();
		System.out.println("Tipo de conta: " + pj1.tipo_Conta() +"\n");
		
	}
}
