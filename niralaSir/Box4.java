class Box{
    double height;
    double weidth;
    double depth;
    double base;
    double volume(){
        return height*weidth*depth; 

    }
    double triangle(){
        return 0.5* base * height; 
    }
    void setpar(double b,double h){
        base = b;
        height =h;
    }

    void setvol(double h,double w , double d){
        weidth = w;
        height = h;
        depth = d;
    }


}


public class Box4 
{
    public static void main(String[] args) {
        Box mybox = new Box();
        Box mybox2 = new Box();
        Box tri = new Box();
        mybox.setvol(10, 10, 10);
        mybox2.setvol(10,20,30);
        tri.setpar(10, 20);
        System.out.println(tri.triangle());
        System.out.println(mybox.volume());
        System.out.println(mybox2.volume());


    }
    
}
