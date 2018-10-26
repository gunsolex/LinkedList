public class Linkedlist
{

    public Node head;

    public Linkedlist()
    {

    }
    public static void main(String [] args)
    {
      Linkedlist trylist = new Linkedlist();
      Node firstNode = new Node(5);
      Node secondNode = new Node(2);
      Node thirdNode = new Node(3);
      trylist.addNode(firstNode);
      trylist.addNode(secondNode);
      trylist.addIndex(firstNode,thirdNode);
      System.out.println(trylist);
    }

    public void addNode(Node newNode)
    {
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node tempNode = new Node();
            tempNode = head;
           while(tempNode.nextNode!=null)
           {
                tempNode = tempNode.nextNode;
                
           }
           tempNode.nextNode = newNode;
        }
    }

    public void addIndex(Node prevNode, Node newNode)
    {
        newNode.nextNode = prevNode.nextNode;
        prevNode.nextNode = newNode;
    }

    public String toString()
    {
        String output = "";
        if(head!=null)
        {
            System.out.println(head.value);
            Node tempNode = new Node();
            tempNode = head.nextNode;
            while(tempNode.nextNode!=null)
            {
                System.out.println(tempNode.value);
                tempNode = tempNode.nextNode;
            }
            System.out.println(tempNode.value);
        }
        return output;
    }
}