
public class app {

	public static void main(String[] args) {
		funcionario f = new funcionario();
		f.setNome("Valmir da o bote");
		f.setSl(1000);
		f.aumentasl();
		System.out.println("Funcionario => Nome: " + f.getNome() + " Salario: " + f.getSl());
		
		Gerente g = new Gerente();
		g.setNome("Marcelo");
		g.setSl(2000);
		g.aumentasl();
		System.out.println("Gerente = > Nome: " + g.getNome() + " Salario: " + g.getSl());
		
		Programador j = new Programador();
		j.setNome("Pedro");
		j.setSl(5000);
		j.aumentasl();
		System.out.println("Progamador = > Nome: " + j.getNome() + " Salario: " + j.getSl());
	
		Analista a = new Analista();
		a.setNome("Rafael");
		a.setSl(1800);
		g.aumentasl();
		System.out.println("Analista = > Nome: " + f.getNome() + " Salario: " + f.getSl());
	}

}
