class Search{
    public static void main(String[] srgs){
        String[] abs = {"6", "8", "3", "7", "5", "6", "1", "4" };
        String val = "8";
        boolean found = false;
        for(String x : abs) {
            if(x== val) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Значение найдено!");
        else System.out.println("!!!!!!!!!!!!!!");
    }
}
