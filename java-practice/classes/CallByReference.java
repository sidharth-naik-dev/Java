package classes;

class TestClass{
    int a;
    int b;

    TestClass(int i, int j){
        a = i;
        b = j;
    }

    // we will here pass an object
    void meth(TestClass o){
        o.a *= 2;
        o.b /= 2;
    }
}

public class CallByReference {
    public static void main(String[] args) {
        TestClass ob = new TestClass(15,20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}
