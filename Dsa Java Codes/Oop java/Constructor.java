class pair
{   
   int x;
    int y;
   public  pair(int v1,int v2) // paratermetrized constructed
    {
        x=v1;
        y=v2;
    }
   public pair(pair p1) // copy constructed
    {
        x=p1.x;
        y=p1.y;
    }
    void display()
{
    System.out.println(x);
    System.out.println(y);
}
public static void main(String[] args) 
    {
       pair p1 = new pair(10,20); // passing parameters
       p1.display();

       pair p2 = new pair(p1.x,p1.y);
       p2.display();
    }
}
