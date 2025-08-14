public class sample{

        int id;
        String name;
        int age;
        String branch;
        long year;

    void setdetails(int id,String name,int age,String branch,long year){
        this.id=id;
        this.name=name;
        this.age=age;
        this.branch=branch;
        this.year=year;
    }
    void getdetails(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("branch:"+branch);
        System.out.println("year:"+year);

    }
    public static void main(String[] args) {
        sample s=new sample();
        s.setdetails(1,"Abishek",20,"AI&DS",2023);
        s.getdetails();
    }
}
