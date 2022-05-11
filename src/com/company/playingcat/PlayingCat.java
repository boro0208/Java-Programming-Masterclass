package com.company.playingcat;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(!summer){
            if(temperature >= 25 && temperature < 36){
                return true;
            }else{
                return false;
            }
        }else{
            if(temperature >= 25 && temperature < 46){
                return true;
            }else{
                return false;
            }
        }
    }
}
