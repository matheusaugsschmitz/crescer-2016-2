/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crecer.aula8.controller;

import br.com.cwi.crecer.aula8.Services.PessoaService;
import br.com.cwi.crecer.aula8.Entities.Pessoa;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author matheus.schmitz
 */
@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;
    
    @RequestMapping(value = "/pessoa", method = RequestMethod.POST)
    public Iterable<Pessoa> list(@RequestBody Pessoa p) {
        p.setNascimento(new Date());
        pessoaService.add(p);
        return pessoaService.list();
    }
    @RequestMapping(value = "/pessoa", method = RequestMethod.GET)
    public Iterable<Pessoa> list() {
        return pessoaService.list();
    }

}
