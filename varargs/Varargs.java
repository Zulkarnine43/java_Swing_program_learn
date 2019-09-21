/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varargs;

/**
 *
 * @author Shaon
 */
public class Varargs {
    void add(int ... num){
        int sum=0;
        for(int x:num){
            System.out.println(sum);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Varargs ob = new Varargs();
        ob.add(10,20);
        ob.add(10,20,30);
    }
    
}
