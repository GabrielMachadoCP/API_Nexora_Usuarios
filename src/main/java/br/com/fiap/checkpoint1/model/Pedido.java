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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String clienteNome;

    private LocalDate dataPedido = LocalDate.now();

    @Min(value = 0, message = "O valor total não pode ser negativo")
    private double valorTotal;

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
}