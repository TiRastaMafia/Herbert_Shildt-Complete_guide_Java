class Vowels {
    public static void main(String[] args) {
        //Если буква Y должна считаться главной, тогда переменную
        //необходимо установить в true
        boolean yIsVowel = true;

        char ch = 'Y';

        boolean isVowel = switch(ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            case 'y', 'Y' -> {if(yIsVowel) yield true; else yield false; }
            default -> false;
            };
        if(isVowel) System.out.println(ch + " является гласной буквой");
    }
}
