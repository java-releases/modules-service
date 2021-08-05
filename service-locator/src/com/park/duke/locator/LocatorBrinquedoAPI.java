package com.park.duke.locator;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import com.park.duke.api.BrinquedoAPI;

public class LocatorBrinquedoAPI {

	public static List<BrinquedoAPI> findAll() {
		List<BrinquedoAPI> brinquedos = new ArrayList<>();
		ServiceLoader<BrinquedoAPI> loader = ServiceLoader.load(BrinquedoAPI.class);
		for (final BrinquedoAPI passeio : loader) {
			brinquedos.add(passeio);
		}
		return brinquedos;
	}

}