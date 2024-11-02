package kg.salyk.ettn.generator;

import com.github.javafaker.Faker;

public class Fakers {
Faker faker = new Faker();

    public String getName() {
        return faker.name().firstName();
    }

    public String getLastName() {
        return faker.name().lastName();
    }

    public String getFullName() {
        return faker.name().fullName();

    }


    public String getEmail() {
        return faker.internet().emailAddress();
    }



    public static void main(String[] args) {
        Fakers ff = new Fakers();
        System.out.println(ff.getName());
        System.out.println(ff.getFullName()+ ff.getEmail());

    }
}
