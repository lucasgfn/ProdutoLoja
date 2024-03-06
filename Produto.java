package models;

public class Produto {
	private int id;
	private String descricao;
	private double preco;
	private int estoque;
	
	public Produto(int id, String descricao, double preco, int estoque) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.estoque = estoque;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if(tratarExcecao()==false) {
			this.descricao = descricao;
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if(this.preco<0f) {
			throw new IllegalArgumentException("Deve ser informado um valor postivo");
		}
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		if(this.estoque>0f) {
			this.estoque = estoque;
		}
	}
	

	public boolean tratarExcecao() {
		if(this.descricao.isEmpty()) {
			throw new IllegalArgumentException("Descrição não pode ser vazia");
		}else if(this.descricao == null) {
			throw new IllegalArgumentException("Descrição não pode ser nula");
		}
		return false;
	}

	@Override
	public String toString() {
		return "Produto (ID:" + id + ") \nDescricao: " + descricao + "\nPreço: R$" + preco + " | Estoque: " + estoque+" und.";
	}
	
	
	
	
	

}
