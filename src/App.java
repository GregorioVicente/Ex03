import java.util.Scanner;

import Classes.Carrinho;
import Classes.Produto;

public class App {

    static Scanner Lerinformacoes = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {

        Fluxodeescolhas();
        
    }
    static void Fluxodeescolhas(){
        System.out.println("""
                Escolha uma das opções:
                1 - Colocar produto no carrinho
                2 - Listar carrinho
                3 - Sair
                """);

                int Selecionado = Leropcao();

                switch (Selecionado) {
                    case 1:
                    System.out.println("Informe nome do produto, valor e quantidade.");
                        Produto produto1 = new Produto();
                        Carrinho.AdicionarProdutos(produto1);
                        System.out.println("Produto cadastrado!");
                        break;
                    case 2:
                        Carrinho.exibirprodutos();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Opção inválida");
                        Fluxodeescolhas();
                        break;
                }
    }
     static int Leropcao() {
        int opcao = Lerinformacoes.nextInt();
        return opcao;
        
    }
    
}
