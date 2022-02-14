package day12.task4;


import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Райан Теддер");
        members1.add("Зак Филкинс");
        members1.add("Эдди Фишер");
        members1.add("Брент Катцл");
        members1.add("Дрю Браун");

        MusicBand musicBand1 = new MusicBand("OneRepublic", 2002, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Тилль Линдеманн");
        members2.add("Рихард Крусле");
        members2.add("Пауль Ландерс");
        members2.add("Оливер Ридель");
        members2.add("Кристиан Лоренц");
        members2.add("Кристоф Шнайдер");

        MusicBand musicBand2 = new MusicBand("Rammstein", 1994, members2);

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();


    }
}
