/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produto;

import Categoria.Categoria;

public class Produto {
    private int produto_id;
    private String nome;
    private String descricao;
    private double preco;
    private EstadoProduto estado;
    private Categoria categoria;

    public Produto(int produto_id, String nome, String descricao, double preco, Categoria categoria) {
        this.produto_id = produto_id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        estado = new Indisponivel(this);
        this.categoria = categoria;
    }
    
    public void mostrarProduto(){
        System.out.println("Dados do produto:");
        System.out.println("ID: " + produto_id);
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Estado: " + estado.getDescricao());
        System.out.println("Categoria: " + categoria.getNome());
    }

    public int getProduto_id() {
        return produto_id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public EstadoProduto getEstado() {
        return estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstado(EstadoProduto estado) {
        this.estado = estado;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    //@Override
    public void adicionar(){
        estado.adicionar(this);
    }
    
    //@Override
    public void remover(){
       estado.remover(this); 
    }
}
