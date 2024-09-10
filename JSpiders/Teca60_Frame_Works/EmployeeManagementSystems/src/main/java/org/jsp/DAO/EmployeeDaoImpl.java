package org.jsp.DAO;

import java.util.List;
import java.util.Scanner;

import javax.net.ssl.ManagerFactoryParameters;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.entity.EmployeeDetails;


public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void insertEmployeeObject() {

		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("EmployeeManagementSystems");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		EmployeeDetails employee=new EmployeeDetails();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Name");
		employee.setName(scanner.next());
		System.out.println("Enter your salary");
		employee.setSalary(scanner.nextDouble());
		System.out.println("Enter your department number");
		employee.setDeptno(scanner.nextInt());
		
		manager.persist(employee);
		System.out.println("Data inserted");
		
		transaction.commit();
		
		managerFactory.close();
		
	}

	@Override
	public void selectEmployeeDetailsById(int id) {

		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("EmployeeManagementSystems");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		
		EmployeeDetails details=manager.find(EmployeeDetails.class, id);
		if (details!=null) {
			System.out.println("name :"+details.getName());
			
		}
		else {
			System.out.println("No data found");
		}
		manager.close();
		managerFactory.close();
	}

	@Override
	public void updateSalaryById(int id,int salary) {
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("EmployeeManagementSystems");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		
		EmployeeDetails details=manager.find(EmployeeDetails.class, id);
		if(details!=null)
		{
			details.setSalary(salary);
			System.out.println("Password updated successfully");
		}
		else {
			System.out.println("No data found");
		}
		transaction.commit();
		manager.close();
		managerFactory.close();
		
	}

	@Override
	public void deleteEmployeeDetailsByUsingId(int id) {
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("EmployeeManagementSystems");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		
		EmployeeDetails details=manager.find(EmployeeDetails.class, id);
		if(details!=null)
		{
			manager.remove(details);
			System.out.println("Data deleted successfully");
		}
		else {
			System.out.println("No data found");
		}
		transaction.commit();
		manager.close();
		managerFactory.close();
	}

	@Override
	public void updateDeptNoByUsingId(int deptno, int id) {
		String  JPQLUpdate="update EmployeeDetails emp set emp.deptno=?1 where emp.id=?2";
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("EmployeeManagementSystems");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Query query=manager.createQuery(JPQLUpdate);
		query.setParameter(1, 101);
		query.setParameter(2, 1);
		System.out.println(query);
		int result=query.executeUpdate();
		System.out.println(result);
		transaction.commit();
		
		
	}

	@Override
	public void deleteUserByUsingMobileNo(long mobileno) {
		String JPQLDelete="delete from EmployeeDetails emp where emp.mobilenumber=?1 ";
		
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("EmployeeManagementSystems");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Query query=manager.createQuery(JPQLDelete);
		query.setParameter(1, mobileno);
		int result=query.executeUpdate();
		System.out.println(result);
		transaction.commit();
		
		
		
	}

	@Override
	public void selectEmployeeDetailsByUsingId(int id) {
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("EmployeeManagementSystems");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		String select="select emp from EmployeeDetails emp where emp.id=:id";
		Query query=manager.createQuery(select);
		query.setParameter("id", id);
		EmployeeDetails employeeDetails=(EmployeeDetails)query.getSingleResult();
		
		System.out.println("Name : "+employeeDetails.getName());
		System.out.println("Mobile : "+employeeDetails.getMobilenumber());
		
		}

	@Override
	public void selectEmployeeDetailsBasedOnGender(String gender) {
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("EmployeeManagementSystems");
		EntityManager manager=managerFactory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		String select="select emp from EmployeeDetails emp where emp.gender=:gender";
		
		
		Query query = manager.createQuery(select);
		
		
		query.setParameter("gender", gender);
		List<EmployeeDetails> employeeDetails=query.getResultList();
		
		for(EmployeeDetails emp:employeeDetails)
		{
			System.out.println("Id : "+emp.getId());
			System.out.println("Name : "+emp.getName());
			System.out.println("MobileNo : "+emp.getMobilenumber());
			System.out.println("DeptNo : "+emp.getDeptno());
			System.out.println("Salary : "+emp.getSalary());
			System.out.println("Gender : "+emp.getGender());
			System.out.println("Password : "+emp.getPassword());
		}
		
		
		
		
	}
	

}
