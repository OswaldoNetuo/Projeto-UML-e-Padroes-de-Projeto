/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Categoria;

/**
 *
 * @author Estefani
 */
public class CategoriaFactory {

    public Categoria criaCategoria(int codigo, String nome, String descricao) {
        return new Categoria(codigo, nome, descricao);
    }
}
