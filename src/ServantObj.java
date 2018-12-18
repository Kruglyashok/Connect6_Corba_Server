
import ServantApp.MyStruct;
import ServantApp.ServantPOA;
import java.awt.Color;
import java.util.ArrayList;
import org.omg.CORBA.ORB;

public class ServantObj extends ServantPOA {
    private ORB orb;
    int clientCounter = 0;
    int p1GS = 0;
    int p2GS = 0;
    int x_1, y_1, x_2, y_2, lastSent = -1;
    boolean flag = false;
    
    
    @Override
    public int getNumber () { 
    clientCounter++;
    return clientCounter-1;
    }
    @Override
    public void addPoints(int x1, int y1, int x2, int y2, int playerNum) {
        System.out.append("addPOints called\n");
        x_1 = x1;
        y_1 = y1;
        x_2 = x2;
        y_2 = y2;
        lastSent = playerNum;
        flag = true;
    }

    @Override
    public void shutdown() {
        orb.shutdown(false);
    }

    @Override
    public MyStruct getPoints() {
        return new MyStruct(x_1, y_1, x_2, y_2, lastSent);
    }

    void setORB(ORB orb) {
        this.orb = orb;
    }
}
