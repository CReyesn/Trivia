package cl.creyes.trivia.service;

import java.util.List;

import cl.creyes.trivia.model.Categoria;

public interface CategoriaService {

	void save(Categoria categoria);
	
	List<Categoria> findAll();
	
	void update(Categoria categoria);
	
	void delete(Categoria categoria);
	
}
