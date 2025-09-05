

class pattern{
    //Star square
   public static void pattern1(int a){
    for(int i=1;i<=a;i++ ){
        for(int j=1;j<=a;j++){
            System.out.print("*");
        }
        System.out.println();
    }
   }
   // Star triangle
   public static void pattern2(int a){
    for(int i=1;i<=a;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
   }
   //Pyramid pattern
   public static void pattern3(int a){
     for(int i=1;i<=a;i++ ){
        for(int j=1;j<=a-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
   }
   // Reverse pyramid
   public static void pattern4(int a){
    for(int i=a;i>=1;i--){
        for(int j =1;j<=a-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }

   }
   // Hollow square
   public static void pattern5(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if (i == 1 || i == n || j == 1 || j == n) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
// Hollow  right triangle
public static void pattern6(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            if (j == 1 || j == i || i == n) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }   
}
// Hollow pyramid
public static void pattern7(int n) {
    for (int i = 1; i <= n; i++) {
        
        for (int j = 1; j <= n - i; j++) {
            System.out.print(" ");
        }
        
        for (int k = 1; k <= 2 * i - 1; k++) {
            if (k == 1 || k == 2 * i - 1 || i == n) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
// Number pattern
static void pattern8(int a) {
        for(int i=1; i<=a; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    //Diamond pattern
    public static void pattern9(int a) {
    // upper pyramid
    for (int i = 1; i <= a; i++) {
        for (int j = 1; j <= a - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
    // lower inverted pyramid
    for (int i = a - 1; i >= 1; i--) {
        for (int j = 1; j <= a - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
// Hollow pyramid pattern
public static void pattern10(int a) {
    // upper hollow pyramid
    for (int i = 1; i <= a; i++) {
        for (int j = 1; j <= a - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= 2 * i - 1; k++) {
            if (k == 1 || k == 2 * i - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    // lower hollow inverted pyramid
    for (int i = a - 1; i >= 1; i--) {
        for (int j = 1; j <= a - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= 2 * i - 1; k++) {
            if (k == 1 || k == 2 * i - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
// Sandglass pattern
public static void pattern11(int a) {
    // inverted pyramid
    for (int i = a; i >= 1; i--) {
        for (int j = 1; j <= a - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
    // normal pyramid
    for (int i = 2; i <= a; i++) {
        for (int j = 1; j <= a - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

   public static void main(String[] args){
    System.out.println("------------------------");
    pattern1(4);
    System.out.println("------------------------");
    pattern2(8);
    System.out.println("------------------------");
    pattern3(8);
    System.out.println("------------------------");
    pattern4(8);
    System.out.println("------------------------");
    pattern5(8);
    System.out.println("------------------------");
    pattern6(7);
    System.out.println("------------------------");
    pattern7(9);
    System.out.println("------------------------");
    pattern8(8);
    System.out.println("------------------------");
    pattern9(8);
    System.out.println("------------------------");
    pattern10(9);
    System.out.println("------------------------");
    pattern11(8);

   }
}