package mercearia.comercio.apiApredizado.repository;

import mercearia.comercio.apiApredizado.entidades.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produtos , Long > {
}
