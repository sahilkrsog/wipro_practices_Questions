class Box{
    double height;
    double weidth;
    double depth;
    void volume(){
        System.out.println("Volume "+ height*weidth*depth);
    }
}

class BoxWithMethod {
    public static void main(String[] args) {
        
    
    Box mybox = new Box();
    mybox.height = 10;
    mybox.weidth = 20;
    mybox.depth = 30;
    mybox.volume();
    
}
}
