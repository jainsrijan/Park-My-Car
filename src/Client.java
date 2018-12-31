
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Client 
{
    public static void main(String...arguments) throws Exception
    {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Server name");
   String serverName=sc.next();
   System.out.println("Enter Port No");
   int portNo=sc.nextInt();
   System.out.println("Enter User ID");
   String userName=sc.next();
   System.out.println("Enter Password");
   String password=sc.next();

Registry reg=LocateRegistry.getRegistry(serverName, portNo);
loginInterface li=(loginInterface)reg.lookup("SrijaN");
boolean result=li.check(userName, password);
if(result)
{
    Flashform ref=new Flashform();
    ref.setVisible(true);
    JOptionPane.showMessageDialog(null,"Welcome");
    }
else
{
    JOptionPane.showMessageDialog(null, "invalid id/password");
}
    }    
}
