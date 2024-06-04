/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Auth;

import Email.ValidarEmail;
import Senha.ValidarSenha;

/**
 *
 * @author Oswaldo Beltrani Net
 */
public class AuthUsuario {

    public class AuthUser {

        private ValidarEmail e;
        private ValidarSenha p;

        public AuthUser(ValidarEmail e, ValidarSenha p) {
            this.e = e;
            this.p = p;
        }

        public void autenticar(String email, String pass, String login) {
            if (e.isValid(email) && p.isValid(login, pass)) {
                System.out.println("Autenticacao bem-sucedida!");
            } else {
                System.out.println("Falha na autenticacao.");
            }
        }
    }
}
