/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.spring.version.controller;

import br.com.cwi.crescer.aula5.spring.version.entity.Filme;
import br.com.cwi.crescer.aula5.spring.version.service.ClassificacaoService;
import br.com.cwi.crescer.aula5.spring.version.service.ElencoService;
import br.com.cwi.crescer.aula5.spring.version.service.FilmeService;
import br.com.cwi.crescer.aula5.spring.version.service.GeneroService;
import br.com.cwi.crescer.aula5.spring.version.service.IdiomaService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author matha
 */
@Controller
@RequestMapping("/filme")
public class FilmeController {
    @Autowired
    private FilmeService filmeService;
    @Autowired
    private GeneroService generoService;
    @Autowired
    private ElencoService elencoService;
    @Autowired
    private ClassificacaoService classificacaoService;
    @Autowired
    private IdiomaService idiomaService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model, @RequestParam(required = false) Long id, Pageable p) {
        Pageable pageable = new PageRequest(p.getPageNumber(), 5, p.getSort());

        Filme filme = new Filme();
        if (id != null) {
            filme = filmeService.findOne(id);
            pageable = null;
        }
        if (pageable == null) {
            pageable = new PageRequest(0, 10);
        }
        model.addAttribute("filme", filme);
        model.addAttribute("filmes", filmeService.findAll(pageable));
        model.addAttribute("generos", generoService.list());
        model.addAttribute("elencos", elencoService.list());
        model.addAttribute("classificacoes", classificacaoService.list());
        model.addAttribute("idiomas", idiomaService.list());
        return "filme";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String save(@Valid Filme filme, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (!bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("msg", "Registro salvo com sucesso!");
            filmeService.add(filme);
            return "redirect:filme";
        }
        return "filme";
    }
}