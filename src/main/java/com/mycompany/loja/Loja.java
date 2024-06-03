/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loja;

import Pagamento.*;
import Produto.*;
import Categoria.*;
import Pessoa.*;
import Estoque.*;
import CarrinhoCompras.*;
import java.util.Scanner;

public class Loja {
    
    //Criar estoque
    public static Estoque estoque = new Estoque();
    
    //Criar carrinho
    public static CarrinhoCompras carrinho = new CarrinhoCompras();

    //Criar categorias
    public static Categoria Camisa = new Categoria(1, "Camisa", "Roupa");
    public static Categoria Calca = new Categoria(2, "Calca", "Roupa");
    public static Categoria Acessorio = new Categoria(3, "Acessorio", "Acessorio de Moda");
    
    //Criar estados
    public static Disponivel Disponivel = new Disponivel();
    public static Indisponivel Indisponivel = new Indisponivel();
    
    //Definindo produtos
    public static Produto Camisa1 = new Produto(1, "Camisa Azul Media", "Cor - Azul | Tamanho - M", 40, Disponivel, Camisa);
    public static Produto Camisa2 = new Produto(2, "Camisa Azul Media", "Cor - Azul | Tamanho - M", 40, Disponivel, Camisa);
    public static Produto Camisa3 = new Produto(3, "Camisa Vermelha Grande", "Cor - Vermelho | Tamanho - G", 50, Disponivel, Camisa);
    public static Produto Camisa4 = new Produto(4, "Camisa Branca Pequena", "Cor - Branco | Tamanho - P", 35, Indisponivel, Camisa);
    public static Produto Calca1 = new Produto(5, "Calca Jeans 34", "Cor - Azul | Tamanho - 34", 70, Disponivel, Calca);
    public static Produto Calca2 = new Produto(6, "Calca Social 36", "Cor - Preto | Tamanho - 36", 80, Disponivel, Calca);
    public static Produto Calca3 = new Produto(7, "Calca Moletom", "Cor - Cinza | Tamanho - 38", 60, Disponivel, Calca);
    public static Produto Acessorio1 = new Produto(8, "Cinto de Couro", "Cor - Preto | Tamanho - Unico", 25, Disponivel, Acessorio);
    public static Produto Acessorio2 = new Produto(9, "Oculos de Sol", "Cor - Preto | Lentes - UV400", 100, Disponivel, Acessorio);
    public static Produto Acessorio3 = new Produto(10, "Relogio de Pulso", "Cor - Prata | Tamanho - Ajustavel", 150, Disponivel, Acessorio);
    public static Produto Acessorio4 = new Produto(11, "Gravata Listrada", "Cor - Azul e Branco", 30, Disponivel, Acessorio);
    
    //Adicionando produto ao estoque
    public static ProdutoEstoque p1 = new ProdutoEstoque(Camisa1, 10);
    public static ProdutoEstoque p2 = new ProdutoEstoque(Camisa2, 10);
    public static ProdutoEstoque p3 = new ProdutoEstoque(Camisa3, 5);
    public static ProdutoEstoque p4 = new ProdutoEstoque(Camisa4, 0);
    public static ProdutoEstoque p5 = new ProdutoEstoque(Calca1, 10);
    public static ProdutoEstoque p6 = new ProdutoEstoque(Calca2, 10);
    public static ProdutoEstoque p7 = new ProdutoEstoque(Calca3, 10);
    public static ProdutoEstoque p8 = new ProdutoEstoque(Acessorio1, 10);
    public static ProdutoEstoque p9 = new ProdutoEstoque(Acessorio2, 10);
    public static ProdutoEstoque p10 = new ProdutoEstoque(Acessorio3, 5);
    public static ProdutoEstoque p11 = new ProdutoEstoque(Acessorio4, 10);
    
    //Definindo contas padrao
    public static Gerente Gerente1 = new Gerente(1, 3500, "Alice", "gerente@gmail.com", "gerente123");
    public static Funcionario Funcionario1 = new Funcionario(1, 2000, "Luke", "func@gmail.com", "func123");
    public static Cliente Cliente1 = new Cliente(1, "R Parana 405 Medianeira", "4599999-9999", "Roberta", "roberta@gmail.com", "roberta123");

    public static void main(String[] args) {
        
        System.out.println("Bem vindo a loja");
        
        estoque.addProdutoEstoque(p1);
        estoque.addProdutoEstoque(p2);
        estoque.addProdutoEstoque(p3);
        estoque.addProdutoEstoque(p4);
        estoque.addProdutoEstoque(p5);
        estoque.addProdutoEstoque(p6);
        estoque.addProdutoEstoque(p7);
        estoque.addProdutoEstoque(p8);
        estoque.addProdutoEstoque(p9);
        estoque.addProdutoEstoque(p10);
        estoque.addProdutoEstoque(p11);
        
        menuPrincipal();
    }
    
    public static void invalid(){
        System.out.println("Opcaco invalida.");
    }
    
    public static void menuPrincipal(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Log In");
        System.out.println("2. Sign Up");
        System.out.println("3. Sair");
        
        int opcao = scanner.nextInt();
        
        switch(opcao){
            case 1 -> {
                menuCliente();
            }
            case 2 -> {
                menuPrincipal();
            }
            case 3 -> {
                System.out.println("Tchau!");
            }
            default -> {
                invalid();
                menuPrincipal();
            }
        }
        
        scanner.close();
    }
    
    public static void menuCliente(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Produtos");
        System.out.println("2. Carrinho");
        System.out.println("3. Conta");
        System.out.println("4. Sair");
        
        int opcao = scanner.nextInt();
        
        switch(opcao){
            case 1 -> {
                estoque.mostrarProdutos();
                menuCliente();
            }
            case 2 -> {
                carrinho.mostrarCarrinho();
                menuCarrinho();
            }
            case 3 -> {
                menuConta();
            }
            case 4 -> {
                menuPrincipal();
            }
            default -> {
                invalid();
                menuCliente();
            }
        }
        
        scanner.close();
    }
    
    public static void menuConta(){
        menuPrincipal();
    }
    
    public static void menuCarrinho(){
        menuPag();
    }
    
    public static void menuPag(){
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Selecione o metodo de pagamento:");
            System.out.println("1. Cartao de Credito");
            System.out.println("2. Cartao de Debito");
            System.out.println("3. Pix");
            System.out.println("4. Sair");
            int opcao = scanner.nextInt();

            if (opcao == 4) {
                System.out.println("Saindo do sistema de pagamentos.");
                break;
            }

            Pagamento pagamento = null;

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o numero do cartao:");
                    String numeroCartao = scanner.next();
                    System.out.println("Digite a validade (MM/AA):");
                    String validade = scanner.next();
                    System.out.println("Digite o CVV:");
                    String cvv = scanner.next();

                    pagamento = new CartaoCredito(numeroCartao, validade, cvv);
                }

                case 2 -> {
                    System.out.println("Digite o numero do cartao:");
                    String numeroCartao = scanner.next();
                    System.out.println("Digite a validade (MM/AA):");
                    String validade = scanner.next();
                    System.out.println("Digite o CVV:");
                    String cvv = scanner.next();

                    pagamento = new CartaoDebito(numeroCartao, validade, cvv);
                }
                
                case 3 -> {
                    System.out.println("Digite o CPF (000.000.000-00):");
                    String cpf = scanner.next();

                    pagamento = new Pix(cpf);
                }
                case 4 -> {
                    menuPrincipal();
                }
                default -> {
                    invalid();
                    continue;
                }
            }

            pagamento.pagar();
        }

        scanner.close();
    }
}

    

