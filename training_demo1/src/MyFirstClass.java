/**
 * Created by user on 4/17/2016.
 */
public class MyFirstClass {
    Integer value1;
    Integer value2;
    public Integer getValue1() {
        return value1;
    }
    public void setValue1(Integer value1) {
        this.value1 = value1;
    }
    public Integer getValue2() {
        return value2;
    }
    public void setValue2(Integer value2) {
        this.value2 = value2;
    }
    public static void main(String[] args){
        MyFirstClass obj1 = new MyFirstClass();

        System.out.println("Before");
        System.out.println(obj1.getValue1());
        System.out.println(obj1.getValue2());

        System.out.println(String.valueOf(obj1.getValue1()) + obj1.getValue2());

        obj1.setValue1(10);
        obj1.setValue2(2);

        System.out.println("After");
        System.out.println(obj1.getValue1());
        System.out.println(obj1.getValue2());

        System.out.println(obj1.getValue1().toString()+obj1.getValue2());

//        int Addition = obj1.value1 + obj1.value2;
//        int Substraction = obj1.value1 - obj1.value2;
//        float Division = obj1.value1 / obj1.value2;
//        float Modulus = obj1.value1 % obj1.value2;
//        int Multiplication = obj1.value1 * obj1.value2;
//
//        System.out.println("Addition is : " + Addition);
//        System.out.println("Substraction is : " + Substraction);
//        System.out.println("Division is : " + Division);
//        System.out.println("Multiplication is :" + Multiplication);
//        System.out.println("Modulus is : " + Modulus);



    }
}
