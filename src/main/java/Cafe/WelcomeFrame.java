/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafe;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author tuba
 */

class WelcomeFrame extends JFrame {
    JPanel panel;
    JLabel label;
    
    WelcomeFrame ( String title ){
    super(title);
    setSize( 300, 80 );
    setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout( new FlowLayout() );
    label = new JLabel("Welcome to NIE CAFE MANAGER!");
    add( label );
   }
}

