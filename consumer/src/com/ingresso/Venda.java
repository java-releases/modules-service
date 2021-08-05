package com.ingresso;

import java.util.List;

import com.park.duke.api.BrinquedoAPI;
import com.park.duke.locator.LocatorBrinquedoAPI;

public class Venda {

	public static void main(String[] args) {
		final List<BrinquedoAPI> api = LocatorBrinquedoAPI.findAll();
		for (final BrinquedoAPI brinquedoAPI : api) {
			System.out.println(brinquedoAPI.getBrinquedo());
			System.out.println("");
		}

		if (api == null || api.isEmpty()) {
			System.out.println("#############################################");
			System.out.println("NAO EXISTEM BRINQUEDOS A VENDA NO MOMENTO");
			System.out.println("#############################################");
		}
	}

}