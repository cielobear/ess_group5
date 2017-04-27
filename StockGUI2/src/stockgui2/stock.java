/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockgui2;

/**
 *
 * @author c1elobear
 */
public class stock {
    
    private String item;
    private String supplier;
    private String count;

    public stock (String itemIn, String supplierIn, String countIn) {
        
        this.item = itemIn;
        this.supplier = supplierIn;
        this.count = countIn;
       
    }

   

    
        //Creates String of text fields for List view
    @Override
    public String toString(){
        return  this.item + 
               "__________________________" + this.supplier + 
               "__________________________" + this.count; 
             
    }

   
}
