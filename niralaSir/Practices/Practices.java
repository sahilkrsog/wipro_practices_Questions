class Box{
    //width 
    // height 
    //depth
    double width ;
    double height;
    double depth;
    void displayVol(){
        System.out.println(height*width*depth);

    }
        


}
class Practices{
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;
        double area ;
        myBox.depth = 10;
        myBox.height =10;
        myBox.width =10;
        myBox.displayVol();
        
        
    }
}