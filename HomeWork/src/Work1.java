public class Work1  {
    private String fio;
    private int age;
    private String email;

    // Нажимаем Alt + insert и создаем конструктор


    public int getAge() {  //Создали "геттер" для "age"
        return age;
    }

    public Work1 (String fio, String email, int age) {
        this.fio = fio;
        this.email = email;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("fio "+fio+"email"+email+"age "+age);
    }
}

