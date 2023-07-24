package mercearia.comercio.apiApredizado.entidades;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "produtoLista")
public class ProdutosLista {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nomeLista;

   public ProdutosLista(){


   }

    public ProdutosLista(Long id, String nomeLista) {
        this.id = id;
        this.nomeLista = nomeLista;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutosLista that = (ProdutosLista) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
