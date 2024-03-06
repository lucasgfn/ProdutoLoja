package models;

import java.util.ArrayList;

public class Loja {
	private String nomeLoja;
	private ArrayList<Produto> produtos;

	public Loja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
		this.produtos = new ArrayList<Produto>();
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public void addProduto(Produto novoProduto) {
		if(!this.produtos.contains(novoProduto)) {
			this.produtos.add(novoProduto);
		}
	}
	
	public void removeProduto(Produto umProduto) {
		this.produtos.remove(umProduto);
	}
	
	public void imprimirProdutos() {
		System.out.println("Loja: "+ nomeLoja+"\n");
		for(Produto produto: this.produtos) {
			System.out.println(produto.toString()+"\n");
		}
	}
	

}
