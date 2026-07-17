package classes;

class Test{
    int a, b;

    Test(int i, int j){
        a = i;
        b = j;
    }
    // return true if o is equal to the invoking object
    boolean equalTo(Test o){
        return o.a == a && o.b == b;
    }
}

public class PassObject {
    static void main() {
        Test ob1 = new Test(1,2);
        Test ob2 = new Test(1,2);
        Test ob3 = new Test(5,6);
        System.out.println(ob2.equalTo(ob1));
        System.out.println(ob3.equalTo(ob1));
    }
}
