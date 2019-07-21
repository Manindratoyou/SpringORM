package pack1.dao;

import java.util.List;

import pack1.dto.Employee;

public interface EmpDao 
{
	void saveOrUpdateEmployee(Employee e);
	void deleteEmployee(int empId);
	List selectEmployees();

}
