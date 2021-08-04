module zoo.turismo.agencia {

	requires zoo.turismo.api;

	provides zoo.turismo.api.Passeio with zoo.turismo.agencia.PasseioImpl;

}