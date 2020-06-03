package com;

import sample.Client;

import java.sql.Driver;
import java.sql.SQLException;

public class CostSubsystem {

    //for recognizing who calls the CostSubSystem

    public void ReqToCostSub(int i){
            if(i==1){
                System.out.println("We have a request from Client");
                }
            else if(i==2){
                System.out.println("We have a request from Driver");
            }

    }

    //method for retrieving data from database, its on comment and we return fake data

    public String[] RetrieveUsDrData(Driver1 driver, Client1 client) throws ClassNotFoundException, SQLException{


         /*   Class.forName("com.mysql.jdbc.Driver34");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/task4DB?"
                    + "user=root&password=123");
            PreparedStatement st = con.prepareStatement("select driver from database");
            PreparedStatement st1 = con.prepareStatement("select client from database");

            ResultSet r1=st.executeQuery();

            if(r1.next()) {
                String Drivername= r1.getString("Name");
                String TruckModel=r1.getString("TruckModel") ;
                String Start = r1.getString("Start");
                Point startx,starty= r1.getString("Startx,Starty");
                String Destination=r1.getString("Destination");
                Point destx,desty= r1.getString("destx,desty");
                String date=r1.getString("Date");
                String consumption = r1.getString("Consumption");
                String type = r1.getString("Type");
                String DriverDayPay= r1.getString("DayPay");
                String compornot=r1.getString("CompoOrNot");
                String DriverSpace=r1.getString("DriverSpace");
            }

        ResultSet r2=st1.executeQuery();

        if(r2.next()) {
            String Client= r1.getString("Name");
            String Address=r1.getString("Address") ;
            String Start = r1.getString("Start");
            Point startx,starty= r1.getString("Startx,Starty");
            String Destination=r1.getString("Destination");
            Point destx1,dest1y= r1.getString("Destx1,Desty1");
            String date=r1.getString("Date");
            String ClientSpace=r1.getString("ClientSpace");

        }
    */

        String[] info = new String[26];
        info[0] = "Thomas Mpatsikostas";
        info[1] = "Scania 5832 Supercharged";
        info[2] = "Giannena";
        info[3] = "Trikala";
        info[4] = "23/4/2020";
        info[5] = "39.665029";
        info[6] = "20.853747";
        info[7] = "21.76788";
        info[8] = "39.55609";
        info[9] = "Fridge";
        info[10] = "30";
        info[11] = "50";
        info[12] = "Guest";
        info[13] = "14";

        info[14] = "Nikos Koukos";
        info[15] = "Olympou 15 ,Xalandri";
        info[16] = "Giannena";
        info[17] = "23/4/2020";
        info[18] = "39.665029";
        info[19] = "20.853747";
        info[20] = "Trikala";
        info[21] = "39.55609";
        info[22] = "21.76788";
        info[23] = "23/4/2020";
        info[24] = "8";

            return info;

    }

    //method for calculating the FinalCost

    public double CostProcessing(String info[]){

        int typetax;
        int drivertax;

        double lat1=Double.parseDouble(info[18]);
        double long1=Double.parseDouble(info[19]);
        double lat2=Double.parseDouble(info[21]);
        double long2=Double.parseDouble(info[22]);
        double radius = 6372.795;

        double distance = Math.acos(Math.sin(lat1)*Math.sin(lat2) +
                Math.cos(lat1)*Math.cos(lat2) *
                        Math.cos(long2-long1)) * radius;

        if(info[12]=="Company"){
            drivertax=0;
        }else{
            drivertax=50;
        }
        if(info[9]=="Fridge"){
            typetax=100;
        }else{
            typetax=0;
        }

        double FinalCost;
        FinalCost = (distance * Double.parseDouble(info[11])*1.4/100)*35/100 +typetax +Double.parseDouble(info[13])+drivertax; //35% is for ΦΠΑ and company's profit

        return FinalCost;
    }
}
