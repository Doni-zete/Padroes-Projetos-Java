package facade;


public class facade {

  public void migrarCliente(String nome , String cep){
   String cidade = CepApi.getInstancia().recuperarCidade(cep);
   String estado = CepApi.getInstancia().recuperarEstado(cep);
   CrmService.gravarCliente(nome,cep,cidade,estado);

  }
  
}
