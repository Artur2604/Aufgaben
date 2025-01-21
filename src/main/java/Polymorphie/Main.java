package Polymorphie;

public class Main {
    public static void main(String[] args) {
        Tier meinTier;

        meinTier = new Hund();
        meinTier.lautGeben();  // Ausgabe: Der Hund bellt

        meinTier = new Katze();
        meinTier.lautGeben();  // Ausgabe: Die Katze miaut
    }
    static class Tier {
        void lautGeben() {
            System.out.println("Das Tier macht ein Geräusch");
        }
    }

    static class Hund extends Tier {
        void lautGeben() {
            super.lautGeben();
            System.out.println("Der Hund bellt");
        }
    }

    static class Katze extends Tier {
        void lautGeben() {
            super.lautGeben();
            System.out.println("Die Katze miaut");
        }

    }


   
}