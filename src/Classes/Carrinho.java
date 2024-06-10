package Classes;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    protected static List<Produto> Carrinho = new ArrayList<Produto>();
    protected static double Subtotal;

    public static void AdicionarProdutos(Produto produtorecebido){
       Carrinho.add(produtorecebido);
    }
    public static void exibirprodutos(){
        for (Produto produtonocarrinho : Carrinho) {
          double interacaosubtotal = Produto.CalcularSubtotal(produtonocarrinho);
          Subtotal += interacaosubtotal;

          System.out.println(produtonocarrinho);
        }
        System.out.println("O valor de todos os itens ficou de : R$ " + Subtotal);
    }

}
