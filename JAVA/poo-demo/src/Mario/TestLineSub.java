package Mario;

public class TestLineSub {
   public static void main(String[] args) {
      LineSub l1 = new LineSub(0, 0, 3, 4);
      System.out.println(l1);
   
      Point p1 = new Point(1, 2);
      Point p2 = new Point(2, 3);
      Line l2 = new Line(p1, p2);
      System.out.println(l2);

   }
}