package week3.assignment;



public class Students {
	public void getStudentInfo(String name, int id) {
		System.out.println("name" + name);
		System.out.print("id num is"+id);
		
	}
	public void getStudentInfo(String email , long phonenum) {
		System.out.println(email +" "+  phonenum);
	}

	public static void main(String[] args) {
		
    Students info = new Students();
    info.getStudentInfo("jyoti", 78);
    info.getStudentInfo("test@testing.com", 4578912560l);
	}

}
