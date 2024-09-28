package abstracao_cliente;

public class Pessoa_Juridica extends Cliente {

	String cnpj;
	String responsavel;
	String porteEmpresa;
	
	public String getCNPJ() {
    	return cnpj;
    }
    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getResponsavel() {
    	return responsavel;
    }
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    public String getPorteEmpresa() {
    	return porteEmpresa;
    }
    public void setPorteEmpresa(String porteEmpresa) {
        this.porteEmpresa = porteEmpresa;
    }
    
	public String tipo_Conta() {
		return "Pessoa Juridica";
	}
}
