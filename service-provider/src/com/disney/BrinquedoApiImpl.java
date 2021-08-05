package com.disney;

import com.park.duke.api.Brinquedo;
import com.park.duke.api.BrinquedoAPI;

public class BrinquedoApiImpl implements BrinquedoAPI {

	@Override
	public Brinquedo getBrinquedo() {
		Brinquedo brinquedo = new Brinquedo();
		brinquedo.setNome("Roda Gigante");
		brinquedo.setCapacidadePessoas(4);
		brinquedo.setValorPorPessoa(7.00);
		brinquedo.setAlturaMinima(1.60);
		return brinquedo;
	}

}