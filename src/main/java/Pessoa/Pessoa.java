/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoa;

public class Pessoa {
    private int pessoa_id;
    private String nome;
    private String email;
    private String senha;
    
    public Pessoa() {
        this.nome = "-";
        this.email = "-";
        this.senha = "-";
    }

    public Pessoa(int id, String nome, String email, String senha) {
        this.pessoa_id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public int getPessoa_id() {
        return pessoa_id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setPessoa_id(int pessoa_id) {
        this.pessoa_id = pessoa_id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
