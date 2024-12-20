public class Person {
    private String name;
    private Integer age;
    private Gender gender;

    public Person(String name, Integer age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName (){
        return this.name;
    }

    public Integer getAge (){
        return this.age;
    }

    public Gender getGender (){
        return this.gender;
    }

    @Override
    public String toString(){
        return String.format("Person { name = %s; age = %d; gender = %s }", name, age, gender.getGender());
    }

    enum Gender {
        MAN("Мужчина"),
        WOMAN("Женщина");
        private String gender;

        Gender(String gender){
            this.gender = gender;
        }
        public String getGender(){
            return this.gender;
        }
    }
}
