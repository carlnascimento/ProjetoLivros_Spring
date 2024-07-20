package br.com.nascimento.teste.livros;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LivrosRepository extends JpaRepository<Livros, Long> {
    
    @Query("SELECT l FROM Livros l WHERE l.nome LIKE %:filtro% OR l.descricao LIKE %:filtro%")
    List<Livros> findByFiltro(String filtro);
}

