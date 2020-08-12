
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model m = new Model(200, 200);
		View v = new View();
		Controller c = new Controller(m, v);
	}

}
