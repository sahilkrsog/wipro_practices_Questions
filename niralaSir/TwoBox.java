class Box{
    double width;
    double height;
    double depth;
    double vol;
}
class TwoBox{
    public static void main(String[] args) {
        
    
    Box mybox1 = new Box();
    Box mybox2 =new Box();
    // double vol ;
    mybox1.width = 10;
    mybox1.height = 20;
    mybox1.depth = 30;
    mybox2.width = 20;
    mybox2.height = 30;
    mybox2.depth = 30;

    mybox1.vol = mybox1.height * mybox1.width * mybox1.depth;
    mybox2.vol = mybox2.height * mybox2.width * mybox2.depth;
        System.out.println(mybox1.vol);
        System.out.println(mybox2.vol);
}


}