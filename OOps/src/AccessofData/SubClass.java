package AccessofData;

public class SubClass extends A{
	
	int age;

    public SubClass(int num, String name) {
        super(num, name);
    }

    public SubClass(int num, String name,int age)
    {
    	super(num, name);
    	this.age = age;
    }
    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Kunal Kushwaha");
        int n = obj.num;

        System.out.println(obj instanceof Object);
    }
}