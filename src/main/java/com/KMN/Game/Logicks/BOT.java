package com.KMN.Game.Logicks;

import com.KMN.Game.Enams.Choices;

import java.util.Random;

public class BOT {





    public static String WhoWin(String playerChoice){
        Random random = new Random();
        String BotChoice = String.valueOf(Choices.SCISSORS);

        int BotRandom = random.nextInt(3) + 1;
        if(BotRandom == 1){
            BotChoice = String.valueOf(Choices.SCISSORS);
        }
         if (BotRandom == 2){
            BotChoice = String.valueOf(Choices.ROCK);
        }
         if (BotRandom == 3){
            BotChoice = String.valueOf(Choices.PAPER);
        }
             if(playerChoice.equals(BotChoice)){
                return "Ничья";
            }
             if(playerChoice.equals(String.valueOf(Choices.ROCK)) & BotChoice.equals(String.valueOf(Choices.SCISSORS)) ||
                    playerChoice.equals(String.valueOf(Choices.SCISSORS)) & BotChoice.equals(String.valueOf(Choices.PAPER)) ||
                    playerChoice.equals(String.valueOf(Choices.PAPER)) & BotChoice.equals(String.valueOf(Choices.ROCK))){
                return "Вы победили";
            }
            else {
                return "BOT победил";
            }


    }


}
