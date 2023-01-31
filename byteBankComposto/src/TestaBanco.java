
public class TestaBanco {
	public static void main(String[] args) {
		Cliente cristian = new Cliente();
		cristian.nome = " Cristian Fabiano";
		cristian.cpf = " 222.222.222-22";
		cristian.profissao = " Analista";
		
		Conta contaCristian = new Conta();
		contaCristian.deposita(100);
		
		contaCristian.titular = cristian;
		System.out.println(contaCristian.titular.nome);
		System.out.println(contaCristian.titular.cpf);
		System.out.println(contaCristian.titular.profissao);
		System.out.println("\t\t\t*** Ambos tem o mesmo endereço de memória ***");
		System.out.println("\r\tO endereço da memória do titular da conta cristian - "+ contaCristian.titular);
		System.out.println("\tO endereço da memória da conta - " + cristian);
		
		
		
		

	}

}
