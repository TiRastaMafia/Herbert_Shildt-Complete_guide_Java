class Massive {

  public static void main(String[] args) {
    int[] month_days = new int[12];
    String str = "";
    for (int day : month_days) {
      str += (str == ""?"" : "; ") + day;
    }

    System.out.println(str);
  }
}
