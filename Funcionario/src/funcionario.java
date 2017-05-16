
public class funcionario {
	//atributos
	private String nome;
	protected double sl;
	
	//construtor
	funcionario(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSl() {
		return sl;
	}

	public void setSl(double sl) {
		this.sl = sl;
	}

	public void aumentasl() {
		setSl(getSl()* 0.35);
		
		
	}
	
}
