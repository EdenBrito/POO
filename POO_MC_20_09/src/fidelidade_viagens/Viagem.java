package fidelidade_viagens;


import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Viagem {
	
	public String data() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String entrada = JOptionPane.showInputDialog("Informa a Data de nascimento: " );
		try {
			sdf.setLenient(false);
			Date d = sdf.parse(entrada);
			System.out.println("Data de entrada: " + sdf.format(d));
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return entrada;
	}
			
	public String codigoViagem;
	public String nome;
	public String cpf;
	public String dataN;
	public String dataV;
	public String modal;
	public String tipo;
		
	public Viagem(String codigoViagemX, String nomeX, String cpfX, String dataNX, String dataVX, String modalX, String tipoX) {
		this.nome = nomeX;
		this.cpf = cpfX;
		this.dataN = dataNX;
		this.dataV = dataVX; 
		this.modal = modalX;  
		this.tipo = tipoX;
	}
}