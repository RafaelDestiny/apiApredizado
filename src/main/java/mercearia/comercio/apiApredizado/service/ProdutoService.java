package mercearia.comercio.apiApredizado.service;


import mercearia.comercio.apiApredizado.dto.ProdutoMIniDto;
import mercearia.comercio.apiApredizado.entidades.Produtos;
import mercearia.comercio.apiApredizado.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<ProdutoMIniDto> listar(){

        return produtoRepository.findAll().stream().map(ProdutoMIniDto:: new).toList();


    }


}
