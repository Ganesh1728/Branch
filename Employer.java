package Com.hcl;

public class Employer extends Manager {

	private void project1() {
        System.out.println("Project Name : OOPS");
	}
	
    private void employee1() {
        System.out.println("No of Employer : 10");
	}
	
	private void qualifications1() {
        System.out.println("Qualifications : B.sc");
	}
	
	private void teem1() {
        System.out.println("No of Teems : 2");
	}
	
	public static void main(String[] args) {
		
      Employer s= new Employer();
		
        
		s.project();
        s.employee();
        s.qualifications();
        s.teem();
        s.project1();
		s.employee1();
		s.qualifications1();
		s.teem1();
	}

	
}
