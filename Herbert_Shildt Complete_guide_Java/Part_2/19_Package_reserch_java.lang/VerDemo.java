/** Демонстрация использования счетчиков выпусков Runtime.Version*/
class VerDemo {
    public static void main(String[] args) {
        Runtime.Version ver = Runtime.version();

        // Отобразить индивидуальные сччетчики
        System.out.println("Счетчик выпусков функциональных средств: " + ver.feature());
        System.out.println("Счетчик промежуточных выпусков : " + ver.update());
        System.out.println("Счетчик выпусков исправлений: " + ver.patch());
    }
}
