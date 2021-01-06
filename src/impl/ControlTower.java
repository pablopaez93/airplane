/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import airplanecontrol.DTO.Airplane;
import airplanecontrol.inteface.ControlTowerInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author INDRA
 */
public class ControlTower implements ControlTowerInterface{

    @Override
    public List<Airplane> controlAirplane(List<Airplane> listAirplane) {
        
        List<Airplane> ListAirplaneLand = listAirplane.stream().filter(airplane -> airplane.getAction().equals("LAND")).collect(Collectors.toList());
        List<Airplane> ListAirplaneTakeOff = listAirplane.stream().filter(airplane -> airplane.getAction().equals("TAKE OFF")).collect(Collectors.toList());
        
        List<Airplane> ListAirplaneResult = new ArrayList<>();
        
        ListAirplaneResult.addAll(this.RunwayLand(ListAirplaneLand));
        ListAirplaneResult.addAll(this.RunwayTakeOff(ListAirplaneTakeOff));
        
        return ListAirplaneResult;
    }
    
    private List<Airplane> RunwayLand(List<Airplane> listAirplane){
        for(Airplane airplane: listAirplane){
            airplane.setResult("LANDED");
            System.out.println("RunwayLand "+airplane.getId()+ " Result "+ airplane.getResult());
        }
        return listAirplane;
    }
    
    private List<Airplane> RunwayTakeOff(List<Airplane> listAirplane){
        for(Airplane airplane: listAirplane){
            airplane.setResult("FLAYING");
            System.out.println("RunwayTakeOff "+airplane.getId()+ " Result "+ airplane.getResult());
        }
        return listAirplane;
    }
    
}
