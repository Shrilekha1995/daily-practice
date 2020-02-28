package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rst, int id) throws SQLException {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setId(rst.getInt("id"));
		e.setName(rst.getString("name"));
		e.setSalary(rst.getFloat("salary"));
		return e;
	}

	
}
