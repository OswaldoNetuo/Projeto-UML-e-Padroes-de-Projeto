/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estoque;

import Produto.Disponivel;
import Produto.Indisponivel;
import Produto.Produto;

public class ProdutoEstoque {

    private Produto produto;
    private int quantidade;

    public ProdutoEstoque(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void atualizarQuantidade(int quantidade) {
        if (this.quantidade + quantidade < 0) {
            System.out.println("A quantidade que deseja remover é maior que a quantidade em estoque, tente novamente.");
        } else {
            
            if (this.quantidade + quantidade > 0){
                this.produto.estado = new Disponivel(produto);
            } else {
               this.produto.estado = new Indisponivel(produto); 
            }
            
            this.quantidade += quantidade;
        }
    }
}
