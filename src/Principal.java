import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner teclado = new Scanner(System.in);

		 System.out.println("Informe quantos Estudantes serão cadastrados: ");
		 int numAlunos = teclado.nextInt();

		 while (numAlunos <= 0 || numAlunos >= 1001) {
		     System.out.println("Informe quantos Estudantes serão cadastrados novamente: ");
		     numAlunos = teclado.nextInt();
		 }

		 Aluno[] listaAlunos = new Aluno[numAlunos];

		 for (int i = 0; i < listaAlunos.length; i++) {
		     Aluno aluno = new Aluno(); // Criar um novo objeto aluno para cada iteração

		     System.out.println("\nInforme o nome do Estudante " + (i + 1) + ": ");
		     String nome = teclado.nextLine(); // Ler o nome
		     teclado.nextLine();
		     while (!aluno.verificaNome(nome)) {
		         System.out.println("Informe o Nome novamente: ");
		         nome = teclado.nextLine(); // Ler novamente o nome
		     }
		     aluno.nome = nome; // Atribuir o nome ao aluno

		     System.out.println("Informe a senha(6 à 10 digitos com letra minúscula, maiúscula e número): ");
		     String senha = teclado.next(); // Ler a senha
		     while (!aluno.VerificaSenha(senha)) {
		         System.out.println("Informe a senha novamente(6 à 10 digitos com letra minúscula, maiúscula e número): ");
		         senha = teclado.next(); // Ler novamente a senha
		     }
		     aluno.senha = senha; // Atribuir a senha ao aluno

		     System.out.println("Informe o E-mail: ");
		     String email = teclado.next(); // Ler o email
		     while (!aluno.VerificaEmail(email)) {
		         System.out.println("Informe o E-mail novamente: ");
		         email = teclado.next(); // Ler novamente o email
		     }
		     aluno.email = email; // Atribuir o email ao aluno

		     listaAlunos[i] = aluno; // Adicionar o aluno à lista
		 }

		 // Imprimir os dados dos alunos cadastrados
		 for (int i = 0; i < listaAlunos.length; i++) {
		     System.out.println(listaAlunos[i].MostrarDados());
		 }
	        
	        System.out.println("Informe quantos Professores serão cadastrados: ");
	        int numProfessores = teclado.nextInt();

	        while (numProfessores <= 0 || numProfessores >= 1001) {
			     System.out.println("Informe quantos Professores serão cadastrados novamente: ");
			     numAlunos = teclado.nextInt();
			 }
	        
	        Professor[] listaProfessores = new Professor[numProfessores];

	        for (int i = 0; i < listaProfessores.length; i++) {
	            Professor professor = new Professor(); // Criar um novo objeto professor
	            System.out.println("\nInforme o nome do professor: ");
	            teclado.nextLine();
	            professor.nome = teclado.nextLine();

	            System.out.println("Informe a senha(6 à 10 digitos com letra minúscula, maiúscula e número): ");
	            while (!professor.VerificaSenha(teclado.next())) {
	                System.out.println("Informe a Senha novamente(6 à 10 digitos com letra minúscula, maiúscula e número): ");
	            }

	            System.out.println("Informe o E-mail: ");
	            while (!professor.VerificaEmail(teclado.next())) {
	                System.out.println("Informe o E-mail novamente: ");
	            }

	            System.out.println("Informe o Telefone: ");
	            while (!professor.verificarTelefone(teclado.next())) {
	                System.out.println("Informe o Telefone novamente: ");
	            }

	            listaProfessores[i] = professor; // Adicionar o professor à lista
	        }
		
	        // Imprimir os dados dos professores cadastrados
			 for (int i = 0; i < listaAlunos.length; i++) {
			     System.out.println(listaProfessores[i].mostrarDados());
			 }
	        
	        
	        
		
		//Criar um objeto da classe Curso:
	        Curso curso = new Curso();

	     // Dados do Curso
	     System.out.println("Informe o nome do curso: ");
	     curso.nomeCurso = teclado.next();

	     System.out.println("Informe o código do curso: ");
	     curso.codigoCurso = teclado.next();

	     System.out.println("Informe a descrição do curso: ");
	     curso.descricaoCurso = teclado.next();

	     System.out.println("Informe a carga horária mínima do curso (horas): ");
	     curso.cargaHorariaCurso = teclado.nextInt();

	     System.out.println("Informe a quantidade de disciplinas este curso terá: ");
	     int numDisciplinas = teclado.nextInt();
	     
	     // Criar um array de Disciplina para armazenar as disciplinas do curso
	     Disciplina[] listaDisciplina = new Disciplina[numDisciplinas];

	     for (int i = 0; i < numDisciplinas; i++) {
	         // Para cada disciplina, criar um novo objeto Disciplina
	         Disciplina disc = new Disciplina();

	         // Dados da Disciplina
	         System.out.println("Informe o nome da disciplina " + (i + 1) + ": ");
	         disc.nomeDisciplina = teclado.next();

	         System.out.println("Informe o código da disciplina " + (i + 1) + ": ");
	         disc.codigoDisc = teclado.next();

	         System.out.println("Informe a descrição da disciplina " + (i + 1) + ": ");
	         disc.descricaoDisc = teclado.next();

	         System.out.println("Informe a carga horária da disciplina " + (i + 1) + " (horas): ");
	         disc.cargaHorariaDisc = teclado.nextInt();

	         System.out.println("Informe o valor da disciplina " + (i + 1) + ": ");
	         disc.valorDisc = teclado.nextDouble();

	         // Adicionar a disciplina à lista de disciplinas do curso
	         listaDisciplina[i] = disc;

	         // Adicionar o valor da disciplina ao valor total do curso
	         curso.valorCurso += disc.valorDisc;
	     }

	     // Imprimir o valor total do curso
	     System.out.println("O valor do curso " + curso.nomeCurso + " é: R$" + curso.valorCurso);
		
		
		
	     Nota[][] listaNotas = new Nota[numAlunos][numDisciplinas];

	     for (int l = 0; l < numAlunos; l++) {
	         for (int c = 0; c < numDisciplinas; c++) {
	             Nota nota = new Nota(); // Criar um novo objeto Nota
	             System.out.println("Informe a nota do Estudante " + (l + 1) + " na disciplina " + (c + 1) + ": ");
	             // nota.nota = teclado.nextDouble();
	             while (!nota.verificarNota(teclado.nextDouble())) {
	                 System.out.println("Informe a nota do Estudante " + (l + 1) + " na disciplina " + (c + 1) + ": ");
	             }
	             listaNotas[l][c] = nota; // Atribuir a nota à matriz de notas
	         }
	     }
	     
	     Presenca presenca = new Presenca(); // Criar um novo objeto Presenca
	     
	     System.out.print("Digite a quantidade total de aulas do curso: ");
	     presenca.qtddAulas = teclado.nextInt();
	     teclado.nextLine();

	     Presenca[][] listaPresenca = new Presenca[presenca.qtddAulas][numAlunos];

	     for (int l = 0; l < listaPresenca.length; l++) {
	         System.out.println("\nAula " + (l + 1) + ":");
	         for (int c = 0; c < numAlunos; c++) {
	             System.out.print("O aluno " + (c + 1) + " estava presente? (S/N): ");
	             presenca.resposta = teclado.nextLine();
	             listaPresenca[l][c] = presenca; // Atribuir a presença à matriz de presença
	         }
	     }

        
	}

}
