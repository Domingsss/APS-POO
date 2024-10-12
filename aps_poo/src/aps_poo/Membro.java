package aps_poo;

public class Membro implements Pessoa{
	private String nome;
	private int membroId;
	
	public Membro(String nome, int membroId){
		this.nome = nome;
		this.membroId = membroId;
	}
	
	@Override
	public String getNome() {
		return nome;
	}
	
	@Override
	public int getId() {
		return membroId;
	}
	
}
