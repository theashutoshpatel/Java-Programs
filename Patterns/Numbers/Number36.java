class Number36 {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i + j >= 5 && j - i <= 3 && i <= 4 || i - j <= 3 && i + j <= 11 && i >= 4) {
                    System.out.print(i+" ");
                } else {
                    System.out.print("  ");
                }


            }
            System.out.println();
        }
    }
}
//      1       
//    2 2 2     
//   3 3 3 3 3   
// 4 4 4 4 4 4 4
//   5 5 5 5 5
//     6 6 6
//       7    