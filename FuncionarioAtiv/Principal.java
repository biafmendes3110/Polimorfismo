package FuncionarioAtiv;

public class Principal {

	public static void main(String[] args) {	
			Jornada hora = new Jornada ();
			System.out.println(hora.calculaSalario(80, 8));
			
			Horista horista = new Horista ();
			System.out.println(horista.calculaSalario(50, 5));
			
			PessoaJuridica pessoaJuridica = new PessoaJuridica();
			
			System.out.println(pessoaJuridica.calculaSalario(60000, 7000));
			
	
	}

}
