package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Райан Теддер", 42));
        members1.add(new MusicArtist("Зак Филкинс", 43));
        members1.add(new MusicArtist("Эдди Фишер", 48));
        members1.add(new MusicArtist("Брент Катцл", 36));
        members1.add(new MusicArtist("Дрю Браун", 43));

        MusicBand musicBand1 = new MusicBand("OneRepublic", 2002, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Тилль Линдеманн", 59));
        members2.add(new MusicArtist("Рихард Крусле", 54));
        members2.add(new MusicArtist("Пауль Ландерс", 57));
        members2.add(new MusicArtist("Оливер Ридель", 50));
        members2.add(new MusicArtist("Кристиан Лоренц", 55));
        members2.add(new MusicArtist("Кристоф Шнайдер", 55));

        MusicBand musicBand2 = new MusicBand("Rammstein", 1994, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();

    }
}
