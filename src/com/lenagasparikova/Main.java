package com.lenagasparikova;

public class Main {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<FootballPlayer> footballTeam = new Team<>("broken");
        FootballPlayer banks = new FootballPlayer("Gordon");
        footballTeam.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());

        System.out.println("======================");
        System.out.println(adelaideCrows.compareTo(fremantle));
        System.out.println(fremantle.compareTo(adelaideCrows));
        System.out.println("======================");

        adelaideCrows.compareTo(fremantle);

    }
}
