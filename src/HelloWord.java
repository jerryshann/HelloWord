import android.app.Activity;

public class HelloWorld extends Activity{

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void test (){
	system.out.print("hello workd");
	}
}