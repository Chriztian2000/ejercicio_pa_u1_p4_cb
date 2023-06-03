package com.example.demo.repository;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoRepository {

	public  void insertar(Vehiculo vehiculo);
	public void  actualizar(Vehiculo vehiculo);
	public void eliminar(String placa) ;
	public Vehiculo buscar(String placa);

}
