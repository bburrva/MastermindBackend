package com.theironyard.entities;

import javax.persistence.*;
import java.lang.reflect.Array;

@Entity
@Table(name = "MastermindGame") //Name of the table being created in the Database
public class Mastermind {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false) // Keeping track of the rounds of the game
    int round;

    @Column(nullable = false) // What the front end is passing to us as a guess
    Array [] guesses;

    @Column(nullable = false) // What we return (reds,whites,blanks) based on the guess
    Array [] checks;

    public Mastermind() {
    }

    public Mastermind(int round, Array[] guesses, Array[] checks) {
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

    public Array[] getGuesses() {
        return guesses;
    }

    public void setGuesses(Array[] guesses) {
        this.guesses = guesses;
    }

    public Array[] getChecks() {
        return checks;
    }

    public void setChecks(Array[] checks) {
        this.checks = checks;
    }
}
