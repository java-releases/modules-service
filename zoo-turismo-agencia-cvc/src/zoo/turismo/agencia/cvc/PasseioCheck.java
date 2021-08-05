package zoo.turismo.agencia.cvc;

import java.util.OptionalInt;
import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;

import zoo.turismo.api.Passeio;

public class PasseioCheck {

	public static void main(String[] args) {
		OptionalInt max = ServiceLoader.load(Passeio.class)//
				.stream()//
				.map(Provider::get)//
				.mapToInt(Passeio::tamanho)//
				.max();//

		max.ifPresent(System.out::println);

		OptionalInt min = ServiceLoader.load(Passeio.class)//
				.stream()//
				.map(Provider::get)//
				.mapToInt(Passeio::tamanho)//
				.min();//

		min.ifPresent(System.out::println);
	}
}
