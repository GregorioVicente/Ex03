package Classes;

import java.util.Scanner;

public class Produto {
    private String nome;
    private float ValorUnidade;
    private int Unidades;
    private float ValorTotal;

    Scanner Lerinformacoes = new Scanner(System.in);

    public Produto(){
        this.nome = Lerinformacoes.nextLine();
        this.ValorUnidade = Lerinformacoes.nextFloat();
        this.Unidades = Lerinformacoes.nextInt();
        this.ValorTotal = this.ValorUnidade * this.Unidades;

    }

    protected static double CalcularSubtotal(Produto produtonocarrinho){
        return produtonocarrinho.ValorTotal;

    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", ValorUnidade=" + ValorUnidade + ", Unidades=" + Unidades + ", ValorTotal="
                + ValorTotal + ", Lerinformacoes=" + Lerinformacoes + "]";
    }

    

}
