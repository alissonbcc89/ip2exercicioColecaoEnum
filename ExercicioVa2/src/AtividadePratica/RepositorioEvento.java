package AtividadePratica;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class RepositorioEvento implements Comparable{
	
	
	ArrayList<Evento> event = new ArrayList<Evento>();
	
	Map<String,Evento> eventos =  new TreeMap<String,Evento>();
	
	Evento e ;
	
	public RepositorioEvento(ArrayList<Evento> eventos, Evento e)
	{
		this.event = new ArrayList<Evento>();
		
	}

		
	public ArrayList<Evento> getEvent() 
	{
		return event;
	}


	public void adicionar(ArrayList<Evento> evento)
	{
		ArrayList<Evento>aux = new ArrayList<Evento>()
				;
		for(int i = 0; i < evento.size(); i++)
		{
			aux.add(eventos.get(i));
			
		eventos.put(aux.get(i).getNome(),aux.get(i));
		}
		
	}


	
	
	//Crie um método boolean contemEvento(String nomeEvento), que verifica se um dado Evento cujo nome 
//	é informado como parâmetro está presente no repositório.
	//Você deve chamar o método get do Map ou usar o método contains
	
	@Override
	public String toString() {
		
		
//        System.out.println("LocalDateTime depois de formatar: " + agoraFormatado);

		
		ArrayList<Evento> aux = new ArrayList<Evento>();
		
		
		for(int i = 0; i < eventos.size(); i++)
		{
			
			
			if(eventos.get(i)!= null)
			{
				 LocalDateTime agora = LocalDateTime.now();
				
				aux.add(eventos.get(i));
			}
		
		}
		for(int i = 0; i< aux.size(); i++)
		{
			
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		LocalDateTime agora = aux.get(i).getDataHora();
		
        String agoraFormatado = agora.format(formatter);

        	return "Nome do Evento:"+ aux.get(i).getNome()+ "\nCidade:"+aux.get(i).getLocais() +"\n"+ agoraFormatado ;
		}
	}


	public boolean contemEvento(String nomeEvento)
	{
		//+example.get(keyToSearch));
		boolean aux = false;
		for(int i = 0; i< eventos.size(); i++)
		{
			if(eventos.get(nomeEvento) != null)
			{
				aux = true;
			}
		}
		
		return aux;
	}
	
	
//	Crie um método ordenarPorData que ordene todos os eventos da lista por data. 
//	Você deve recuperar todos os valores do map (Collection) criar uma lista e 
//ordená-la através da implementação da interface Comparable na classe Evento
	
	public void ordenaMap(Map eventos)
	{	
			Iterator <Evento> itr = ((ArrayList<Evento>) this.eventos).iterator();
		while(itr.hasNext())
		{
			e = itr.next();
			System.out.println();
			
		}
		
		
	
		
		
	}
	
	public ArrayList<Evento> ordenarPorData()
	{
		Collections.sort(eventos, new Comparator<Evento>() {
			  public int compare(eventos.localDateTime , eventos.localDateTime ) {
			      if (o1.getDate() == null || o2.getDate() == null)
			        return 0;
			      return o1.getDataHora().compareTo(eventos.getDataHora());
			  }
		

			@Override
			public int compare(Evento arg0, Evento arg1) {
				// TODO Auto-generated method stub
				return 0;
			}}
	}

	/*Iterator<Aluno> itr = lista.iterator();
    while (itr.hasNext()) {
      aluno = itr.next();
      System.out.println(aluno.getNome());
    }*/
	
	
	public ArrayList<Evento> ordenarPorLocal()
	{
		
	}


	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
