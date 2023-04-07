package P07ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {

    static class Song{
        String typeList;
        String name;
        String time;

       public Song(String typeList, String name, String time){
            this.name=name;
            this.time=time;
            this.typeList=typeList;
        }


//
//        public void setTypeList(String typeList) {
//            this.typeList = typeList;
//        }

        public String getTypeList() {
            return this.typeList;
        }

//        public void setName(String name) {
//            this.name = name;
//        }

        public String getName() {
            return this.name;
        }

//        public void setTime(String time) {
//            this.time = time;
//        }

        public String getTime() {
            return this.time;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfSongs=Integer.parseInt(scanner.nextLine());

        List<Song> songList=new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++) {
            String[] data=scanner.nextLine().split("_");

            String typeList=data[0];
            String name=data[1];
            String time=data[2];

            Song currentSong=new Song(typeList, name, time);
//            currentSong.setName(name);
//            currentSong.setTime(time);
//            currentSong.setTypeList(typeList);

            songList.add(currentSong);
        }
        String lastCommand= scanner.nextLine();
        if (lastCommand.equals("all")){
            for (Song item:songList){
                System.out.println(item.getName());
            }
        }
        else {
            for (Song item:songList){
                if (item.getTypeList().equals(lastCommand)){
                    System.out.println(item.getName());
                }
            }
        }

    }
}
