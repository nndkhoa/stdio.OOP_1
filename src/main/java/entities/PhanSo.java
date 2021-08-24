package entities;

public class PhanSo {
  private int tuSo;
  private int mauSo;

  private static int staticField;

  public void print() {
    System.out.format("%d/%d\n", this.tuSo, this.mauSo);
  }

  public void init(int tuSo, int mauSo) {
    this.tuSo = tuSo;
    this.mauSo = mauSo;
    staticField++;
  }

  public static void testStaticField(String str) {
    // staticField = 100;
    System.out.println(str);
    System.out.println(staticField);
  }

  public static PhanSo fromString(String str) {
    String[] parts = str.split("/");

    PhanSo ps = new PhanSo();
    ps.tuSo = Integer.parseInt(parts[0]);
    ps.mauSo = Integer.parseInt(parts[1]);
    return ps;
  }

  // public PhanSo fromString(String str) {
  //   String[] parts = str.split("/");
  //   this.tuSo = Integer.parseInt(parts[0]);
  //   this.mauSo = Integer.parseInt(parts[1]);
  //   return this;
  // }
}
