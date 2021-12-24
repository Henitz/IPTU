package com.empresa.poc.iptuapi.controller;

import com.empresa.poc.iptuapi.domain.Iptu;
import com.empresa.poc.iptuapi.dto.IptuDto;
import com.empresa.poc.iptuapi.service.IptuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/iptus")
@CrossOrigin("*")
public class IptuController {

    @Autowired
    private IptuService iptuService;



    @GetMapping("/{contribuinte}")
    public IptuDto um(@PathVariable String contribuinte) {

        Iptu iptuReturn = iptuService.findByContribuinte(contribuinte);
        IptuDto dtoReturn = new IptuDto();
        dtoReturn.setContribuinte(iptuReturn.getContribuinte());

        dtoReturn.setAno(iptuReturn.getNumero());
        dtoReturn.setData(iptuReturn.getTipo1());
        dtoReturn.setCpfcnpj1(iptuReturn.getCpfcnpj1());
        dtoReturn.setNome1(iptuReturn.getNome1());
        dtoReturn.setTipo2(dtoReturn.getTipo2());
        dtoReturn.setCpfcnpj2(iptuReturn.getCpfcnpj2());
        dtoReturn.setNome2(iptuReturn.getNome2());
        dtoReturn.setNumerodoCondominio(iptuReturn.getNumerodoCondominio());
        dtoReturn.setCodlog(iptuReturn.getCodlog());
        dtoReturn.setLogradouro(iptuReturn.getLogradouro());
        dtoReturn.setNumerodoImovel(iptuReturn.getNumerodoImovel());
        dtoReturn.setComplemento(iptuReturn.getComplemento());
        dtoReturn.setBairro(iptuReturn.getBairro());
        dtoReturn.setReferencia(iptuReturn.getReferencia());
        dtoReturn.setCep(iptuReturn.getCep());
        dtoReturn.setQuantidadedeesquinasfrentes(iptuReturn.getQuantidadedeesquinasfrentes());
        dtoReturn.setFracaoideal(iptuReturn.getFracaoideal());
        dtoReturn.setAreadoterreno(iptuReturn.getAreadoterreno());
        dtoReturn.setAreaconstruida(iptuReturn.getAreaconstruida());
        dtoReturn.setAreaocupada(dtoReturn.getAreaocupada());
        dtoReturn.setValordomqdoterreno(iptuReturn.getValordomqdoterreno());
        dtoReturn.setValordomqdeconstrucao(iptuReturn.getValordomqdeconstrucao());
        dtoReturn.setAnodaconstrucao(iptuReturn.getAnodaconstrucao());
        dtoReturn.setTestada(iptuReturn.getTestada());
        dtoReturn.setTipodepadrao(iptuReturn.getTipodepadrao());
        dtoReturn.setTipodeterreno(iptuReturn.getTipodeterreno());
        dtoReturn.setObsolescencia(iptuReturn.getObsolescencia());
        dtoReturn.setAnodeiniciodaVida(iptuReturn.getAnodeiniciodaVida());
        dtoReturn.setMesdeiniciodavida(iptuReturn.getMesdeiniciodavida());
        dtoReturn.setFase(iptuReturn.getFase());


        return dtoReturn;
    }

//    @Query("select numeroDoContribuinte, NomeDoContribuinte1, NomeDeLogradouroDoImovel, NumeroDoImovel, AreaConstruida" +
//            "from dados d ")



}

//    @Query("select count(ped) from Pedido ped where ped.cliente =:cliente")
//    public int pedidosDoClienteEncontrados(@Param("iptu") Iptu iptu);



/*
    CREATE VIEW vw_resultado as
select "NUMERO DO CONTRIBUINTE","NOME DE LOGRADOURO DO IMOVEL","NUMERO DO IMOVEL",
        "AREA DO TERRENO", "AREA CONSTRUIDA", "AREA OCUPADA", "VALOR DO M2 DO TERRENO", "VALOR DO M2 DE CONSTRUCAO",
        "ANO DA CONSTRUCAO CORRIGIDO"
        from dados d
        INNER JOIN casas c on upper("NOME DE LOGRADOURO DO IMOVEL") like CONCAT('%',upper(rtrim(c."Endereco")),'%') WHERE c."numero" = d."NUMERO DO IMOVEL"
*/