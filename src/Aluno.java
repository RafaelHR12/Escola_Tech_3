
public class Aluno {

	//Atributos:
		String nome;
		String senha;
		String email; //@
		String serie;

		//Métodos (funções):
		public String MostrarDados() {
			return "Nome: " + this.nome + ", Email: " + this.email;
		}
		
		public boolean VerificaEmail (String email) {
			if(email.contains("@"))
				this.email = email;
			else
				return false;
			return true;
		}
		
		public boolean VerificaSenha(String senha) {
			if ( senha.length() >= 6 && senha.length() <= 10 )
				if (senha.matches("[a-zA-Z0-9]*") )
					return true;
			return false;
				
		}
		
		public boolean verificaNome (String nome ) {
			if ( nome.length() >= 6 && nome.length() <= 100 )
				return true;
			return false;
		}
		
}
