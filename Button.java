import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Button extends JFrame 
{
    private JButton Button1; 
    private JButton Button2; 
    private JButton Button3; 
    private JButton Button4; 

    public Button()
    {
        super("Project for OOP");
        setLayout( new FlowLayout() ); 
        Icon Online1 = new ImageIcon( getClass().getResource( "Online.png" ) );
        Button1 = new JButton( "Addition", Online1 );

        add( Button1 );

        Icon Online2 = new ImageIcon( getClass().getResource( "minus.png" ) );
        Button2 = new JButton( "Substraction", Online2 );
        add( Button2 );

        Icon Online3 = new ImageIcon( getClass().getResource( "multiply.png" ) );
        Button3 = new JButton( "Multiplication", Online3 );
        add( Button3 );

        Icon Online4 = new ImageIcon( getClass().getResource( "divide.png" ) );
        Button4 = new JButton( "Division", Online4 );
        add( Button4 );

        ButtonHandler handler = new ButtonHandler();
        Button1.addActionListener( handler );
        Button2.addActionListener( handler );
        Button3.addActionListener( handler );
        Button4.addActionListener( handler );

    } 

    private class ButtonHandler implements ActionListener 
    {
        public void actionPerformed( ActionEvent event )
        {
            // JOptionPane.showMessageDialog( Project.this, String.format( "You pressed: %s", event.getActionCommand() ) );
            if(event.getSource() == Button1)
            {
                String firstNumber =  JOptionPane.showInputDialog( "Enter first integer" );
                String secondNumber = JOptionPane.showInputDialog( "Enter second integer" );

                int number1 = Integer.parseInt( firstNumber ); 
                int number2 = Integer.parseInt( secondNumber );
                int sum = number1 + number2;

                JOptionPane.showMessageDialog( null, "The sum is " + sum, "Addition of Two Integers", JOptionPane.INFORMATION_MESSAGE );
            }

            if(event.getSource() == Button2)
            {
                String firstNumber =  JOptionPane.showInputDialog( "Enter first integer" );
                String secondNumber = JOptionPane.showInputDialog( "Enter second integer" );

                int number1 = Integer.parseInt( firstNumber ); 
                int number2 = Integer.parseInt( secondNumber );
                int sum = number1 - number2;
                
                JOptionPane.showMessageDialog( null, "The sum is " + sum, "Substraction of Two Integers", JOptionPane.INFORMATION_MESSAGE );
            }

            if(event.getSource() == Button3)
            {
                String firstNumber =  JOptionPane.showInputDialog( "Enter first integer" );
                String secondNumber = JOptionPane.showInputDialog( "Enter second integer" );

                int number1 = Integer.parseInt( firstNumber ); 
                int number2 = Integer.parseInt( secondNumber );
                int sum = number1 * number2;
                
                JOptionPane.showMessageDialog( null, "The sum is " + sum, "Multiplication of Two Integers", JOptionPane.INFORMATION_MESSAGE );
            }

            if(event.getSource() == Button4)
            {
                String firstNumber =  JOptionPane.showInputDialog( "Enter first integer" );
                String secondNumber = JOptionPane.showInputDialog( "Enter second integer" );

                int number1 = Integer.parseInt( firstNumber ); 
                int number2 = Integer.parseInt( secondNumber );
                int sum = number1 / number2;
                
                JOptionPane.showMessageDialog( null, "The sum is " + sum, "Division of Two Integers", JOptionPane.INFORMATION_MESSAGE );
            }
        }
    }

    public static void main(String[] args) 
    {
        Button project = new Button();
        project.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        project.setSize(375,170);
        project.setVisible(true);
    }
}
