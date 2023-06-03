package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository {

	private List<Vehiculo> baseDatos = new ArrayList<>();

	@Override
	public void insertar(Vehiculo vehiculo) {		
		baseDatos.add(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		this.eliminar(vehiculo.getPlaca());
		this.actualizar(vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		Vehiculo vehiculo = this.buscar(placa);		
		baseDatos.remove(vehiculo)	;
	}

	@Override
	public Vehiculo buscar(String placa) {	
		Vehiculo vehiculoEncontrado= new Vehiculo() ;
		for (Vehiculo vehi : baseDatos) {
			if (placa.equals(vehi.getPlaca())) {
				vehiculoEncontrado = vehi;
			break;
			}			
		}
		return vehiculoEncontrado;
	}

	
	
	

}
