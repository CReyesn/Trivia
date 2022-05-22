package cl.creyes.trivia.service;

import java.util.List;

import cl.creyes.trivia.model.Pregunta;

public interface PreguntaService {

void save(Pregunta pregunta);
	
	List<Pregunta> findAll();
	
	void update(Pregunta categoria);
	
	void delete(Pregunta categoria);
}
