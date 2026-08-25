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
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=2*i-1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Pattern-6
//        int n=4;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i-1;j++){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=2*n-2*i+1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Pattern-7
//        int n=4;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=6;j++){
//                if (i==1||i==n){
//                    System.out.print("* ");
//                }
//                else {
//                    if (j==1){
//                        System.out.print("* ");
//                    }
//                    else if (j==6){
//                        System.out.print("* ");
//                    }
//                    else {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }

//        Pattern-8
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                if (i==3 && j==2){
//                    System.out.print("  ");
//                } else if (i==4 && (j==2 || j==3)) {
//                    System.out.print("  ");
//                }
//                else {
//                    System.out.print("* ");
//                }
//            }
//            System.out.println();
//        }

//        Pattern-9
//        int n=5;
//        for (int i=1;i<=n;i++) {
//            for (int j=1;j<=n-i;j++) {
//                System.out.print("  ");
//            }
//            if (i==1 || i==n) {
//                for (int j=1;j<=2*i-1;j++) {
//                    System.out.print("* ");
//                }
//            } else {
//                System.out.print("* ");
//                for (int j=1;j<=2*i-3;j++) {
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Pattern=10
//        int n=4;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=2*i-1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i=1;i<=n;i++){
//            if (i==1){
//                continue;
//            }
//            for (int j=1;j<=i-1;j++){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=2*n-2*i+1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}
