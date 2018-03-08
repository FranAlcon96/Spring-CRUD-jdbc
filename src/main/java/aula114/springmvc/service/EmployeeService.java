package aula114.springmvc.service;

import java.util.List;

import aula114.springmvc.domain.Empleado;

public interface EmployeeService {

	public List<Empleado> getAll();
	public void save(Empleado e);
	public void set(int id, String nombre, String profesion, String departamento);
	public void delete(int id);
	
	//public Contact show(String id);
}
