package br.com.nascimento.teste.livros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LivrosController {
    
    @Autowired
    private LivrosRepository repository;
    
    @GetMapping("/find/{filtro}")
    public List<Livros> findByFiltro(@PathVariable("filtro") String filtro) {
        return repository.findByFiltro(filtro);
    }
}

