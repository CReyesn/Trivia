package cl.creyes.trivia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.creyes.trivia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
