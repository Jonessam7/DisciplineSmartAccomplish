package DisciplineSmartAccomplish.DailyCode.d03m01y25;


class Node{
  int data;
  Node next;

  Node(int data1, Node next1){
    this.data=data1;
    this.next=next1;
  }

 Node(int data1){
  this.data=data1;
  this.next=null;
 }

}

public class LinkendLsitIfPresent {
//Check If Presetn in Linked List
public static int CIPILL(Node head, int target){
//  Node head = head;

 while (head != null) {
  if(head.data == target){
    return head.data;
  }
  head = head.next;
 }
 return 0;
}

 public static void main(String[] args) {
  int[] arr ={1,2,3};
  Node head = new Node(arr[0]);
  head.next = new Node(arr[1]);
  head.next.next = new Node(arr[2]);

  int val =3;

  System.out.println(CIPILL(head, val));
 }
}
