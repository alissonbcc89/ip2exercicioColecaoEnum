package AtividadePratica;

public class CidadeEnum {
	
RECIFE, SAOPAULO,RIO DE JANEIRO, MACEIO
	
	private final int valor;
	
	CidadeEnum(int valorOpcao)
	{
		valor = valorOpcao;
		System.out.println("Valor:" + valor);
		
	}
	
	public int getValor()
	{
		return valor;
	}
	

}
