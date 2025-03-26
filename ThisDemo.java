class box{
    private int length;
    private int width;
    private int height;

    public box(int length, int width, int height){
        this.length = length;
        this.width = width;
        this.height = height;

    }
    public box(int side){
        this(side, side, side);
    }
    public int calculateVolume(){
        return length * width * height;
    }
}
public class ThisDemo {
    public static void main(String[] args){
        box box1 = new box(5, 4, 3);
        System.out.println("volume of box " + box1.calculateVolume());

        box box2 = new box(6);
        System.out.println("volume of box " + box2.calculateVolume());

    }
    
}
