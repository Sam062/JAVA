interface Test1{
	int x=100;
	void show();
}
class AnonymousClass {
	public static void main(String[] args) {
		Test1 t=new Test1() {
			public void show() {
				System.out.println("Anonymous Class "+(x+10));
			}
		};
		t.show();
	}

}
