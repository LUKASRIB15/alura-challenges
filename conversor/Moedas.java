package conversor;

public class Moedas {
	private double valor;
	private String type;
	
	// Setters e Getters
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	// Modos de conversão
	
	
	public double realParaDolar(double valor) {
		this.setType("dollares");
		double conversao = 5 * valor;
		return conversao;
	}
	
	public double realParaEuro(double valor) {
		this.setType("euros");
		double conversao = 5.32 * valor;
		return conversao;
	}
	
	public double realParaLibra(double valor) {
		this.setType("libras");
		double conversao = 6.20 * valor;
		return conversao;
	}
	
	public double realParaPesosArgentinos(double valor) {
		this.setType("pesos argentinos");
		double conversao = 0.014 * valor;
		return conversao;
	}
	
	public double realParaPesoChileno(double valor) {
		this.setType("peso chileno");
		double conversao = 0.0058 * valor;
		return conversao;
	}
	
	public double dollarParaReal(double valor) {
		this.setType("reais");
		double conversao = valor / 5;
		return conversao;
	}
	
	public double euroParaReal(double valor) {
		this.setType("reais");
		double conversao = valor / 5.32;
		return conversao;
	}
	
	public double libraParaReal(double valor) {
		this.setType("reais");
		double conversao = valor / 6.20;
		return conversao;
	}
	
	public double pesosArgentinosParaReal(double valor) {
		this.setType("reais");
		double conversao = valor / 0.014;
		return conversao;
	}
	
	public double pesoChilenoParaReal(double valor) {
		this.setType("reais");
		double conversao = valor / 0.0058;
		return conversao;
	}
}
