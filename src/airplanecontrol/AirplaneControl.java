/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airplanecontrol;

import airplanecontrol.DTO.Airplane;
import airplanecontrol.inteface.ControlTowerInterface;
import impl.ControlTower;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author INDRA
 */
public class AirplaneControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Airplane> listAirplane = new ArrayList<>();
        Airplane airplane = new Airplane();
        
        airplane.setId(1);
        airplane.setAction("LAND");
        listAirplane.add(airplane);
        
        airplane = new Airplane();
        airplane.setId(2);
        airplane.setAction("LAND");
        listAirplane.add(airplane);
        
        airplane = new Airplane();
        airplane.setId(3);
        airplane.setAction("TAKE OFF");
        listAirplane.add(airplane);
        
        airplane = new Airplane();
        airplane.setId(4);
        airplane.setAction("LAND");
        listAirplane.add(airplane);
        
        airplane = new Airplane();
        airplane.setId(5);
        airplane.setAction("TAKE OFF");
        listAirplane.add(airplane);
        
        airplane = new Airplane();
        airplane.setId(6);
        airplane.setAction("TAKE OFF");
        listAirplane.add(airplane);
        
        ControlTower towerInterface = new ControlTower();
        
        listAirplane= towerInterface.controlAirplane(listAirplane);
        
    }
    
}
