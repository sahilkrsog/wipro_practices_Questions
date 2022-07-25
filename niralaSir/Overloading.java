class ShapeDemo {
    // square
    // circle
    // rectangle
    // triangle
    void shape(){
        System.out.println("No shape");

    }
    void shape(double l){
        System.out.println("Square");
    }
    void shape(double l,double b){
        System.out.println("Rectangle");
    }
    void shape(int l, int b,int h){
        System.out.println("Cube shape");
    }
}

class Overload {
    public void main(String[] args) {
        ShapeDemo noshape = new ShapeDemo();
        ShapeDemo square = new ShapeDemo();
        ShapeDemo rectangle = new ShapeDemo();
        // Shape cube = new Shape(10,20,30); 
        noshape.shape();;
        square.shape(10);
        rectangle.shape(10,20,30);
        
    }

}
