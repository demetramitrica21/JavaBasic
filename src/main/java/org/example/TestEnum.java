package org.example;

enum Animals {
    DOG("WOOF"), CAT("MEAW"), FISH("BURBLE");
    String sound;

    Animals(String s) {
        sound = s;
    }
}

    class TestEnum {
        static Animals a;
        public static void main(String[] args){
            System.out.println(a.DOG.sound + " " + a.FISH.sound);
        }
    }
