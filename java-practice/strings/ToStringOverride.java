package strings;

// here toString is overridden by my own method presented in the class Box,for
// that class only.... now I would build another class and use it without overriding...

class Box{
    double width;
    double height;
    double depth;
    Box(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    @Override
    public String toString() {
        return "Dimensions are " + width + " by " + height + " by " + depth;
    }
}
class BoxAlpha{     // This BoxAlpha will not include an overridden method for that toString() method of the Object class
    double width;
    double height;
    double depth;
    BoxAlpha(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
}
public class ToStringOverride {
    public static void main(String[] args) {
        Box cube = new Box(10,15,20);
        String s = "Box cube: " + cube;

        BoxAlpha cubeAlpha = new BoxAlpha(100,150,200);
        String sAlpha = "cubeAlpha: " + cubeAlpha;

        System.out.println("For cube:");
        System.out.println(cube);
        System.out.println(s);

        System.out.println("For cubeAlpha:");
        System.out.println(cubeAlpha);
        System.out.println(sAlpha);
    }
}
