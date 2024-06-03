/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

public class Disponivel implements EstadoProduto{

    @Override
    public void adicionar(Produto produto) {
        System.out.println("Esse produto já está disponível.");
    }

    @Override
    public void remover(Produto produto) {
        System.out.println("Atualizando status de disponibilidade do produto...");
        produto.setEstado(new Indisponivel());
        System.out.println("Produto indisponibilizado com sucesso!");
    }
}
