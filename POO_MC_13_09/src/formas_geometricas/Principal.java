package formas_geometricas;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
    	
    	int opc;
    	opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Circunferencia \n 2 - Quadrado \n 3 - Retângulo \n 4 - Triângulo"));
    	
    	switch (opc) {
    		case 1: 
    			Formas_Geometricas circulo = new Formas_Geometricas();
    	        circulo.raio = Integer.parseInt(JOptionPane.showInputDialog("Informe o raio da circunferencia: "));
    	        
    	        System.out.println("A área da circunferencia eh " + circulo.areaCirc() + "\n e o perímetro eh " + circulo.perimCirc() +"\n");
    	        break;
    	        
    		case 2:
    	        Formas_Geometricas quadrado = new Formas_Geometricas();
    	        quadrado.ladoA = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor dos lados do quadrado: "));
    	        
    	        System.out.println("A área do quadrado eh " + quadrado.areaQuad() + "\n e p perímetro eh " + quadrado.perimQuad() +"\n");
    	        break;

    		case 3:
    			Formas_Geometricas retangulo = new Formas_Geometricas();
    	        retangulo.ladoA = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da base do retangulo: "));
    	        retangulo.ladoB = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da altura do retangulo: "));
    	        
    	        System.out.println("A área do retangulo eh " + retangulo.areaRet() + "\n e o perímetro eh " + retangulo.perimRet() +"\n");
    	        break;

    		case 4:
    			
    			int opc2;
    	    	opc2 = Integer.parseInt(JOptionPane.showInputDialog(" 5 - Base e altura do triângulo \n 6 - possui os tres lados do triângulo "));
    	    	
    	    	switch (opc2) {
    				case 5:
    			
    					Formas_Geometricas trianguloBH = new Formas_Geometricas();
    					trianguloBH.ladoA = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da base do triangulo: "));
    					trianguloBH.ladoB = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da altura do triangulo: "));
    					
    					System.out.println("A área do triangulo eh " + trianguloBH.areaTriBH() + "\n e o perímetro eh " + trianguloBH.perimTriBH() +"\n");
    					break;
    				
    				case 6:
    					
    					Formas_Geometricas trianguloLados = new Formas_Geometricas();
    					trianguloLados.ladoA = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do lado A do triangulo: "));
    					trianguloLados.ladoB = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do lado B do triangulo: "));
    					trianguloLados.ladoC = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do lado C do triangulo: "));
    					
    					System.out.println("A área do triangulo eh " + trianguloLados.areaTriLados() + "\n e o perímetro eh " + trianguloLados.perimTriLados() +"\n");
    					break;
    					
    				default: 
    					System.out.println("Informe uma opção valida!!");
    	    	}
    			break;
    			
    		default: 
    		System.out.println("Informe uma opção valida!!");
    	}
	}
}
