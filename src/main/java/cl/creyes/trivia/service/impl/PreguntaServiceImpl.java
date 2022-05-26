package cl.creyes.trivia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.creyes.trivia.model.Pregunta;
import cl.creyes.trivia.repository.PreguntaRepository;
import cl.creyes.trivia.service.PreguntaService;

@Service
public class PreguntaServiceImpl implements PreguntaService{

	@Autowired
	PreguntaRepository preguntaRepository;
	
	@Override
	public void save(Pregunta pregunta) {
		preguntaRepository.save(pregunta);
		
	}

	@Override
	public List<Pregunta> findAll() {
		return preguntaRepository.findAll();
	}

	@Override
	public void update(Pregunta pregunta) {
		preguntaRepository.save(pregunta);
		
	}

	@Override
	public void delete(Pregunta pregunta) {
		preguntaRepository.delete(pregunta);
		
	}

}
