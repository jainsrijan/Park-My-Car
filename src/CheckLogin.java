
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CheckLogin  extends UnicastRemoteObject implements  loginInterface
{
    public CheckLogin()throws RemoteException
    {
    }
public boolean check(String Id,String password)throws RemoteException
{
if(Id.equals("abc") && password.equals("abc"))    
    return true;
else
    return false;
}
}
