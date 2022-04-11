package com.bddcucumberframework.pagesObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public DashboardPage dashboardpage;
	public LoginPage loginpage;
	public SystemUserPage systemuserpage;
	public AddUserPage adduserpage;
	public EditUserPage editUserPage;
	public CustomPage customPage;
	public ReportingMethodPage reportingMethodPage;
	public DataImportPage dataImportPage;
	public LogoutPage logoutPage;
	public JobPage jobpage;
	public AddJobPage addjobpage;
	public AddEmployeePage addemployeepage;
	public EditEmployeePage editEmployeePage;


	public PageObjectManager(WebDriver driver) {			
		
		this.driver = driver;		
	}


	public LoginPage getLoginPage(){

		loginpage = new LoginPage(driver);
		return loginpage;

	}

	public DashboardPage getDashboardPage(){

		dashboardpage = new DashboardPage(driver);
		return dashboardpage;

	}

	public SystemUserPage getSystemUserPage(){
		systemuserpage = new SystemUserPage(driver);
		return systemuserpage;
	}

	public AddUserPage getAddUserPage(){

		adduserpage = new AddUserPage(driver);
		return adduserpage;



	}

	public EditUserPage getEditUserPage(){

		editUserPage = new EditUserPage(driver);
		return editUserPage;

	}

	public CustomPage getCustomPage(){
		customPage = new CustomPage(driver);
		return customPage;

	}

	public ReportingMethodPage getRepotingMethodPage(){

		reportingMethodPage = new ReportingMethodPage(driver);
		return reportingMethodPage;
	}

	public DataImportPage getDataImportPage(){

		dataImportPage = new DataImportPage(driver);
		return dataImportPage;

	}

	public LogoutPage getLogoutPage(){

		logoutPage = new LogoutPage(driver);
		return logoutPage;

	}

	public JobPage getJobPage(){

		jobpage = new JobPage(driver);
		return jobpage;

	}

	public AddJobPage getAddJobPage(){

		addjobpage = new AddJobPage(driver);
		return addjobpage;

	}

	public AddEmployeePage getAddEmployeePage(){

		addemployeepage = new AddEmployeePage(driver);
		return addemployeepage;

	}

	public EditEmployeePage getEditEmployeePage(){

		EditEmployeePage editemployeePage = new EditEmployeePage(driver);
		return editemployeePage;

	}


	public EmployeePersonalDetailPage getEmployeePersonalDetailsPage(){

		EmployeePersonalDetailPage employeepersonaldetailpage = new EmployeePersonalDetailPage(driver);
		return employeepersonaldetailpage;

	}

	public EmployeeContactDetailPage getEmployeeContactDetailsPage(){

		EmployeeContactDetailPage employeecontactdetailpage = new EmployeeContactDetailPage(driver);
		return employeecontactdetailpage;

	}


	public EmployeeEmergencyContactDetailPage getEmployeeEmergencyContactDetailsPage(){

		EmployeeEmergencyContactDetailPage employeeemergencycontactdetailpage = new EmployeeEmergencyContactDetailPage(driver);
		return employeeemergencycontactdetailpage;

	}

	public EmployeeImmigrationRecordPage getEmployeeImmigrationRecordPage(){

		EmployeeImmigrationRecordPage Employeeimmigrationrecordpage = new EmployeeImmigrationRecordPage(driver);
		return Employeeimmigrationrecordpage;

	}

	public EmployeeJobPage getEmployeeJobPage(){

		EmployeeJobPage employeejobpage = new EmployeeJobPage(driver);
		return employeejobpage;

	}


	public EmployeeSalaryPage getEmployeeSalaryPage(){

		EmployeeSalaryPage employeesalarypage = new EmployeeSalaryPage(driver);
		return employeesalarypage;

	}


	public EmployeeTaxExamptionPage getEmployeeTaxExamptionPage(){

		EmployeeTaxExamptionPage employeetaxexamptionpage = new EmployeeTaxExamptionPage(driver);
		return employeetaxexamptionpage;

	}

	public EmployeeMemberShipPage getEmployeeMemberShipPage(){

		EmployeeMemberShipPage employeemembershippage = new EmployeeMemberShipPage(driver);
		return employeemembershippage;

	}

	public DeleteEmployeePage getDeleteEmployeePage(){

		DeleteEmployeePage deleteemployeepage = new DeleteEmployeePage(driver);
		return deleteemployeepage;


	}































}
