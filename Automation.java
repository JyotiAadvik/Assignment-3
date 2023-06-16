package week3.assignment;

public class Automation extends MultipleLangauge implements TestTool {
	


	public static void main(String[] args) {
		Automation aut = new Automation();
		aut.Java();
		aut.python();
		aut.Selenium();
		aut.ruby();
		
		
		

	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Automation");
	}

	@Override
	public void ruby() {
		System.out.println("unimplement");
		
	}

	
		
		
	
	

}
