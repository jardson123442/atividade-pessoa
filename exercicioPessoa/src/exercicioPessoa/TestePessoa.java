package exercicioPessoa;

public class TestePessoa {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Pessoa pessoaA = new Pessoa("Carlos", 30);
		Pessoa pessoaB = new Pessoa("Brenda", 24);
	
		System.out.printf("O nome da pessoa é %s e a idade é %d.\n", pessoaA.getNome(), 
				pessoaA.getIdade());
		System.out.printf("O nome da pessoa é %s e a idade é %d.", pessoaB.getNome(), 
				pessoaB.getIdade());
	}
	
}
