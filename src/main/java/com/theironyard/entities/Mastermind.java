package com.theironyard.entities;

import javax.persistence.*;

@Entity
@Table(name = "MastermindGame") //Name of the table being created in the Database
public class Mastermind {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false) // Keeping track of the rounds of the game
    int round;

    @Column(nullable = false) // What the front end is passing to us as a guess
    int [] guesses;

    @Column(nullable = false) // What we return (reds,whites,blanks) based on the guess
    int [] checks;

    public Mastermind() {
    }

    public Mastermind(int round, int[] guesses, int[] checks) {
        this.round = round;
        this.guesses = guesses;
        this.checks = checks;
    }

    public int getId() {
        return id;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int[] getGuesses() {
        return guesses;
    }

    public void setGuesses(int[] guesses) {
        this.guesses = guesses;
    }

    public int[] getChecks() {
        return checks;
    }

    public void setChecks(int[] checks) {
        this.checks = checks;
    }
}