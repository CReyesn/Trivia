package cl.creyes.trivia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.creyes.trivia.model.Pregunta;

public interface PreguntaRepository extends JpaRepository<Pregunta, Long>{

}
