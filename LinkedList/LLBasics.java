
public class LLBasics {

    public static void main(String[] args) {
        // LL list=new LL();

        // // insert in linked list;
        // list.insertFirst(2);
        // list.insertFirst(3);
        // list.insertFirst(4);
        // list.insertLast(0);
        // list.insertLast(-1);
        // list.insertAtPosition(8, 2);
        // // list.deleteFirst(); 
        // // list.deleteLast();
        // list.delete(1);
        // list.display();
        //DLL
        DLL list = new DLL();
        // insert in linked list;
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(17);
        list.insertFirst(21);
        list.insertLast(10);
        // list.insertAtIndex(0, 22);
        list.deleteFirst();
        list.deleteLast();
        // list.display();

        CLL l = new CLL();
        l.insert(10);
        l.insert(7);
        l.insert(22);
        l.insert(55);
        l.insert(2);
        l.delete(10);
		l.displayCC();
    }

}
