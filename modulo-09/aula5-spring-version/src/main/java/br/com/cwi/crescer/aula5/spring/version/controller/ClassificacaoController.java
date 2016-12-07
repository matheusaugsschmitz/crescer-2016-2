/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.spring.version.controller;

import br.com.cwi.crescer.aula5.spring.version.entity.Classificacao;
import br.com.cwi.crescer.aula5.spring.version.service.ClassificacaoService;
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
@RequestMapping("/classificacao")
public class ClassificacaoController {
    @Autowired
    private ClassificacaoService classificacaoService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model, @RequestParam(required = false) Long id, Pageable p) {
        Pageable pageable = new PageRequest(p.getPageNumber(), 5, p.getSort());

        Classificacao classificacao = new Classificacao();
        if (id != null) {
            classificacao = classificacaoService.findOne(id);
            pageable = null;
        }
        if (pageable == null) {
            pageable = new PageRequest(0, 10);
        }
        model.addAttribute("classificacao", classificacao);
        model.addAttribute("classificacoes", classificacaoService.findAll(pageable));
        return "classificacao";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String save(@Valid Classificacao classificacao, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (!bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("msg", "Registro salvo com sucesso!");
            classificacaoService.add(classificacao);
            return "redirect:classificacao";
        }
        return "classificacao";
    }
}