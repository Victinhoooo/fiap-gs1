package com.github.mfdp.globalsolution.controller;

import java.util.List;

import com.github.mfdp.globalsolution.model.Peixes;
import com.github.mfdp.globalsolution.reopository.FishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("peixes")
public class FishController {

    @Autowired
    private FishRepository fishRepository;



    @GetMapping()
    public String list(Model model) {
        List<Peixes> peixes = fishRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
        model.addAttribute("peixes", peixes);
        return "peixes/list";
    }

    @GetMapping("add")
    public String create(Model model) {

        model.addAttribute("peixes", new Peixes());
        return "peixes/form";
    }

    @PostMapping("save")
    public String save(@ModelAttribute Peixes fish) {

        fishRepository.save(fish);
        return "redirect:/peixes";
    }

    @GetMapping("update/{nome}")
    public String update(@PathVariable String nome, Model model) {
        Peixes fish = fishRepository.findById(nome).orElse(new Peixes());

        model.addAttribute("peixes", fish);
        return "peixes/form";
    }

    @GetMapping("delete/{nome}")
    public String delete(@PathVariable String nome) {
        fishRepository.deleteById(nome);
        return "redirect:/peixes";
    }

}