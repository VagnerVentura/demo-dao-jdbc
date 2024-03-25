package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
//		Department dep = new Department(10,"fitness");
//		depDao.insert(dep);
//		System.out.println("Inserted! New Id = " + dep.getId());
		
		Department dep = depDao.findById(1);
		dep.setName("Computers");
		depDao.update(dep);
		System.out.println("Update Completed");
		System.out.println(dep);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter id for delete test: ");
//		int id = sc.nextInt();		
//		depDao.deleteById(id);
//		System.out.println("Delete completed");
		
		List<Department> list = depDao.findAll();
		for(Department obj: list) {
			System.out.println(obj);
		}
	}

}
