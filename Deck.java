package com.bridgelabzWorkshop3;

public class Deck {
    public static void main(String[] args) {
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[][] cards = new String[4][13];
        public void initializeCards() {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    cards[i][j] = suit[i] + ' ' + rank[j];
                }
            }
            System.out.println("Number of cards in deck");
        }
        public void printCards() {
            for (int i = 0; i < suit.length; i++) {
                for (j = 0; j < ranks.length; j++) {
                    System.out.println(deck[i][j]);
                }
            }
        }
        public static void main(String[] args){
            Deck abc = new Deck();
            abc.initializeCards();
            abc.printCards();
        }
    }
