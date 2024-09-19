package fidelidade_viagens;

public class Modal {
	
	public String tipo;
	public int ptAereo;
	public int ptRodoviario;
	public int ptFerroviario;
	
	public Modal (String tipoX, int ptAereoX,
			int ptRodoviarioX, int ptFerroviarioX) {
		
		this.tipo = tipoX;
		this.ptAereo = ptAereoX;
		this.ptRodoviario = ptRodoviarioX;
		this.ptFerroviario = ptFerroviarioX;
	}
	
	public int calcularPontos(String tipoX) {
		if (tipoX.equals("Aereo")) {
			return ptAereo;
		} else if (tipoX.equals("Rodoviario")) {
			return ptRodoviario;
		} else if (tipoX.equals("Ferroviario")) {
			return ptFerroviario;
		}
		return 0;
	}
}
