public class Work2 {
    public static void main(String[] args) {
        Work1[] employees = new Work1[5];
        employees[0] = new Work1("Ivanov","ivanov@mail.ru",45);
        employees[1] = new Work1("Ivanov1","ivanov@mail.ru",36);
        employees[2] = new Work1("Ivanov2","ivanov@mail.ru",52);
        employees[3] = new Work1("Ivanov3","ivanov@mail.ru",27);
        employees[4] = new Work1("Ivanov4","ivanov@mail.ru",48);
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40){
                employees[i].printInfo();
            }
        }
    }
}
