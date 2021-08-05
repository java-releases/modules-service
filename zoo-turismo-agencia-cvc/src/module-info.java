module zoo.turismo.agencia.cvc {

	requires zoo.turismo.api;

	provides zoo.turismo.api.Passeio with zoo.turismo.agencia.cvc.PasseioImpl;

	uses zoo.turismo.api.Passeio;
}