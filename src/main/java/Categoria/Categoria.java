/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Categoria;

public class Categoria {

    private int categoria_id;
    private String nome;
    private String descricao;

    public Categoria(int categoria_id, String nome, String descricao) {
        this.categoria_id = categoria_id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
