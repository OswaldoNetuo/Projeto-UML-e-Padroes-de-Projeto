/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Senha;

/**
 *
 * @author Oswaldo Beltrani Net
 */
public class VerificarSenhaFraca {
    
    public boolean isValid(String login, String pass) {
        // Implementação da validação fraca de senha (apenas verifica comprimento)
        return pass != null && pass.length() >= 6;
    }
    
}
