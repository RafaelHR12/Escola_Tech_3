
public class Professor {

	String nome;
	String senha;
	String email;
	String telefone;
	
	public boolean VerificaEmail (String email) {
		if(email.contains("@"))
			this.email = email;
		else
			return false;
		return true;
	}
	
	public boolean VerificaSenha(String senha) {
		
		if ( senha.length() >= 6 ) {
			if ( senha.matches("[a-zA-Z0-9]+") ) { // No MÍNIMO uma
				this.senha = senha;
			} else {
				return false;
			}
		} else {
			return false;
		}
		return true;
		
	}
	public boolean verificarTelefone(String telefone) {
		if (telefone.length() < 11 || telefone.length() > 11)
			return false;
		else
			return true;
	}

	public String mostrarDados() {
		return "Nome: " + this.nome + ", Email: " + this.email;
	}
}
