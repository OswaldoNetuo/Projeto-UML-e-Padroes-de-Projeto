/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loja;

import Pagamento.CartaoCredito;
import Pagamento.CartaoDebito;
import Pagamento.Pagamento;
import Pagamento.Pix;
import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a loja");
        
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
                
                
                default -> {
                    System.out.println("Opcaco invalida.");
                    continue;
                }
            }

            pagamento.pagar();
        }

        scanner.close();
    }
}

    

