/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedido;

public class Finalizado implements EstadoPedido {
    
    private Pedido pedido;
    
    public Finalizado(Pedido pedido){
        this.pedido = pedido;
    }
    
    @Override
    public void abrirPedido(){
       System.out.println( "O pedido ja foi finalizado e nao pode ser aberto novamente.");
    }
    @Override
    public void cancelarPedido(){
      System.out.println("O pedido ja foi finalizado e nao pode ser cancelado.");  
    }
    @Override
    public void finalizarPedido(){
      System.out.println("Pedido ja finalizado.");  
    }  
}
