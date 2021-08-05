module com.disney {

	requires com.park.duke.api;

	requires com.park.duke.locator;

	provides com.park.duke.api.BrinquedoAPI with com.disney.BrinquedoApiImpl;

}