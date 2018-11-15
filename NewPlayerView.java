public static void main(String[] args){

    public class NewPlayerView{

        String Username = new String(args[2]);
            public void SetUsername(String Username);

        String Forename = new String(args[0]);
            public void SetForeame(String Forename);
      
        String Surname = new String(args[1]);
            public void SetSurname(String Surname);

        int ImgIndex = Integer.parseInt(args[3]);
            public void SetImgIndex(int ImgIndex);
  
        boolean IsHuman = Boolean.parseBoolean(args[4]);
            public void setIsHuman(boolean IsHuman){
            this.IsHuman = IsHuman;
            
        Player p1 = new Player(String Username, String Forename, String Surname, int ImgIndex, boolean IsHuman){
            public void setPlayer[];
        }
    
    }
}

