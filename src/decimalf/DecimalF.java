/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decimalf;
import java.text.DecimalFormat;
/**
 *
 * @author ANHEN3335
 */
public class DecimalF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double number = 912.3456;
        DecimalFormat x = new DecimalFormat ("###.##");
        System.out.println (x.format(number));
    }
    
}

