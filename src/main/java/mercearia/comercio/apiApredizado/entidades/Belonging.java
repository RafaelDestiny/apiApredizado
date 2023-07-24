package mercearia.comercio.apiApredizado.entidades;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

    @Entity
    @Table(name = " Belonging")
    public class Belonging {
    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer posicao;

    public Belonging(){

    }

    public Belonging( Produtos produtos, ProdutosLista produtosLista, Integer posicao) {
        this.id.setProdutos(produtos);
        this.id.setListaprodutos(produtosLista);
        this.posicao = posicao;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
