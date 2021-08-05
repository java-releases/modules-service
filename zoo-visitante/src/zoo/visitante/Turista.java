package zoo.visitante;

import java.util.List;

import zoo.turismo.api.Passeio;
import zoo.turismo.reservas.EncontraPasseio;

public class Turista {

	public static void main(String[] args) {

		Passeio passeio = EncontraPasseio.buscarQualquerPasseio();
		System.out.print("Qualquer passeio: " + passeio.nome());

		List<Passeio> passeios = EncontraPasseio.buscarTodosPasseios();
		System.out.println("Quantidade de passeios: " + passeios.size());
	}

}