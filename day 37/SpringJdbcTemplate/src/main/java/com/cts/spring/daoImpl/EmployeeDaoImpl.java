package com.cts.spring.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.cts.spring.dao.EmployeeDao;
import com.cts.spring.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean saveEmployee(Employee emp) {
		String query = "insert into emp values(?,?,?,?)";
		try {
			jdbcTemplate.update(query, emp.getId(), emp.getName(), emp.getEmail(), emp.getMobile());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateEmployee(Employee emp) {
		String query = "update emp set name=?,email=?,mobile=? where id =?";
		try {
			jdbcTemplate.update(query, emp.getName(), emp.getEmail(), emp.getMobile(), emp.getId());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean deleteEmployee(Employee emp) {
		String query = "delete from emp where id =?";
		try {
			jdbcTemplate.update(query, emp.getId());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}

	}

	public Employee getEmployeeById(int id) {
		String query = "select * from emp where id = ?";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
		return jdbcTemplate.queryForObject(query, rowMapper, id);
	}

	public List<Employee> getAllEmployees() {
		
		return jdbcTemplate.query("select * from emp", new ResultSetExtractor<List<Employee>>() { 
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException { 
			 
			 List<Employee> list = new ArrayList<Employee>(); 
			 while (rs.next()) 
			 	{ Employee employee = new Employee();
			 		employee.setId(rs.getInt(1));
			 		employee.setName(rs.getString(2));    
			 		employee.setEmail(rs.getString(3)); 
			 		employee.setMobile(rs.getLong(4));
			 		list.add(employee);   
			 	}
			 return list;  
			 } }); 
			}
	}


