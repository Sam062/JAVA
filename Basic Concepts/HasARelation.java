class Address{
	String hno;
	String street;
	String city;
	int pinCode;
	Address(String hno,String street,String city,int pinCode){
		this.hno=hno;
		this.street=street;
		this.city=city;
		this.pinCode=pinCode;
	}
	void show() {
		System.out.println("HouseNo="+hno+" street="+street+" city="+city+" pinCode="+pinCode);
	}
	
}
public class HasARelation {
	int empNo;
	String name;
	HasARelation(int empNo,String name){
		this.empNo=empNo;
		this.name=name;
	}
	void disp() {
		System.out.println("Emp No="+empNo+" name="+name);
	}
	Address add1=new Address("xyz","TLGH","LKO",226025);
	Address add2=new Address("abc","BHEL","JDSP",227817);
	public static void main(String[] args){
		HasARelation e=new HasARelation(101,"Shivam");
		e.disp();
		e.add1.show();
		e.add2.show();
	}
	
}
