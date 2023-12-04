/** Использование традиционного оператора switch для установки
 * уровня приоритета*/
class TraditionalSwitch {
    public static void main(String[] args) {
        int priorityLevel;
        int eventCode = 7;

        //Традиционный оператор switch который предоставляет
        //значение ассоциированное с case
        switch(eventCode) {
            case 1, 2, 3:
                priorityLevel = 1;
                break;
            case 4, 5, 6:
                priorityLevel = 2;
                break;
            case 7, 8, 9:
                priorityLevel = 3;
                break;
            default:
                priorityLevel = 0;
        }
    System.out.println("Уровень приоритета для кода события " + eventCode + " равен " + priorityLevel);
    }
}
