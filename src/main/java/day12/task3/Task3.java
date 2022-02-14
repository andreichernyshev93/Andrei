package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        MusicBand musicBand1 = new MusicBand("Modern Talking", 1984);
        MusicBand musicBand2 = new MusicBand("ABBA", 1972);
        MusicBand musicBand3 = new MusicBand("Мираж", 1986);
        MusicBand musicBand4 = new MusicBand("Руки вверх", 1995);
        MusicBand musicBand5 = new MusicBand("Queen", 1970);
        MusicBand musicBand6 = new MusicBand("Rammstein", 1994);
        MusicBand musicBand7 = new MusicBand("Корни", 2002);
        MusicBand musicBand8 = new MusicBand("Пропаганда", 2001);
        MusicBand musicBand9 = new MusicBand("Краски", 2001);
        MusicBand musicBand10 = new MusicBand("OneRepublic", 2002);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(musicBand1);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);
        musicBands.add(musicBand5);
        musicBands.add(musicBand6);
        musicBands.add(musicBand7);
        musicBands.add(musicBand8);
        musicBands.add(musicBand9);
        musicBands.add(musicBand10);

        System.out.println(musicBands);
        System.out.println();

        Collections.shuffle(musicBands);

        System.out.println(musicBands);
        System.out.println();

        System.out.println(groupsAfter2000(musicBands));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> musicBands1 = new ArrayList<>();
        for (MusicBand band : bands){
            if (band.getYear() > 2000)
                musicBands1.add(band);
        }
        return musicBands1;
    }
}
