
package za.ac.java;


public class Convert {

    public Convert() {
    }
   public String convertMass(String opt,double num1){
       
       
                   if (opt.equals("G-Kg")) {
                     return num1/1000+" kg"; 
           }else
                   if (opt.equals("mg-g")) {
                     return num1/100+" g";
           }else 
                   if (opt.equals("g-mg")) {
                     return num1*100+" mg";
           }
           
      
       return "You entered nonsense";
       }
        
       
    
public String convertLength(String opt,double num1){

                  if (opt.equals("mm-cm")) {
                      return num1/10+" cm";
           }else
                  if (opt.equals("cm-m")) {
                      return num1/100+" m";
           }else 
                   if (opt.equals("m-mm")) {
                       return num1*1000+" mm";
           }
return "Heban";
}
}
