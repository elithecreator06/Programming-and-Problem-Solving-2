public class BlueRayCollection{
    private Node head = null;

    public void add(String title, String director, int yearOfRelease, double cost){
        BlueRayDisk newDisk = new BlueRayDisk(title, director, yearOfRelease, cost);
        Node newNode = new Node(newDisk);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }


    public void show_all(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
