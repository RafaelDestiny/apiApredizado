package mercearia.comercio.apiApredizado.entidades;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;


  @Embeddable
public class BelongingPK {

   @ManyToOne
   @JoinColumn(name = "produtos_id")
    private Produtos produtos;

   @ManyToOne
   @JoinColumn(name = "listaProdutos_id")
    private ProdutosLista listaprodutos;

 public BelongingPK(){


 }

    public BelongingPK(Produtos produtos, ProdutosLista listaprodutos) {
        this.produtos = produtos;
        this.listaprodutos = listaprodutos;
    }

    public Produtos getProdutos() {
        return produtos;
    }

    public void setProdutos(Produtos produtos) {
        this.produtos = produtos;
    }

    public ProdutosLista getListaprodutos() {
        return listaprodutos;
    }

    public void setListaprodutos(ProdutosLista listaprodutos) {
        this.listaprodutos = listaprodutos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(produtos, that.produtos) && Objects.equals(listaprodutos, that.listaprodutos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(produtos, listaprodutos);
    }
}
