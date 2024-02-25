public class Main {
    public static void main(String[] args) {
        System.out.println("====== Account =======");
        Account account1 = new Account();
        Account accoutn2 = new Account();

        account1.setId("1");
        account1.setName("Ahmed");
        account1.setBalance(1000);

        System.out.println("ID: "+account1.getId()+"\nName: "+account1.getName()+"\nBalance: "+ account1.getBalance());



        int credit = account1.credit(1000);
        System.out.println("Credit have: "+credit);

        System.out.println("After Debit:" + account1.debit(15));

        System.out.println("Account2 Received: "+account1.transferTo(500, accoutn2));


        System.out.println("====== Employee =======");
        Employee employee = new Employee();


        employee.setId("1");
        employee.setName("Waleed");
        employee.setSalary(15000);
        System.out.println("id: "+employee.getId() + "\nname:"+employee.getName()+"\nSalary: "+employee.getSalary());

        System.out.println("the bouns: "+ employee.raisedSalary(5));

        System.out.println("Salary in year: "+employee.getAnnualSalary());

        System.out.println(employee.toString());

    }
}
