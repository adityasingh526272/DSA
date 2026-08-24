public class PatternSolving {
    static void main() {
//        Pattern-1
//        for (int i=1;i<=3;i++){
//            for (int j=1;j<=5;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Pattern-2
//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Pattern=3
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Pattern-4
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i+1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Pattern-5
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
