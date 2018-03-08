package aula114.springmvc.domain;

public class Empleado {

	private int id;
	private String nombre;
	private String profesion;
	private String departamento;
	
	public Empleado(String nombre, String profesion, String departamento) {
		this.id = id;
		this.nombre = nombre;
		this.profesion = profesion;
		this.departamento = departamento;
	}
	
	public Empleado() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	
	
}
