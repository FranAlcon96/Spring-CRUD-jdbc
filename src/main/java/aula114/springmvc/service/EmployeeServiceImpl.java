package aula114.springmvc.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;


import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import aula114.springmvc.domain.Empleado;

@Service
public class EmployeeServiceImpl implements EmployeeService {
        @Autowired
        private JdbcTemplate jdbcTemplate;

	public List<Empleado> getAll() {
           List<Empleado> laList = new ArrayList<Empleado>();
           String sql0 = "select * from empleado";
           laList = jdbcTemplate.query(sql0, new BeanPropertyRowMapper<Empleado>(Empleado.class));
           return laList;
	}
	
	// Saving a new Employee
	public void save(Empleado e){
		String sql = "insert into empleado values(?,?,?,?)";

	    jdbcTemplate.update(sql, new Object[]
	    { e.getId(), e.getNombre(), e.getProfesion(), e.getDepartamento() });
	}

	 public void set(int id, String nombre, String profesion, String departamento) {
		    String SQL = "update empleado set nombre = ?,profesion = ?,departamento = ? where id = ?";
		       jdbcTemplate.update(SQL, nombre,profesion,departamento, id);
		       System.out.println("registro actualizado  ID = " + id );
		 }
	public void delete(int id) {
		  String SQL = "delete from empleado where id = ?";
	       jdbcTemplate.update(SQL, id);
	       System.out.println("Registro eliminado ID = " + id );
	}


	


	
	
}
