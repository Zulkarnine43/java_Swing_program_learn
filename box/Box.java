/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

public class Box {
    double height,width,depth;
    Box(double h, double w,double d){
       height=h;
       width=w;
       depth=d;
    }
    void display(){
        double val=height*width*depth;
        System.out.println("Volume is :"+val);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Box b1=new Box(10,20,30);
        Box b2=new Box(20,40,50);
        b1.display();
        b2.display();
    }
    
}
