package pack1.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import pack1.dto.Employee;

@Repository
public class EmpDaoImpl implements EmpDao 
{

	@Autowired
	private HibernateTemplate ht;

	public void saveOrUpdateEmployee(Employee e) 
	{
		ht.saveOrUpdate(e);
		System.out.println("object is saved/updated");

	}

	public void deleteEmployee(int empId) 
	{
		Employee e=(Employee)ht.get(Employee.class, empId);
		ht.delete(e);
		System.out.println("object deleted");

	}

	public List selectEmployees() 
	{
		List employeesList=ht.find("from Employee e");
		return employeesList;
	}

}
