class PBDemo {
    public static void main(String[] args) {
        try{
            String notepad = "notepad.exe";
            String fileName = "new.txt"; 
            ProcessBuilder proc = new ProcessBuilder(notepad, fileName);
            proc.start();
        } catch (Exception e) {
            System.out.println("Ошибка при выполнении notepad");
        }
    }
}
