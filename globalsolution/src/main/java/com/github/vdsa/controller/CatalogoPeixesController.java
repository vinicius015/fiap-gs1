package com.github.vdsa.controller;

import com.github.vdsa.controller.dto.FormCatalogoPeixes;
import com.github.vdsa.model.CatalogoPeixes;
import com.github.vdsa.repository.CatalogoPeixesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("catalogo")
public class CatalogoPeixesController {
    @Autowired
    CatalogoPeixesRepository catalogoPeixesRepository;

    @GetMapping()
    public String list(Model model) {
        List<CatalogoPeixes> peixes = catalogoPeixesRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
        model.addAttribute("peixes", peixes);
        return "catalogo/list";
    }

    @GetMapping("add")
    public String create(Model model) {
        model.addAttribute("peixe", new FormCatalogoPeixes());
        return "catalogo/form";
    }

    @PostMapping("save")
    public String save(@ModelAttribute FormCatalogoPeixes formCatalogoPeixes) {
        CatalogoPeixes catalogoPeixes = formCatalogoPeixes.toModel();

        catalogoPeixesRepository.save(catalogoPeixes);
        return "redirect:/catalogo";
    }

    @GetMapping("update/{id}")
    public String update(@PathVariable Long id, Model model) {
        CatalogoPeixes catalogoPeixes = catalogoPeixesRepository.findById(id).orElse(new CatalogoPeixes());

        model.addAttribute("peixe", catalogoPeixes);
        return "catalogo/form";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable Long id) {
        catalogoPeixesRepository.deleteById(id);
        return "redirect:/catalogo";
    }
}
