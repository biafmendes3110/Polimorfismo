package FuncionarioAtiv;

public class Jornada extends Funcionario {
	public Jornada () {
	}

	public Jornada (long id, String nome, String telefone, int matricula,String endereco) {
		super (id, nome, telefone, matricula , endereco );
	}

	@Override
	public double calculaSalario (double salariohora, double horasTrabalhadas) {
		return salariohora*horasTrabalhadas;

	}
}

