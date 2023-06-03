package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;


@Repository
public class MatriculaRepositoryImpl implements MatriculaRepository {
	
	private List<Matricula> baseDatos = new ArrayList<>();

	@Override
	public void crear(Matricula matricula) {
		baseDatos.add(matricula);
		
	}

	

	
	
}
