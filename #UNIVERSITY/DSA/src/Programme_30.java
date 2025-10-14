public class Programme_30{
    public static class Node{//class
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{//class
        Node head=null;
        Node tail=null;
        int size=0;
        void InsertAtEnd(int val){
            Node temp=new Node(val);//ye us nayi value ko temp me le lega
            if(head==null){//empty list
                head=temp;
                tail=temp;
            }else{//non empty
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        void InsertAtHead(int val){
            Node temp=new Node(val);
            //yaha par InsertAtEnd(val); ye bhi kar sakte hai kyuki case to dono me hai same
            if(head==null){//empty list
                head=temp;
                tail=temp;//head=tail=temp;
            }else{//non empty list
                temp.next=head;
                head=temp;
            }
            size++;
        }
        void InserAt(int idx,int val){
            Node t=new Node(val);//step 1
            Node temp=head;//travel ke liye
            if(idx==size){//agar size fun ka use karenge to size() ye likhenge otherwise size keval
                InsertAtEnd(val);
                return;
            }else if(idx==0){//eska matlab hum value ko head or 0th idx par add karenge
                InsertAtHead(val);
                return;
            }else if(idx<0 || idx>size){//agar size fun ka use karenge to size() ye likhenge otherwise size keval
                System.out.println("Wrong index");
            }
            for(int i=1;i<=idx-1;i++){//temp ko us idx se pahle atk hi le jana hai jaha value add karenge is liye idx-1 kiye hai
                temp=temp.next;
            }
            t.next=temp.next;//step 2
            temp.next=t;//step 3
            size++;
        }
        int getAt(int idx){
            if(idx<0 || idx>size){//agar size fun ka use karenge to size() ye likhenge otherwise size keval
                System.out.println("Wrong index");
                return -1;
            }
            Node temp=head;
            for(int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void deleteAt(int idx){
            if(idx==0){
                head=head.next;
                size--;
                return;
            }
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(idx==size-1){
                tail=temp;
            }
            size--;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        // int size(){
        //     Node temp=head;
        //     int count=0;
        //     while(temp!=null){
        //         count++;
        //         temp=temp.next;
        //     }
        //     return count;
        // }

    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.InsertAtEnd(1);
        ll.InsertAtEnd(2);
        ll.display();//1 2
        System.out.println();
        //System.out.println("Size is:"+ll.size());//2 (//agar size fun ka use karenge to size() ye likhenge otherwise size keval)

        ll.InsertAtHead(3);//3 1 2
        ll.display();
        System.out.println();
        ll.InserAt(1,10);//3 10 1 2
        ll.display();
        System.out.println();
        ll.InserAt(0,13);//3 13 10 1 2
        ll.display();
        System.out.println();
        System.out.println(ll.tail.data);//eska matlab hai ki hum ll me akiri me ya aukat se jada idx karenge to vo tail ko dege data

        ll.InserAt(0,100);
        ll.display();

        System.out.println();//next line ke liye
        System.out.println(ll.getAt(3));//3rd idx ki value(10)

        //System.out.print(ll.getAt(-8));//-1 value aayegi
        //System.out.println(ll.size);


        ll.deleteAt(4);//(100 13 3 10 1 2)-->(100 13 3 10 2)// 1 hat gya
        ll.display();
        System.out.println();
        System.out.println(ll.tail.data);


        ll.deleteAt(0);//(100 13 3 10 1 2)-->(13 3 10 2)// 100 hat gya
        ll.display();
    }
}
