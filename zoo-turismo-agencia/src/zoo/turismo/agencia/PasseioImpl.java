package zoo.turismo.agencia;

import zoo.turismo.api.Passeio;
import zoo.turismo.api.Souvenir;

public class PasseioImpl implements Passeio {

	@Override
	public String nome() {
		return "A dança dos gorilas";
	}

	@Override
	public int tamanho() {
		return 120;
	}

	@Override
	public Souvenir getSouvenir() {
		Souvenir souvenir = new Souvenir();
		souvenir.setDescricao("Macaco de pelúcia");
		return souvenir;
	}

}