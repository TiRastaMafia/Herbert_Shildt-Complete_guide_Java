/** Использование метода экземпляра в записи*/
// В этой версии записи Employee представляется метод по имени lastName(),
// который возвращает из компонента name только фамилию
// Она также содержит версию компонента конструктора, в которой
// производится проверка общепринятого формата "фамилия, имя"
//

record Employee(String name, int idNum) {
    //Использовать компактный канонический конструктор для удаления
    //любых ведущих и завершающих пробелов в компоненте name. Кроме того,
    //реализуется базовая проверка того, что строка, переданная в параметре name
    //представлена в требуемом формате "фамилия, имя"
    public Employee {
        // Удалить любые ведущие и завершающие пробелы
        name = name.trim();
    
        // Выполнить минимальную проверку того, что name
        // находится в формате "фамилия, имя"
        //
        // Сначала удостоверится, что name содержит только одну запятую
        int i = name.indexOf(','); // искать разделяющую запятую
        int j = name.lastIndexOf(',');
        if(i != j) throw
            new IllegalArgumentException("Обнаруженно несколько запятых!");
        // Затем удостоверится, что до и после запятой имеется
        // хотя бы по одному символу
        if(i < 1 | name.length() == i+1) throw
            new IllegalArgumentException("Требуемый формат: фамилия, имя");
    }

    // Метод экземпляра, который возвращает только фамилию, без имени
    String lastName(){
        return name.substring(0, name.trim().indexOf(','));
    }
    // Метод экземпляра который возвращает только имя, без фамилии
    String Name() {
        return name.substring(name.indexOf(",")+2, name.length());
    }
} 




class RecordDdemo4 {
    public static void main(String[] args) {
        // СОздать массив записей Employee
        Employee[] empList = new Employee[4];
       // Ожидающий идентификационный номер
        empList[0] = new Employee("Doe, John", 1047 );
        empList[1] = new Employee("     Jones, Robert", 1048);
        empList[2] = new Employee("Smith, Rachel    ", 1049);
        empList[3] = new Employee("Martin, Dave    ", 1050);


        for(Employee e: empList) 
            System.out.println("Фамилия и имя сотрудника - " + e.name());

        for(Employee e: empList) 
            System.out.println("Только фамилия " + e.lastName());

        for(Employee e: empList) 
            System.out.println("Только имя " + e.Name());

        }
}
