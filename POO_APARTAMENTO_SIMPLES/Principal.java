package apartamento_09_20;

public class Principal {
	public static void main(String[] args) {
		
		Apartamento ap1 = new Apartamento();
    	ap1.proprietario = "Charles Bronson";
    	ap1.qtdQuartos = 2;
    	ap1.qtdBanheiros = 2;
    	ap1.area = 60;
    	ap1.varandaGourmet = false;
    	ap1.imprimir();

    	Apartamento ap2 = new Apartamento();
    	ap2.proprietario = "Carlitos Tevez";
    	ap2.qtdQuartos = 3;
    	ap2.qtdBanheiros = 4;
    	ap2.area = 80;
    	ap2.varandaGourmet = true;
    	ap2.imprimir();
     }
}
