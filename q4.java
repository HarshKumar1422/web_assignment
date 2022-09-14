public class q4 {
    public static void main(String[] args)
    {
    
        int x = 10;
        int y = 5;
        // swapping without using extra variable
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping(without extra variable):"
                           + " x = " + x + ", y = " + y);

        // swapping by using extra variable

        int z=x;
        x=y;
        y=z;
        System.out.println("Again after swapping(with extra variable):"
                           + " x = " + x + ", y = " + y);

    }
}
