public class Employee {
    public int empno;     //員工編號
    public String lastName;  //員工姓
    public String firstName; //員工名　　
    public String position; // Employee position
    public String address; // Employee Address
    public int salary; // Employee pay
    
    public void display() {
         System.out.printf("Employee Number = %s%n", empno);
         System.out.printf("Employee Name   = %s %s%n", firstName, lastName); 
         System.out.printf("Position        = %s%n", position);
         System.out.printf("Salary          = NT %,d%n", salary); 
         System.out.printf("Address         = %s%n", address); 
         System.out.println("");
    }
    
    public static void main(String[] args) {
          Employee e1 = new Employee();
          e1.empno = 7001;
          e1.lastName = "King";
          e1.firstName = "Robert";
          e1.position = "Manager";
          e1.salary = 75000;
          e1.address = "213 Street Da\'an, Taipei";
          Employee e2 = e1;
          e1.display();
          e2.display();
    }
}
