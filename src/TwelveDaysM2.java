public class TwelveDaysM2 {
    String calculate(int n){
        String[] day = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
        String[] prizeList = {"a Partridge in a Pear Tree.", "two Turtle Doves, and ", "three French Hens, ","four Calling Birds, ","five Gold Rings, "
        ,"six Geese-a-Laying, ","seven Swans-a-Swimming, ","eight Maids-a-Milking, ","nine Ladies Dancing, ","ten Lords-a-Leaping, ", "eleven Pipers Piping, ",
                "twelve Drummers Drumming, "};
        String prize = "";
        for(int i=n; i>=1; i--){
            prize+=prizeList[i-1];
        }
        String a = "On the "+day[n-1]+" day of Christmas my true love gave to me: "+prize;
        return a;
    }
    String verse(int verseNumber) {
        TwelveDaysM2 tw = new TwelveDaysM2();
        String result = "";
        result+=tw.calculate(verseNumber)+"\n";
        return result;
    }

    String verses(int startVerse, int endVerse) {
        TwelveDaysM2 tw = new TwelveDaysM2();
        String result = "";
        for(int i=startVerse; i<=endVerse; i++){
            result += tw.calculate(i)+"\n\n";

        }
        result+=tw.calculate(endVerse)+"\n";
        return result;
    }

    String sing() {
        String result = "";
        TwelveDaysM2 tw = new TwelveDaysM2();
        for (int i = 1; i <=11; i++) {
            result += tw.calculate(i) + "\n" + "\n";
        }
        result += tw.calculate(12) + "\n";
        return result;
    }
    public static void main(String[] args) {
        TwelveDaysM2 t =  new TwelveDaysM2();
        System.out.println(t.verse(8));
        System.out.println(t.sing());
    }
}

