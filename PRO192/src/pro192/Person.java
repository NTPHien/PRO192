package pro192;

public abstract class Person {
        //Thuoc tinh
        protected String name;
        protected String email;
        protected String birthYear;
        protected String gender;
        protected String phoneNumber;
        protected String address;
        //Phuong thuc
        //Ham khoi tao khong doi so
        public Person(String name, String email, String birthYear, String gender, String phoneNumber, String address){
            this.name = name;
            this.email = email;
            this.birthYear = birthYear;
            this.gender = gender;
            this.phoneNumber = phoneNumber;
            this.address = address;  
        }
      
        //Cac ham getter va setter cho cac thuoc tinh
        public String getName(){
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email = email;
        }
        public String getBirthYear(){
            return birthYear;
        }
        public void setBirthYear(String birthYear){
            this.birthYear = birthYear;
        }
        public String getGender(){
            return gender;
        }
        public void setGender(String gender){
            this.gender = gender;
        }
        public String getPhoneNumber(){
            return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
        }
        public String Address(){
            return address;
        }
        public void setAddress(String address){
            this.address = address;
        }
        //Ham hien thi thong tin
        public abstract void display();      
}
