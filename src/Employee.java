public class Employee {
    private int salary = 5000;
    private String address = "India";

    public volatile int stockPrice = 100;
    int a = (int) 50L;

    int b = 'i';

    Object q = a;
    public String getAddress() {
        System.out.println(this);
        return address;
    }

    public int getSalary() {
        return salary;
    }

    public int getSalary(int ...x){
        System.out.println("Array of length " + x.length);
        for(int each_x:x){
            System.out.println(each_x);
        }
        staticMethod();
        return x.length;
    }

    public synchronized void callPCO(){
        System.out.println("only one person can talk from PCO at a time");
    }

    public static void staticMethod(){
        System.out.println("called Static method");
    }

    public static void getDept(){
        System.out.println("IT Dept");
        System.out.println(new Employee().getSalary());
        staticMethod();
    }

    public static void main(String ...args) {
        Employee e = new Employee();
        e.getSalary(1,2,4,5);
        System.out.println(e.getAddress());
        System.out.println(e.getSalary());
        getDept();
        Employee.getDept();
        System.out.println(e.address);
        System.out.println(e.getAddress());
    }

}

class Foo {
    public int left = 9;
    public int right = 3;
    public void setLeft(int leftNum) {
        left = leftNum;
        right = leftNum/3;
    }
    // lots of complex test code here
}
