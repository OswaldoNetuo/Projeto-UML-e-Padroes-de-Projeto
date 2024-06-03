/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoa;

public class PessoaFactory {

    public Pessoa criaPessoa(String tipo, int id, double salario, String nome, String email, String senha, String endereco, String telefone) {

        if (tipo == null) {
            return null;
        }

        if (tipo.equalsIgnoreCase("FUNCIONARIO")) {
            return new Funcionario(id, salario, nome, email, senha);
        } else if (tipo.equalsIgnoreCase("GERENTE")) {
            return new Gerente(id, salario, nome, email, senha);
        } else if (tipo.equalsIgnoreCase("CLIENTE")) {
            return new Cliente(id, nome, email, senha, endereco, telefone);
        }
        return null;
    }
}
