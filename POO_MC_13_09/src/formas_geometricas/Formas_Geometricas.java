package formas_geometricas;

public class Formas_Geometricas {
	
	public String forma;
	public int ladoA;
	public int ladoB;
	public int ladoC;
	public int raio;
	public double pi = 3.1415;
	
	public double perimCirc() {
    	return 2 * pi * raio;
	}
	
	public double areaCirc() {
    	return pi * (Math.pow(raio,2));
	}
	
	public int perimQuad() {
    	return 4 * ladoA;
	}
	
	public double areaQuad() {
    	return (Math.pow(ladoA,2));
	}
	
	public int perimRet() {
    	return (2 * ladoA) + (2 * ladoB);
	}
	
	public int areaRet() {
    	return ladoA * ladoB;
	}
	
	public double perimTriBH() {
    	return ladoA + ladoB + (Math.sqrt((ladoA * ladoA) + (ladoB * ladoB)));
	}

	public double areaTriBH() {
    	return (ladoA * ladoB) / 2;
	}
	
	public int perimTriLados() {
    	return ladoA + ladoB + ladoC;
	}
	
	public double areaTriLados() {
		int sPer = perimTriLados()/2;
    	return Math.sqrt(sPer * (sPer-ladoA) * (sPer-ladoB) * (sPer-ladoC));
	}
}
