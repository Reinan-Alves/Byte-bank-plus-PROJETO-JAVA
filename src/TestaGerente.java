
public class TestaGerente {

	public static void main(String[] args) {
		

		Gerente g1 = new Gerente();
		
		g1.setNome("george");
		g1.setCpf("321.321.321.32");
		g1.setSalario(5000.00);
		g1.setSenha(123);
		
		System.out.println(g1.getNome());
		System.out.println(g1.autenticou(123));
		System.out.println(g1.getBonificacao());
		
	}

}
