/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pedido;

public class Cancelado implements EstadoPedido {

    private Pedido pedido;

    public Cancelado(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void abrirPedido() {
        System.out.println("O pedido ja foi cancelado e nao pode ser aberto.");
    }

    @Override
    public void cancelarPedido() {
        System.out.println("Pedido ja cancelado.");

    }

    @Override
    public void finalizarPedido() {
        System.out.println("O pedido ja foi cancelado e nao pode ser finalizado.");
    }
}
