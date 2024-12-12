package sis.testbase;

import sis.pages.AddStudentPageElements;
import sis.pages.AddTeacherPageElements;
import sis.pages.EnrollStudentPages;
import sis.pages.LoginPageElements;
import sis.pages.MainPageElements;
import sis.pages.ParentalPageElements;
import sis.pages.StudentPageElements;
import sis.pages.VerifyStudentPageElements;
import sis.pages.VerifyTeacherRolePageElements;

public class PageInitializer extends BaseClass {

	public static LoginPageElements loginPage;
	public static MainPageElements mainPage;
	public static StudentPageElements studentPage;
	public static AddStudentPageElements addStudent;
	public static ParentalPageElements parentTab;
	public static VerifyStudentPageElements verifyStudent;
	public static EnrollStudentPages enrollStudent;
	public static AddTeacherPageElements addTeacher;
	public static VerifyTeacherRolePageElements teacherRole;
	
	public static void initialize() {
		loginPage = new LoginPageElements();
		mainPage = new MainPageElements();
		studentPage = new StudentPageElements();
		addStudent = new AddStudentPageElements();
		parentTab = new ParentalPageElements();
		verifyStudent = new VerifyStudentPageElements();
		enrollStudent = new EnrollStudentPages();
		addTeacher = new AddTeacherPageElements();
		teacherRole = new VerifyTeacherRolePageElements();
		
	}
	
}