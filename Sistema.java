package models;

public class Sistema {

	public static void main(String[] args) {
		Loja l1 = new Loja("Lojão");
		Produto p1 = new Produto(123, "Garrafa de agua ", 1.30, 2);
		Produto p2 = new Produto(122, "Pão ", 9.20, 10);
		l1.addProduto(p2);
		l1.addProduto(p1);
		p2.setDescricao("Pão de forma");
		p2.setPreco(10.2);
		p2.setEstoque(2);
		l1.imprimirProdutos();
	}

}
