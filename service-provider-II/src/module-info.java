module com.betocarrero {

	requires com.park.duke.api;
	requires com.park.duke.locator;

	provides com.park.duke.api.BrinquedoAPI with com.betocarrero.BrinquedoApiImpl;

}