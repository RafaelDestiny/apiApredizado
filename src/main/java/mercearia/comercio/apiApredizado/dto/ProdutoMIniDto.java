package mercearia.comercio.apiApredizado.dto;

import mercearia.comercio.apiApredizado.entidades.Produtos;

public record ProdutoMIniDto(Long id, String nomeProduto, double preco, double quantidadeEntrada,
                             double quantidadeSaida, double saldoProduto ) {


    public ProdutoMIniDto(Produtos entity){

        this(entity.getId(), entity.getNomeProduto(), entity.getPreco(), entity.getQuantidadeEntrada(),
                entity.getQuantidadeSaida(), entity.getSaldoproduto());

    }



}
