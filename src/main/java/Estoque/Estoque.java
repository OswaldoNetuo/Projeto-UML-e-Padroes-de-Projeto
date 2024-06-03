/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estoque;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<ProdutoEstoque> produtos;

    public Estoque(ArrayList<ProdutoEstoque> produtos) {
        this.produtos = produtos;
    }
    
    public ArrayList<ProdutoEstoque> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<ProdutoEstoque> produtos) {
        this.produtos = produtos;
    }  
}
