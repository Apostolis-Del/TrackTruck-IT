public class TruckSpace {

            public String[] TruckSpaceData()  {

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

        public double SpaceAvail(String[] info){
                double spaceavail=0;
                spaceavail=Double.parseDouble(info[13])-Double.parseDouble(info[24]);


                return spaceavail;
        }

        public boolean UnDriver(double space){
                boolean unavailable=false;
                if(space<=0){
                    unavailable=true;
                }
                return unavailable;
        }

}
