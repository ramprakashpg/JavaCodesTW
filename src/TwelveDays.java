class TwelveDays {
    String calculate(int n){
        String[] day = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
        String prize = "";
        for(int i=n; i>=1; i--){
            switch(i){
                case 1:
                    prize+="a Partridge in a Pear Tree.";
                    break;
                case 2:
                    prize+="two Turtle Doves, and ";
                    break;
                case 3:
                    prize+="three French Hens, ";
                    break;
                case 4:
                    prize+="four Calling Birds, ";
                    break;
                case 5:
                    prize+="five Gold Rings, ";
                    break;
                case 6:
                    prize+="six Geese-a-Laying, ";
                    break;
                case 7:
                    prize+="seven Swans-a-Swimming, ";
                    break;
                case 8:
                    prize+="eight Maids-a-Milking, ";
                    break;
                case 9:
                    prize+="nine Ladies Dancing, ";
                    break;
                case 10:
                    prize+="ten Lords-a-Leaping, ";
                    break;
                case 11:
                    prize+="eleven Pipers Piping, ";
                    break;
                case 12:
                    prize+="twelve Drummers Drumming, ";
                    break;
            }
        }
        String a = "On the "+day[n-1]+" day of Christmas my true love gave to me: "+prize;
        return a;
    }
    String verse(int verseNumber) {
        TwelveDays tw = new TwelveDays();
        String result = "";
        result+=tw.calculate(verseNumber)+"\n";
        return result;
    }

    String verses(int startVerse, int endVerse) {
        TwelveDays tw = new TwelveDays();
        String result = "";
        for(int i=startVerse; i<endVerse; i++){
            result += tw.calculate(i)+"\n\n";

        }
        result+=tw.calculate(endVerse)+"\n";
        return result;
    }

    String sing() {
        String result = "";
        TwelveDays tw = new TwelveDays();
        for (int i = 1; i < 12; i++) {
            result += tw.calculate(i) + "\n" + "\n";
        }
        result += tw.calculate(12) + "\n";
        return result;
    }
    public static void main(String[] args) {
        TwelveDays t =  new TwelveDays();
        System.out.println(t.verse(8));
        System.out.println(t.sing());
    }
}
