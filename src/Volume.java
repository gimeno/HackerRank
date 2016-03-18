import java.io.IOException;
import java.security.Permission;
import java.util.Scanner;

class Calculate{

    public int getINTVal() {
        Scanner in = new Scanner(System.in);
        int integer =  Integer.parseInt(in.nextLine());
        if (integer <= 0) {
            throw new NumberFormatException("All the values must be positive");
        } else {
            return integer;
        }
    }


    public double getDoubleVal() {
        Scanner in = new Scanner(System.in);
        double integer =  Double.parseDouble(in.nextLine());
        if (integer <= 0) {
            throw new NumberFormatException("All the values must be positive");
        } else {
            return integer;
        }
    }



    public static void main(String[] args) {

    }

    public static double get_Vol() {
        return 0;
    }
}

public class Volume {
    /*
    public static void main(String[] args) {
        Do_Not_Terminate.forbidExit();
        try{
            Calculate cal=new Calculate();
            int T=cal.getINTVal();
            while(T-->0){
                double volume = 0.0d;
                int ch=cal.getINTVal();
                if(ch==1){

                    int a=cal.getINTVal();
                    volume=Calculate.get_Vol().main(a);


                }
                else if(ch==2){

                    int l=cal.getINTVal();
                    int b=cal.getINTVal();
                    int h=cal.getINTVal();
                    volume=Calculate.get_Vol().main(l,b,h);

                }
                else if(ch==3){

                    double r=cal.getDoubleVal();
                    volume=Calculate.get_Vol().main(r);

                }
                else if(ch==4){

                    double r=cal.getDoubleVal();
                    double h=cal.getDoubleVal();
                    volume=Calculate.get_Vol().main(r,h);

                }
                cal.output.display(volume);
            }

        }
        catch (NumberFormatException e) {
            System.out.print(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }


    }
*/

}


/**
 *This class prevents the user from using System.exit(0)
 * from terminating the program abnormally.
 */
class Do_Not_Terminate {

    public static class ExitTrappedException extends SecurityException {
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//end of Do_Not_Terminate