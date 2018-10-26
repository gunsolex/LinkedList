public class Node
{
    public int value;
    public Node nextNode;

public Node()
{
    
}
public Node(int value)
{
    this.value = value;
    nextNode = null;
}

public Node(int value, Node nextNode)
{
    this.value = value;
    this.nextNode = nextNode;
}

}