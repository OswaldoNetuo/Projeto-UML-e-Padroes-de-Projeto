/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

import Categoria.Categoria;

public class ProdutoFactory {
    public Produto criaProduto(int id, String nome, String descricao, double preco, Categoria categoria) {
      return new Produto(id, nome, descricao, preco, categoria);  
    }
}
