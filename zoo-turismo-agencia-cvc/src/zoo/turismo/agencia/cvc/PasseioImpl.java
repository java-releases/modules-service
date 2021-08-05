package zoo.turismo.agencia.cvc;

import zoo.turismo.api.Passeio;
import zoo.turismo.api.Souvenir;

public class PasseioImpl implements Passeio {

	@Override
	public String nome() {
		return "Passeio da nova agencia";
	}

	@Override
	public int tamanho() {
		return 458;
	}

	@Override
	public Souvenir getSouvenir() {
		Souvenir souvenir = new Souvenir();
		souvenir.setDescricao("chaveiro do inter");
		return souvenir;
	}

}