package com.example.demo.repository;

import com.example.demo.repository.modelo.Propietario;

public interface PropietarioRepository {
	
	public void crear(Propietario propietario) ;	
	public void eliminar(String identificacion) ;	
	public  Propietario consultar(String identificacion);

}
