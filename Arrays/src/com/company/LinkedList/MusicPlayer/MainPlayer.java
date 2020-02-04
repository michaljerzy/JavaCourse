package com.company.LinkedList.MusicPlayer;

import java.util.*;

public class MainPlayer {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer" , "Deep purple");
        album.addSong("Stormbringer",4.3);
        album.addSong("Love Don't Mean a Thing" ,4.23);
        album.addSong("Holy Man",4.28);
        album.addSong("Hold On",5.05);
        album.addSong("Lady Double Dealer" ,3.19);
        album.addSong("You Can't Do It Right",3.24);
        album.addSong("High Ball Shooter" ,4.26);
        album.addSong("The Gypsy" ,4.13);
        album.addSong("Soldier of Fortune",3.14);
        albums.add(album);

        album = new Album("The Rip Tide", "Beirut");
        album.addSong("A Candle's Fire", 3.19);
        album.addSong("Santa Fe", 4.14);
        album.addSong("East Harlem", 3.59);
        album.addSong("Goshen", 3.2);
        album.addSong("Payne's Bay", 3.48);
        album.addSong("The Rip Tide", 4.26);
        album.addSong("Vagabond", 3.19);
        album.addSong("The Peacock", 2.26);
        album.addSong("Port of Call", 4.21);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlayList("You Can't Do It Right", playlist);
        albums.get(0).addToPlayList("Holy Man", playlist);
        albums.get(0).addToPlayList("Speed king", playlist); //doesn't exist
        albums.get(0).addToPlayList(9, playlist);
        albums.get(1).addToPlayList(8, playlist);
        albums.get(1).addToPlayList(3, playlist);
        albums.get(1).addToPlayList(2, playlist);
        albums.get(1).addToPlayList(24, playlist);  //There is no track 24

        play(playlist);
    }
    private static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }else {
            System.out.println("Now playing" + listIterator.next().toString());
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else {
                        System.out.println("We have reached the end of the playlist");
                    }
                    break;
                case 3:
                    if(forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                        } else {
                            System.out.println("Where at the strat of the list");
                        }
                    }else {
                            if(listIterator.hasNext()){
                                System.out.println("Now replaying " + listIterator.next().toString());
                            }
                        }
                    break;
                case 4:
                   // printList(playlist);
                    break;
                case 5:
                   // prinMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay song\n"+
                "4 - to list song in playlist\n"+
                "5 - print avaible actions.\n");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=============================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("==============================");
    }
}
