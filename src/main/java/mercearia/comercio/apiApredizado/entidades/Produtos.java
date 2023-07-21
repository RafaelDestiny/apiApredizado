package mercearia.comercio.apiApredizado.entidades;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomeProduto")
    String nomeProduto;

    @Column(name = "preco")
    private double preco;


    @Column(name = "quantidadeEntrada")
    private double quantidadeEntrada;


    @Column(name = "quantidadeSaida")
    private double quantidadeSaida;

    @Column(name = "saldoProduto")
    private double saldoProduto;


    public Produtos() {



    }


    public Produtos(Long id, String nomeProduto, double preco, double quantidadeEntrada,
                    double quantidadeSaida, double saldoproduto) {


        this.id = id;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidadeEntrada = quantidadeEntrada;
        this.quantidadeSaida = quantidadeSaida;
        this.saldoProduto = saldoProduto;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQuantidadeEntrada() {
        return quantidadeEntrada;
    }

    public void setQuantidadeEntrada(double quantidadeEntrada) {
        this.quantidadeEntrada = quantidadeEntrada;
    }

    public double getQuantidadeSaida() {
        return quantidadeSaida;
    }

    public void setQuantidadeSaida(double quantidadeSaida) {
        this.quantidadeSaida = quantidadeSaida;
    }

    public double getSaldoproduto() {
        return saldoProduto;
    }

    public void setSaldoproduto(double saldoproduto) {
        this.saldoProduto = saldoproduto;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return Objects.equals(id, produtos.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}



