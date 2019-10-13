package EmployeeDetails;

import java.util.ArrayList;

import EmployeeDetails.EmployeeDao;

public class EmployeetabService {

	public static void main(String[] args) {

		EmployeeDao employeetab = new EmployeeDao();
//		ArrayList<Employeetab> emps = employeetab.getEmp_cityinfo("Bangalore");
//		
//		for (Employeetab tabs : emps) {
//			System.out.println(tabs);
//
//		}
//
		ArrayList<Employeetab> emps1 = employeetab.getEmp_deptinfo("HR", "Sales");
		for (Employeetab tabs : emps1) {
			System.out.println(tabs);

		}
//
//		ArrayList<Employeetab> emps2 = employeetab.getEmp_age_cityinfo(25, "Bangalore");
//		for (Employeetab tabs : emps2) {
//			System.out.println(tabs);
//
//		}
//
//		ArrayList<Employeetab> emps3 = employeetab.getEmp_ageinfo(25);
//		for (Employeetab tabs : emps3) {
//			System.out.println(tabs);
//
//		}

//		ArrayList<Employeetab> emps4 = employeetab.getEmp_age_deptinfo();
//		for (Employeetab tabs : emps4) {
//			System.out.println(tabs);
//
//		}

	}
}
