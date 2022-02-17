package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class FindEmployee {
	
	@Test
	public void findEngineerEmployee() {
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(1001,"Sam David", "QA Software Engineer"));
		emps.add(new Employee(1003,"Gopi", "Automation Architect"));
		emps.add(new Employee(1006,"Naveen", "Jr. Test Engineer"));
		emps.add(new Employee(1007,"Balaji", "QA Software Engineer"));
		emps.add(new Employee(1010,"Koushik", "QA Software Engineer"));
		emps.add(new Employee(1019,"Narashiman", "Digital Marketing Consultant"));

		// find those employee with desgination having Engineer
		// find the employee who is max emp id -> name 
		
		
		List<Employee> sortedEmpl = emps.stream()
		.filter(employee -> employee.getEmployeeDesignation().contains("Engineer"))
		.sorted(Comparator.comparing(Employee::getEmployeeId))
		.collect(Collectors.toList());
		
		//Collections.reverse(sortedEmpl);
		
		System.out.println(sortedEmpl.get(sortedEmpl.size()-1).getEmployeeName());
		
		
		
		
		
		
		
		
		
		
		
	}

}
