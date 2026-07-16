public class StarPatterns {
    public void rightAngleTriangleShape(){
        System.out.println("Right-Angle Triangle Shape");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void upsideDownRightAngleTriangleShape(){
        System.out.println("Upside Down Right-Angle Triangle Shape");
        for (int i = 5; i >= 0; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pyramidShape(){
        System.out.println("Pyramid Shape");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >=1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void upsideDownPyramidShape(){
        System.out.println("Upside Down Pyramid Shape");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <=5; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void squareShape(){
        System.out.println("Square Shape");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public void hollowSquareShape(){
        System.out.println("Hollow Square Shape");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i >= 2 && i <= 4 && j >= 2 && j <= 4) {
                    System.out.print("   ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }

    static void main() {
        StarPatterns sp = new StarPatterns ();
//        sp.rightAngleTriangleShape();
        sp.upsideDownRightAngleTriangleShape();
//        sp.pyramidShape();
//        sp.squareShape();
//        sp.hollowSquareShape();
//        sp.upsideDownPyramidShape();
    }
}
