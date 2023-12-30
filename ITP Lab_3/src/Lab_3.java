
public class Lab_3{ //Вариант 9
    public static void main(String[] args){



        HashTable<String, Employee> friendsTable= new HashTable<String, Employee>();

        Employee e1 = new Employee("Chandler", "plumber",20000);
        Employee e2 = new Employee("Joey", "barman",30000);
        Employee e3 = new Employee("Ross", "taxi driver",100000);
        Employee e4 = new Employee("Rachel", "actress",400000);
        Employee e5 = new Employee("Phoebe", "doctor",50000);
        Employee e6 = new Employee("Monica", "teacher",50000);


        friendsTable.put("employee1", e1);

        System.out.println("Пустой? " + friendsTable.isEmpty());
        System.out.println((friendsTable.get("employee1").getName()));

        friendsTable.remove("employee1");

        System.out.println("Пустой? " + friendsTable.isEmpty());
        System.out.println((friendsTable.get("employee1")));

        friendsTable.put("employee1",e1);

        System.out.println((friendsTable.get("employee1").getName()));
    }
}