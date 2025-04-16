package br.com.fiap.checkpoint1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull @NotBlank
    private String clienteNome;
    @NotNull @NotBlank
    private LocalDate dataPedido = LocalDate.now();
    private Produto produto;
    @Min(value = 0, message = "O valor total não pode ser negativo")
    private double valorTotal;

    //Gets e Sets
    public @NotNull @NotBlank String getClienteNome() {
        return clienteNome;
    }
    public void setClienteNome(@NotNull @NotBlank String clienteNome) {
        this.clienteNome = clienteNome;
    }

    @Min(value = 0, message = "O valor total não pode ser negativo")
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(@Min(value = 0, message = "O valor total não pode ser negativo") double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @NotNull @NotBlank
    public LocalDate getDataPedido() {
        return dataPedido;
    }
    @NotNull @NotBlank
    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    @NotNull @NotBlank
    public Produto getProduto() {
        return produto;
    }

    @NotNull @NotBlank
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}