/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

public class Indisponivel implements EstadoProduto{

    @Override
    public void adicionar(Produto produto) {
        System.out.println("Atualizando status de disponibilidade do produto...");
        produto.setEstado(new Disponivel());
                System.out.println("Produto disponibilizado com sucesso!");
    }

    @Override
    public void remover(Produto produto) {
        System.out.println("Esse produto já está indisponível.");
    }
    
}
