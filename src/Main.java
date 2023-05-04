/**
 * @author Max Day
 * Created At: 2023/04/05
 */

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        double tv = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price for the TV"));
        double laptop = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price for the laptop"));
        double microwave = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price for the microwave"));
        System.out.println(((tv + laptop + microwave) > 4000) ? "Error: The sum of the items is over the total credit" : "Approved"); // if statement embedded into print statement
    }
}