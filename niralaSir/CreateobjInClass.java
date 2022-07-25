class Box{
    // variable decleare in class 
    double width;
    double height;
    double depth;
}
class CreateobjInClass
{
    public static void main(String[] args) 
    {
        Box mybox = new Box();
        double vol;       
        mybox.depth=20;
        mybox.height=10;
        mybox.width =15;
        vol = mybox.depth*mybox.width*mybox.height;
        System.out.println("volume is "+ vol);
    }
}    



