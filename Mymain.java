public class Mymain {

    public static void main(String[] args) {
        MyArraystack mystack = new MyArraystack(3);
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(4);
        mystack.in();

        mystack.pop();
        mystack.in();
        mystack.pop();
        mystack.in();
        mystack.pop();
        mystack.in();
        mystack.pop();
        mystack.in();

    }
}
