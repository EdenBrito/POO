package apartamento_09_20;

public class Apartamento {
	
	String proprietario;
	int qtdQuartos;
	int qtdBanheiros;
	double area;
	boolean varandaGourmet;	
	
	String recuperaDadosParaImpressao() {
		
		String dados = "Proprietario: " + this.proprietario;
		dados += "\nQuantidade de Quartos: " + this.qtdQuartos;
		dados += "\nQuantidade de Banheiros: " + this.qtdBanheiros;
		dados += "\nArea Total: " + this.area;
		dados += "\nPossui varanda Gourmet?? " + this.varandaGourmet + "\n";
		return dados;
	}
	
	void imprimir() {
		System.out.println(recuperaDadosParaImpressao());
	}
}
