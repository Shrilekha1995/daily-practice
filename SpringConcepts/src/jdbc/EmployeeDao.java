package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveEmployee(Employee e){
		
		String query="Insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
		return jdbcTemplate.update(query);  
	}
	
	public int updateEmployee(Employee e){  
	    String query="update employee set name='"+e.getName()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	
	public Employee getById(int empId){
	 
		/*return jdbcTemplate.query("select * from employee where id = "+empId, new ResultSetExtractor<Employee>(){

			@Override
			public Employee extractData(ResultSet rst) throws SQLException, DataAccessException {
				Employee e=null;
				if(rst.next())
					e=new Employee(rst.getInt("id"), rst.getString("name"), rst.getFloat("salary"));
				return e;
			}
			
		});*/
		return jdbcTemplate.queryForObject("select * from employee where id = ?", new Object[]{empId}, new EmployeeMapper());
		
	}
	
	public List<Employee> getAllEmp()
	{
		return jdbcTemplate.query("select * from employee", new EmployeeMapper());
	}
	
	/*public int showEmployee(){
		
		return jdbcTemplate.
	}*/
	
	

}
