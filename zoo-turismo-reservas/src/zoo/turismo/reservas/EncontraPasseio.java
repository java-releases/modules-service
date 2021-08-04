package zoo.turismo.reservas;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import zoo.turismo.api.Passeio;

public class EncontraPasseio {

	public static Passeio buscarQualquerPasseio() {
		ServiceLoader<Passeio> loader = ServiceLoader.load(Passeio.class);
		for (Passeio passeio : loader) {
			return passeio;
		}
		return null;
	}

	public static List<Passeio> buscarTodosPasseios() {
		List<Passeio> passeios = new ArrayList<>();
		ServiceLoader<Passeio> loader = ServiceLoader.load(Passeio.class);
		for (Passeio passeio : loader) {
			passeios.add(passeio);
		}
		return passeios;
	}

}