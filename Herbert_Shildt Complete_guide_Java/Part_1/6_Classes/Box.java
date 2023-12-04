class Box {
    double width;
    double height;
    double depth;

Box(Box ob) {
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
}
 


Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
}
    
Box() {
    width = -1;
    height = -1;
    depth = -1;
}

Box(double len){
    width = height = depth = len; 
}

double volume() {
        return width * height * depth;
    }
}
/*    void setDim(double w, double h, double d) {
            
    width = w;
    height = h;
    depth = d;
    }
*/


//class BoxDemo4 {
//    public static void main(String[] args) {
//    Box myBox1 = new Box();
//    Box myBox2 = new Box();

//        myBox1.width = 10;
//        myBox1.height = 20;
//        myBox1.depth = 15;

//        myBox2.width = 1;
//        myBox2.height = 2;
//        myBox2.depth = 1;
        
//        System.out.println("Объем коробки 1 равен " + myBox1.volume());

//        System.out.println("Объем коробки 2 равен " + myBox2.volume());
//    }
//}

/*class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        myBox1.setDim(10, 20, 15);
       
        myBox2.setDim(3, 6, 9);

        System.out.println("Объем коробки 1 равен " + myBox1.volume());

        System.out.println("Объем коробки 2 равен " + myBox2.volume());
    }
}
*/

/*class BoxDemo6 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        vol = myBox1.volume();
        System.out.println("Объем равен " + vol);
        
        vol = myBox2.volume();
        System.out.println("Объем коробки 2 равен " + vol);
    }
}
*/


/*class BoxDemo7 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);
        double vol;

        vol = myBox1.volume();
        System.out.println("Объем равен " + vol);
        
        vol = myBox2.volume();
        System.out.println("Объем коробки 2 равен " + vol);
    }
}



class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        double vol;
    
    vol = mybox1.volume();
    System.out.println("Объем mybox1 равен " + vol);
    vol = mybox2.volume();
    System.out.println("Объем mybox2 равен " + vol);
    vol = mycube.volume();
    System.out.println("Объем mucube равен " + vol);

    }
}
*/

class OverloadCons2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1);
        double vol;
    
    vol = mybox1.volume();
    System.out.println("Объем mybox1 равен " + vol);
    vol = mybox2.volume();
    System.out.println("Объем mybox2 равен " + vol);
    vol = mycube.volume();
    System.out.println("Объем mucube равен " + vol);
    vol = myclone.volume();
    System.out.println("Объем копии равен " + vol);
    }
}
