/** Использование использование неканонического конструктора записи*/
// Объявить запись для сотрудника, в которой явно объявляются
// канонический и неканонический конструкторы

record Employee(String name, int idNum) {
    // Использовать статическое поле в записи
    static int pendingID = -1;
    //Использовать компактный канонический конструктор для удаления
    //любых ведущих и завершающих пробелов из строки имени
    public Employee {
        // Удалить любые ведущие и завершающие пробелы
        name = name.trim();
    }
    // Это неканонический конструктор. Обратите внимание,
    // что для создания записи он передает каноническому консеруктору
    // не идентификационный номер, а pendingID
    public Employee(String name) {
        this(name, pendingID);
    }
}



class RecordDdemo3 {
    public static void main(String[] args) {
        // СОздать массив записей Employee
        Employee[] empList = new Employee[4];
       // Ожидающий идентификационный номер
        empList[0] = new Employee("Doe, John");
        
        empList[1] = new Employee("     Jones, Robert", 1048);
        empList[2] = new Employee("Smith, Rachel    ", 1049);
        empList[3] = new Employee("Martin, Dave    ", 1050);


        for(Employee e: empList) {
            System.out.println("Индетификатором сотрудника " + e.name() + " является " + e.idNum());

        if(e.idNum() == Employee.pendingID)
            System.out.println("Ожидающий");
        else 
            System.out.println(e.idNum());
        }


        empList[0] = new Employee("Doe, John", 1047);


        for(Employee e: empList) 
            System.out.println("Индетификатором сотрудника " + e.name() + " является " + e.idNum());

    }
}
