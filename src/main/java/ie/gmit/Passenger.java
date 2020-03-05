package ie.gmit;

public class Passenger {
    public String Title;
    public String Name;
    public String ID;
    public String Phone;
    public int Age;

    public Passenger(String title, String name, String ID, String phone, int age) {
       setTitle(title);
       setName(name);
       setID(ID);
       setPhone(phone);
       setAge(age);

    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        String[] titles = {"Mr","Mrs","Ms"};
        boolean ok =false;

        for(int i = 0; i< titles.length;i++){

            if(title.equals(titles[i])==true){

                Title = title;
                ok =true;
                break;
            }
        }
        if(ok==false){
        throw new IllegalArgumentException("Not a good title");}
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if(name.length()<3){
            throw new IllegalArgumentException("The name must be longer than 3 Characters");
        }
        else {
            Name = name;
        }
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        if(ID.length()<10){
            throw new IllegalArgumentException("The ID must be longer than 10 Characters");
        }
        else {
            this.ID = ID;
        }
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        if(phone.length()<10){
            throw new IllegalArgumentException("The phone must be longer than 10 Characters");
        }
        else {
            Phone = phone;
        }
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        if(age<16){
            throw new IllegalArgumentException("Age must be over 16, otherwise they are too young to fly");
        }
        else{
            Age = age;
        }
    }
}
