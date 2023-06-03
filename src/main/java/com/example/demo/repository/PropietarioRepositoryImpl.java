package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;


@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository {
	
	private List<Propietario> baseDatos = new ArrayList<>();
		

	@Override
	public void crear(Propietario propietario) {
		baseDatos.add(propietario);		
	}
		
	@Override
	public void eliminar(String identificacion) {		
		Propietario propietario = this.consultar(identificacion);
		baseDatos.remove(propietario);			
	}

	@Override
	public Propietario consultar(String identificacion) {
		Propietario propietarioEncontrado = new Propietario();		
		for (Propietario propietario : baseDatos) {
			if (identificacion.equals(propietario.getIdentificacion())) {
				propietarioEncontrado = propietario;				
			}			
		}
		return propietarioEncontrado;		
	}	
	

	
	

}
