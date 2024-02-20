
public class Nota {

double nota;
	
	//Métodos
	public boolean verificarNota (double nota) {
		if (nota < 0 || nota > 10)
			return false;
		else
			return true;
	}

}
