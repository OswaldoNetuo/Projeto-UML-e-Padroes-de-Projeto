/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedido;

public class Aberto implements EstadoPedido{
    
    private Pedido pedido;
    
    public Aberto(Pedido pedido) {
        this.pedido = pedido;
    }
    
    @Override
    public void abrirPedido(){
        System.out.println("Pedido ja esta aberto.");
    }
    @Override
    public void cancelarPedido(){
        System.out.println("Pedido cancelado.");
        pedido.setEstado(new Cancelado(pedido));
        
    }
    @Override
    public void finalizarPedido(){
                System.out.println("Pedido finalizado.");
        pedido.setEstado(new Finalizado(pedido));
    }
}
