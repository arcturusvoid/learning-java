package section6_interfaces;

import java.util.Scanner;

public class loose_coupling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which file to play?");
        String file = sc.nextLine();
        VideoPlayer player = PlayerFactory.getPlayer(file);
        if (player == null){
            System.out.println("File not supported");
        }
        else {
            player.play(file);
        }

    }
}

interface VideoPlayer {
    void play(String file);
}

class MP4Player implements VideoPlayer {
    @Override
    public void play(String file) {
        System.out.println("MP4Player playing " + file);
    }
}

class MOVPlayer implements VideoPlayer {
    @Override
    public void play(String file) {
        System.out.println("MOVPlayer playing " + file);
    }
}

class PlayerFactory {
    public static VideoPlayer getPlayer(String file){
        if(file.endsWith("mp4")){
            return  new MP4Player();
        } else if (file.endsWith("mov")) {
            return new MOVPlayer();
        } else {
            return null;
        }
    }
}


