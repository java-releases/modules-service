package zoo.turismo.agencia;

import zoo.turismo.api.Passeio;
import zoo.turismo.api.Souvenir;

public class PasseioDeCanoaImpl implements Passeio {

	@Override
	public String nome() {
		return "passeio de canoa";
	}

	@Override
	public int tamanho() {
		return 123;
	}

	@Override
	public Souvenir getSouvenir() {
		return null;
	}

}
