package regExpr;
public class Paragraph {
    public static String changeDateFormat(String paragraph) {
       //throw new UnsupportedOperationException("Waiting to be implemented.");
        
        String[] pars = paragraph.split(" ");
        
        String sb= "";
        
        for(String wo : pars){
            String regex = "[0-9]";
            String me ;
            
           // System.out.println("hhhhh_____________");
            
         //  if ( wo.startsWith ){
            if ( wo.matches(regex) ){
        	   System.out.println("hhhhh_____________");
             //  SystemOutPrint("hiiiiiiiiiiii");
               
               me = wo.substring(3,5) + "/" + wo.substring(0,2) + wo.substring(5);
               
           }else {me = wo;}
            
            sb = sb + " " + me;
            
        }
        return sb;
    }

    public static void main(String[] args) {
        System.out.println(changeDateFormat(" 123  Last time it rained was on 07/25/2013 and today is 08/09/2013."));
    }
}