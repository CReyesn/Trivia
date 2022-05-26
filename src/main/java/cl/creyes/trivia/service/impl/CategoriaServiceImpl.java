package cl.creyes.trivia.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.creyes.trivia.model.Categoria;
import cl.creyes.trivia.repository.CategoriaRepository;
import cl.creyes.trivia.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Override
	public void save(Categoria categoria) {
		categoriaRepository.save(categoria);
		
	}

	@Override
	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}

	@Override
	public void update(Categoria categoria) {
		categoriaRepository.save(categoria);
		
	}

	@Override
	public void delete(Categoria categoria) {
		categoriaRepository.delete(categoria);
		
	}

}
