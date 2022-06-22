
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("Reinan");
		funcionario1.setCpf("123.123.123.12");
		funcionario1.setSalario(2000.00);
		
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getBonificacao());

	}

}
