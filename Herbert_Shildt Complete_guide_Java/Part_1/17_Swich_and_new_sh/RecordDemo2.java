/** Использование компактного конструктора записи*/
// Объявить запись для сотрудника
//
record Employee(String name, int idNum) {
    //использование компактного канонического конструктора для удаления
    //любых ведущих и завершающих пробелов из строки имени
    public Employee {
        // Удалить любые ведущие и завершающие пробелы
        name = name.trim();
    }
}



class RecordDdemo2 {
    public static void main(String[] args) {
        // СОздать массив записей Employee
        Employee[] empList = new Employee[4];
       
        empList[0] = new Employee("Doe, John", 1047);
        
        empList[1] = new Employee("     Jones, Robert", 1048);
        empList[2] = new Employee("Smith, Rachel    ", 1049);
        empList[3] = new Employee("Martin, Dave    ", 1050);

        for(Employee e: empList)
            System.out.println("Индетификатором сотрудника " + e.name() + " является " + e.idNum());
    }
}
