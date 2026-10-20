package Tasks1_3_HW4;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String number;
    private int age;

    public Employee(String fullName, String position, String email, String number, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.number = number;
        this.age = age;
    }

      public String getfullName(){
            return fullName;
        }
       public void setfullName (String fullName){
            this.fullName = fullName;
        }

        public String getPosition () {
          return position;
        }
        public void setPosiion (String position) {
          this.position = position;
        }

        public String getEmail () {
          return email;
        }
        public void setEmail (String email) {
          this.email = email;
        }
        public String getNumber () {
            return number;
        }
        public void setNumber (String number){
            this.number = number;
        }
        public int getAge () {
          return age;
        }
        public void setAge(int age) {
          this.age = age;
        }

}



