import entities.PhanSo;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    // PhanSo ps = new PhanSo();
    // ps.init(1, 3);
    // ps.print();
    // PhanSo.testStaticField("1/4");
    //
    // PhanSo ps2 = new PhanSo();
    // ps.init(2, 3);
    // ps.print();
    // PhanSo.testStaticField("1/5");

    Scanner sc = new Scanner(System.in);
    System.out.print("a/b = ");
    String input = sc.nextLine();

    // PhanSo ps = new PhanSo();
    // ps.fromString(input);
    // ps.print();

    PhanSo ps = PhanSo.fromString(input);
    ps.print();
  }
}
