package mercearia.comercio.apiApredizado.controller;

import mercearia.comercio.apiApredizado.dto.ProdutoMIniDto;
import mercearia.comercio.apiApredizado.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping
    public List<ProdutoMIniDto> listar(){

        return produtoService.listar();
    }





}
