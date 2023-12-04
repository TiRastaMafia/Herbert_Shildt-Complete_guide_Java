import java.util.Random;

enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER
}

class Question {
    Random rand = new Random();
    Answers ask() {
        int prob = (int) (100 * rand.nextDouble());
        if(prob < 15)
            return Answers.MAYBE; // 15
        else if(prob < 30)
            return Answers.NO; // 15
        else if(prob < 60)
            return Answers.YES; // 30
        else if(prob < 75)
            return Answers.LATER; // 15
        else if(prob < 98)
            return Answers.SOON; // 13
        else
            return Answers.NEVER;
    }
}

class AskMe {
    static void answer(Answers result) {
        switch(result){
            case NO : System.out.println("НЕТ");
            break;
            case YES : System.out.println("ДА");
            break;
            case MAYBE : System.out.println("ВОЗМОЖНО");
            break;
            case LATER : System.out.println("ПОЗЖЕ");
            break;
            case SOON : System.out.println("СКОРО");
            break;
            case NEVER: System.out.println("НИКОГДА");
            break;
        }
    }
    public static void main(String[] args) {
        Question q = new Question();

        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}

