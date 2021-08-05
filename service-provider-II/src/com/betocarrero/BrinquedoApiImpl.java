package com.betocarrero;

import com.park.duke.api.Brinquedo;
import com.park.duke.api.BrinquedoAPI;

public class BrinquedoApiImpl implements BrinquedoAPI {

	@Override
	public Brinquedo getBrinquedo() {
		final Brinquedo brinquedo = new Brinquedo();
		brinquedo.setNome("Casa do terror");
		brinquedo.setAlturaMinima(1.20);
		brinquedo.setValorPorPessoa(4.50);
		brinquedo.setCapacidadePessoas(2);
		return brinquedo;
	}

}