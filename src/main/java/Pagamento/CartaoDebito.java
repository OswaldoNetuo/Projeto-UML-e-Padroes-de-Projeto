/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pagamento;

import java.util.Date;

public class CartaoDebito implements Pagamento{
    private String numero;
    private String cvv;
    private Date validade;
    
    @Override
    public void pagar(){
        
    }

    public String getNumero() {
        return numero;
    }

    public String getCvv() {
        return cvv;
    }

    public Date getValidade() {
        return validade;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
      
}
