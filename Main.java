class Main {
  public static void main(String[] args) {
    int[] A = new int[] {7, 10, 4, 3, 20, 15};

    QuickSelect QS = new QuickSelect();
    System.out.println(QS.findKthSmallest(A, 4));
  }
}
