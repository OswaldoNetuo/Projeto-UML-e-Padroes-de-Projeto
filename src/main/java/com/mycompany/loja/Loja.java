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
import Pedido.*;
import java.io.IOException;
/*import br.edu.utfpr.auth.AuthUser;
import br.edu.utfpr.email.EmailValidator;
import br.edu.utfpr.email.StrongEmailValidator;
import br.edu.utfpr.senha.PasswordValidator;
import br.edu.utfpr.senha.StrongPasswordValidator;*/
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Loja {

    //Carrinho de compras 
    public static CarrinhoCompras carrinho = new CarrinhoCompras();
    
    //Criar estoque
    public static Estoque estoque = new Estoque();

    //Criar categorias
    public static Categoria Camisa = new Categoria(1, "Camisa", "Roupa");
    public static Categoria Calca = new Categoria(2, "Calca", "Roupa");
    public static Categoria Acessorio = new Categoria(3, "Acessorio", "Acessorio de Moda");

    //Definindo produtos
    public static Produto Camisa1 = new Produto(1, "Camisa Azul Media", "Cor - Azul | Tamanho - M", 40, Camisa);
    public static Produto Camisa2 = new Produto(2, "Camisa Amarela Media", "Cor - Amarela | Tamanho - M", 40, Camisa);
    public static Produto Camisa3 = new Produto(3, "Camisa Vermelha Grande", "Cor - Vermelho | Tamanho - G", 50, Camisa);
    public static Produto Camisa4 = new Produto(4, "Camisa Branca Pequena", "Cor - Branco | Tamanho - P", 35, Camisa);
    public static Produto Calca1 = new Produto(5, "Calca Jeans 34", "Cor - Azul | Tamanho - 34", 70, Calca);
    public static Produto Calca2 = new Produto(6, "Calca Social 36", "Cor - Preto | Tamanho - 36", 80, Calca);
    public static Produto Calca3 = new Produto(7, "Calca Moletom", "Cor - Cinza | Tamanho - 38", 60, Calca);
    public static Produto Acessorio1 = new Produto(8, "Cinto de Couro", "Cor - Preto | Tamanho - Unico", 25, Acessorio);
    public static Produto Acessorio2 = new Produto(9, "Oculos de Sol", "Cor - Preto | Lentes - UV400", 100, Acessorio);
    public static Produto Acessorio3 = new Produto(10, "Relogio de Pulso", "Cor - Prata | Tamanho - Ajustavel", 150, Acessorio);
    public static Produto Acessorio4 = new Produto(11, "Gravata Listrada", "Cor - Azul e Branco", 30, Acessorio);

    //Adicionando produto ao estoque
    public static ProdutoEstoque p1 = new ProdutoEstoque(Camisa1, 10);
    public static ProdutoEstoque p2 = new ProdutoEstoque(Camisa2, 10);
    public static ProdutoEstoque p3 = new ProdutoEstoque(Camisa3, 5);
    public static ProdutoEstoque p4 = new ProdutoEstoque(Camisa4, 10);
    public static ProdutoEstoque p5 = new ProdutoEstoque(Calca1, 10);
    public static ProdutoEstoque p6 = new ProdutoEstoque(Calca2, 10);
    public static ProdutoEstoque p7 = new ProdutoEstoque(Calca3, 10);
    public static ProdutoEstoque p8 = new ProdutoEstoque(Acessorio1, 10);
    public static ProdutoEstoque p9 = new ProdutoEstoque(Acessorio2, 10);
    public static ProdutoEstoque p10 = new ProdutoEstoque(Acessorio3, 5);
    public static ProdutoEstoque p11 = new ProdutoEstoque(Acessorio4, 10);

    public static ArrayList<Cliente> clientes = new ArrayList<>();
    public static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    public static ArrayList<Gerente> gerentes = new ArrayList<>();

    // Lista de usuários para autenticação
    public static ArrayList<Pessoa> usuarios = new ArrayList<>();
    
    //Lista de pedidos
    public static ArrayList<Pedido> pedidos = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        Gerente Gerente1 = new Gerente(1, 3500, "Alice", "gerente@gmail.com", "gerente123");
        Funcionario Funcionario1 = new Funcionario(1, 2000, "Luke", "func@gmail.com", "func123");
        Cliente Cliente1 = new Cliente(1, "R Parana 405 Medianeira", "4599999-9999", "Roberta", "roberta@gmail.com", "roberta123");
        
        carrinho.setCliente(Cliente1);
        
        p1.getProduto().getEstado().adicionar(p1.getProduto());
        p2.getProduto().getEstado().adicionar(p2.getProduto());
        p3.getProduto().getEstado().adicionar(p3.getProduto());
        p4.getProduto().getEstado().adicionar(p4.getProduto());
        p5.getProduto().getEstado().adicionar(p5.getProduto());
        p6.getProduto().getEstado().adicionar(p6.getProduto());
        p7.getProduto().getEstado().adicionar(p7.getProduto());
        p8.getProduto().getEstado().adicionar(p8.getProduto());
        p9.getProduto().getEstado().adicionar(p9.getProduto());
        p10.getProduto().getEstado().adicionar(p10.getProduto());
        p11.getProduto().getEstado().adicionar(p11.getProduto());
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

        gerentes.add(Gerente1);
        funcionarios.add(Funcionario1);
        clientes.add(Cliente1);
        
        usuarios.add(Gerente1);
        usuarios.add(Funcionario1);
        usuarios.add(Cliente1);
        
        System.out.println("Bem vindo a loja");
        
        menuPrincipal();
    }

    public static void invalid() {
        System.out.println("Opcaco invalida.");
    }

    public static void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Entrar");
        System.out.println("2. Cadastrar-se");
        System.out.println("3. Sair");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> {
                Pessoa usuario = entrar();

                if (usuario != null) {
                    if (usuario instanceof Cliente cliente) {
                        carrinho.setCliente(cliente);
                        menuCliente(cliente);
                    } else if (usuario instanceof Funcionario funcionario) {
                        menuFuncionario(funcionario);
                    } else if (usuario instanceof Gerente gerente) {
                        menuGerente(gerente);
                    }
                } else {
                    System.out.println("Falha na autenticação.");
                    menuPrincipal();
                }
            }
            case 2 -> {
                cadastrarCliente();
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
    
    public static Pessoa entrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu email:");
        String email = scanner.next();
        System.out.println("Digite sua senha:");
        String senha = scanner.next();

        for (Pessoa usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }

        return null;
    }

    public static void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Cadastro de Cliente");
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite seu email:");
        String email = scanner.nextLine();
        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine();
        System.out.println("Digite seu endereço:");
        String endereco = scanner.nextLine();
        System.out.println("Digite seu telefone:");
        String telefone = scanner.nextLine();
        
        /*boolean auth = authUser.autenticar(email, senha, "login");
        
        if (auth == true){

            Cliente novoCliente = new Cliente(clientes.size() + 1, endereco, telefone, nome, email, senha);
            clientes.add(novoCliente);
            usuarios.add(novoCliente);
            System.out.println("Cliente cadastrado.");
        } else System.out.println("Cliente nao cadastrado.");
        */
        
    }

    public static void menuCliente(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Produtos");
        System.out.println("2. Carrinho");
        System.out.println("3. Sair");
        
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> {
                estoque.mostrarProdutos();
                
                System.out.println("Adicionar algum produto ao carrinho?");
                System.out.println("1. Sim");
                System.out.println("2. Nao");
                int escolha = scanner.nextInt();
                if (escolha == 2) { menuCliente(cliente); }
                if (escolha == 1) {
                    System.out.println("Digite o ID do produto desejado");
                    int id = scanner.nextInt();
                    System.out.println("Digite a quantidade");
                    int qtd = scanner.nextInt();
                    
                    ArrayList<ProdutoEstoque> produtos = estoque.getProdutos();
                    Produto produtoEscolhido = null;
                    for (ProdutoEstoque produtoEstoque : produtos) {
                        if (produtoEstoque.getProduto().getProduto_id() == id) {
                            produtoEscolhido = produtoEstoque.getProduto();
                            break;
                        }
                    }

                    if (produtoEscolhido != null) {
                        carrinho.adicionarProduto(new ItemPedido(produtoEscolhido, qtd));
                        System.out.println("Produto adicionado ao carrinho");
                    } else {
                        System.out.println("Produto nao encontrado.");
                    }
                }
                menuCliente(cliente);
            }
            case 2 -> {
                menuCarrinho(cliente);
            }
            case 3 -> {
                menuPrincipal();
            }
            default -> {
                invalid();
                menuCliente(cliente);
            }
        }

        scanner.close();
    }


    public static void menuFuncionario(Funcionario funcionario) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo, " + funcionario.getNome());
        System.out.println("1. Produtos");
        System.out.println("2. Verificar produto no estoque");
        System.out.println("3. Sair");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> {
                estoque.mostrarProdutos();
                menuFuncionario(funcionario);
            }
            case 2 -> {
                System.out.println("Digite o ID do produto");
                int id = scanner.nextInt();
                
                ArrayList<ProdutoEstoque> produtos = estoque.getProdutos();
                ProdutoEstoque produtoEscolhido = null;
                for (ProdutoEstoque produtoEstoque : produtos) {
                    if (produtoEstoque.getProduto().getProduto_id() == id) {
                        produtoEscolhido = produtoEstoque;
                        break;
                    }
                }
                System.out.println("Detalhes do produto");
                System.out.println("Estado:" + produtoEscolhido.getProduto().getEstado().getDescricao());
                System.out.println("Quantidade:" + produtoEscolhido.getQuantidade());
                
                System.out.println("Deseja adicionar unidades desse produto ao estoque?");
                System.out.println("1. Sim");
                System.out.println("2. Nao");
                int escolha = scanner.nextInt();
                if (escolha == 2) { menuFuncionario(funcionario); }
                if (escolha == 1) {
                    System.out.println("Digite a quantidade para adicionar");
                    int add = scanner.nextInt();
                    produtoEscolhido.atualizarQuantidade(add);
                }
                
                menuFuncionario(funcionario);
            }
            case 3 -> {
                menuPrincipal();
            }
            default -> {
                invalid();
                menuFuncionario(funcionario);
            }
        }
    }
    
    public static void menuGerente(Gerente gerente){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo, " + gerente.getNome());
        System.out.println("1. Cadastrar produto");
        System.out.println("2. Cadastrar categoria");
        System.out.println("3. Cadastrar conta");
        System.out.println("4. Ver pedidos");
        System.out.println("5. Sair");

        int opcao = scanner.nextInt();
        
        switch(opcao) {
            case 1 -> {
                cadastrarProduto();
                menuGerente(gerente);
            }
            case 2 -> {
                menuGerente(gerente);
            }
            case 3 -> {
                menuGerente(gerente);
            }
            case 4 -> {
                for (Pedido list : pedidos){
                    System.out.println("\n----------\n");
                    System.out.println("Nome :" + list.getCarrinho().getCliente().getNome());
                    System.out.println("Endereco :" + list.getCarrinho().getCliente().getEndereco());
                    System.out.println("Data :" + list.getData());
                    System.out.println("\nItens comprados");
                    list.getCarrinho().mostrarCarrinho();
                    System.out.println("\n----------\n");
                }
                menuGerente(gerente);
            }
            case 5 -> {
                menuPrincipal();
            }
            default -> {
                invalid();
                menuGerente(gerente);
            }
        }
    }
    
    public static void menuCarrinho(Cliente cliente){
        Scanner scanner = new Scanner(System.in);
        
        carrinho.mostrarCarrinho();
        
        System.out.println("1. Finalizar Compra");
        System.out.println("2. Retirar item");
        System.out.println("3. Sair");
        
        int opcao = scanner.nextInt();
        
        switch(opcao) {
            case 1 -> {
                menuPag(cliente);
            }
            case 2 -> {
                System.out.println("Digite o ID do produto desejado");
                int id = scanner.nextInt();
                carrinho.removerProduto(id);
            }
            case 3 -> {
                menuCliente(cliente);
            }
            default -> {
                invalid();
                menuCliente(cliente);
            }
        }
        menuCliente(cliente);
    }

    public static void menuPag(Cliente cliente) {
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
                    menuCliente(cliente);
                }
                default -> {
                    invalid();
                    continue;
                }
            }

            pagamento.pagar();
            //fazer um pedido
            Pedido pedido = new Pedido(pedidos.size()+1, new Date(2024,06,01), carrinho, pagamento);
            pedidos.add(pedido);
            
            //limpar o carrinho
            ArrayList<ItemPedido> Itens = new ArrayList<>(carrinho.getItens());
            ArrayList<ProdutoEstoque> Produtos = estoque.getProdutos();
            for (ItemPedido item : Itens) {
                int quantidade = item.getQuantidade();
                int produtoId = item.getProduto().getProduto_id();
                carrinho.removerProduto(produtoId);
                
                // Atualizando a quantidade do produto no estoque
                for (ProdutoEstoque produtoEstoque : Produtos) {
                    if (produtoEstoque.getProduto().getProduto_id() == produtoId) {
                        produtoEstoque.atualizarQuantidade(-quantidade);
                        break;
                    }
                }
            }
            
        }
        menuCliente(cliente);
        scanner.close();
    }
    
    /*
    public static void menuEstoque(Funcionario funcionario){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo, " + funcionario.getNome());
        System.out.println("1. Ver produtos");
        System.out.println("2. ");
        System.out.println("3. Sair");

        int opcao = scanner.nextInt();
        
        switch(opcao) {
            case 1 -> {
                menuEstoque(funcionario);
            }
            case 2 -> {
                menuEstoque(funcionario);
            }
            case 3 -> {
                menuFuncionario(funcionario);
            }
            default -> {
                invalid();
            }
        }
        menuFuncionario(funcionario);
    }
    */
    
    public static void cadastrarProduto(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cadastro de Produto");
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("Digite a descricao do produto:");
        String descricao = scanner.nextLine();
        System.out.println("Digite o preco do produto:");
        double preco = scanner.nextDouble();
        
        
    }
}
