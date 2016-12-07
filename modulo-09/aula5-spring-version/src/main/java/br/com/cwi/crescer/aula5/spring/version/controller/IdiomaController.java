/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula5.spring.version.controller;

import br.com.cwi.crescer.aula5.spring.version.entity.Idioma;
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
@RequestMapping("/idioma")
public class IdiomaController {
    @Autowired
    private IdiomaService idiomaService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model, @RequestParam(required = false) Long id, Pageable p) {
        Pageable pageable = new PageRequest(p.getPageNumber(), 5, p.getSort());

        Idioma idioma = new Idioma();
        if (id != null) {
            idioma = idiomaService.findOne(id);
            pageable = null;
        }
        if (pageable == null) {
            pageable = new PageRequest(0, 10);
        }
        model.addAttribute("idioma", idioma);
        model.addAttribute("idiomas", idiomaService.findAll(pageable));
        return "idioma";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String save(@Valid Idioma idioma, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (!bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("msg", "Registro salvo com sucesso!");
            idiomaService.add(idioma);
            return "redirect:idioma";
        }
        return "idioma";
    }
}