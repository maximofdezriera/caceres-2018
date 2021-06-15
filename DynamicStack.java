public class DynamicStack
{
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node top = null;
    void push(int x)  //VOLCADO
    {
        Node newnode = new Node(x);
        newnode.next = top; 
        top = newnode; 
        System.out.println("pushed element is: "+ top.data);
    }

    void display()
    {
        Node temp = top;
        if(temp == null) {
            System.out.println("no data to display");
            // underflow condition
        }
        else
        {
            System.out.println("Elements in stack are:");
            while(temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    void peek()
    {
        if(top == null) {
            System.out.println("stack is empty");
            //stack underflow
        }
        else
        {
            System.out.println("top element is : " + top.data);
        }

    }

    void pop()
    {
        if(top == null)
        {
            System.out.println("underflow");
        }
        else
        {
            System.out.println("popped element is :"+ top.data);
            top = top.next;
        }
        return;
    }
    void isEmpty()
    {
        if(top == null)
        System.out.println("stack is empty");
        else 
        System.out.println("stack is not empty");
    }
    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.peek();
        stack.isEmpty();
        stack.display();
    }
}

