public class PatternSolving_01 {
    static void main() {
//        Pattern-11
//        int n=4;
//        for (int i=1;i<=n;i++) {
//            for (int j=1;j<=n-i;j++) {
//                System.out.print("  ");
//            }
//            if (i==1) {
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
//        for (int i=1;i<=(n-1);i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("  ");
//            }
//            if (i==(n-1)){
//                System.out.print("* ");
//            }
//            else {
//                System.out.print("* ");
//                for (int j=1;j<=2*(n-i)-3;j++){
//                    System.out.print("  ");
//                }
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Pattern-12
//        int n=4;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            for (int j=1;j<=2*(n-i);j++){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=(n+1)-i;j++){
//                System.out.print("* ");
//            }
//            for (int j=1;j<=3*i-(i+2);j++){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=(n+1)-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Pattern-13
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        Pattern-14
//        int n=5;
//        int count=1;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(count+" ");
//                count++;
//            }
//            System.out.println();
//        }

//        Pattern-15
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                int a = j;
//                int b = ('A'-1);
//                int ans = a+b;
//                char finalans = (char)ans;
//                System.out.print(finalans + " ");
//            }
//            System.out.println();
//        }

//        pattern-16
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                int a=n-j;
//                int b='A';
//                int ans=a+b;
//                char finalans=(char)ans;
//                System.out.print(finalans+" ");
//            }
//            System.out.println();
//        }

//        Pattern-17
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
//
//        for (int i=1;i<=n;i++){
//            if (i==1){
//                continue;
//            }
//            for (int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=2*i-1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Pattern-18
//        int n=4;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            for (int j=1;j<=i;j++){
//                System.out.print(j + " ");
//            }
//            int rowvalue = i;
//            int decrowvalue = i-1;
//            for (int j=1;j<=i-1;j++){
//                System.out.print(decrowvalue + " ");
//                decrowvalue--;
//            }
//            System.out.println();
//        }

//        Pattern-19
//        int n=4;
//        for (int i=1;i<=n;i++) {
//            for (int j=1; j<=n-i;j++) {
//                System.out.print("  ");
//            }
//            for (int j=1;j<=2*i-1;j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

//        Pattern-20
        int n=4;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                int a = j;
                int b = ('A'-1);
                int ans = a+b;
                char finalans = (char)ans;
                System.out.print(finalans + " ");
            }
            char toprint = (char)(i + 'A'-2);
            for (int j=1;j<=i-1;j++){
                System.out.print(toprint + " ");
                toprint--;
            }
            System.out.println();
        }
    }
}
