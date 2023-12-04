class IfElse {
    public static void main(String[] args){
        int month = 9;
        String season;
        if(month == 12 || month == 1 || month == 2)
            season = "Зима";
        else if(month == 3 || month == 4 || month == 5)
            season = "Весна";
        else
            season = "Несуществующий месяц";
        System.out.println("Апрель это ___ " + season + ".");

    }    
}
