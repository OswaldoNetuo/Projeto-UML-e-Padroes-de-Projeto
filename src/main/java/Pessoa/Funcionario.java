/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoa;

public class Funcionario extends Pessoa{
    private int salario;

    public Funcionario(int id, int salario, String nome, String email, String senha) {
        super(id, nome, email, senha);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void calcularSalario(){
        
    }
    
    
}
