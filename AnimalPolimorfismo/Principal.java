package AnimalPolimorfismo;

public class Principal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro ("thor", "M", "Pitbull");
		System.out.println("nome: " +cachorro.getNome());
		System.out.println("sexo: " +cachorro.getSexo());
		System.out.println("raca: " +cachorro.getRaca());
		cachorro.caminhar();
		cachorro.emitirSom();
		cachorro.correr();
		cachorro.dormir();
		
		System.out.println("                    ");
		
		Gato gato = new Gato ("mingau", "F", "Persa");
		System.out.println("nome: " +gato.getNome());
		System.out.println("sexo: " +gato.getSexo());
		System.out.println("raca: " +gato.getRaca());
		gato.emitirSom();
		gato.caminhar();
		gato.correr();
		gato.correr();
		
		System.out.println("                    ");
		
		Leao leao = new Leao ("Simba", "M", "Leao");
		System.out.println("nome: " +leao.getNome());
		System.out.println("sexo: " +leao.getSexo());
		System.out.println("raca: " +leao.getRaca());
		leao.emitirSom();
		leao.caminhar();
		leao.correr();
		leao.dormir();

		System.out.println("                    ");
		
		Lobo lobo = new Lobo ("scot", "M", "Preto");
		System.out.println("nome: " +lobo.getNome());
		System.out.println("sexo: " +lobo.getSexo());
		System.out.println("raca: " +lobo.getRaca());
		lobo.emitirSom();
		lobo.caminhar();
		lobo.correr();
		lobo.dormir();
		
		System.out.println("                    ");
		
		Tigre tigre = new Tigre ("Hakuna", "M", "Pintado");
		System.out.println("nome: " +tigre.getNome());
		System.out.println("sexo: " +tigre.getSexo());
		System.out.println("raca: " +tigre.getRaca());
		tigre.emitirSom();
		tigre.caminhar();
		tigre.correr();
		tigre.dormir();
		
	}

}
