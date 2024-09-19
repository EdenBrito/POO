package fidelidade_viagens;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		int pontos = 0;
		
		int cadastro = 1;
		cadastro = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de cadastros: "));
		
		String name = JOptionPane.showInputDialog("Informe o Nome");
		String cpfs = JOptionPane.showInputDialog("Informe o CPF");
		String datan = JOptionPane.showInputDialog("Data de nascimento");
		
		for(int i = 1 ; i <= cadastro ; i++){
			
			String cod = JOptionPane.showInputDialog("Informe o código da viagem");
			String datav = JOptionPane.showInputDialog("Data da viagem");
			String modal1 = null;
			String modelo = null;
						
			int opc = 0;
			opc= Integer.parseInt(JOptionPane.showInputDialog(" Informe o meio de transporte: \n 1 - Aereo \n 2 - Rodoviario \n 3 - Ferroviario \n "));
		    switch (opc){
		        case 1: modal1 = "Aereo";
		            break;
		        case 2: modal1 = "Rodoviario";
		            break;
		        case 3: modal1 = "Ferroviario";
		            break;
		        default: JOptionPane.showMessageDialog(null, "Opcao invalida!");
		    }
		    
		    int opc2 = 0;
			opc2= Integer.parseInt(JOptionPane.showInputDialog(" Informe o tipo de categoria: \n 1 - Standart \n 2 - Luxo \n "));
		    switch (opc2){
		        case 1: 
		        	modelo = "Standart";
		        
		        Modal mods = new Standart ();
			    Passageiro p1 = new Passageiro (null, null, null,null, null, mods);
				
					p1.codigoViagem = cod;
					p1.nome = name;
					p1.cpf = cpfs;
					p1.dataN = datan;
					p1.dataV = datav;
					p1.modal = mods;
					pontos = pontos + p1.calcularPontos(modal1);
					p1.imprimir();
					System.out.println("Modal: " + modal1);
					System.out.println("Pontos Acumulados: " + pontos);
		        	break;
		            
		        case 2: modelo = "Luxo";
		        	Modal mds = new Luxo ();
		        	Passageiro p2 = new Passageiro (null, null, null,null, null, mds);
		        	
		        	p2.codigoViagem = cod;
		        	p2.nome = name;
		        	p2.cpf = cpfs;
		        	p2.dataN = datan;
		        	p2.dataV = datav;
		        	p2.modal = mds;
		        	pontos = pontos + p2.calcularPontos(modal1);
		        	p2.imprimir();
		        	System.out.println("Modal: " + modal1);
		        	System.out.println("Pontos Acumulados: " + pontos);
		        	break;
		        	
		        default: JOptionPane.showMessageDialog(null, "Opcao invalida!");
		    }
		}	
	}	
}