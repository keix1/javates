
@Info("Sample2 class")
public class SampleClass2 {

	@Info("foo field")
	private String foo;

	@Info("default constract")
	public SampleClass2(){
		foo = new String();
//		foo = new Foo();
	}

	@Info("bar method")
	public void bar() {
		foo.toString();
	}

}
