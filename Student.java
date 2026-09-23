class Student {
    String name;
    int age;
    int energy;
    String mood;
    Float attendance;

    void skipClass() {
        if (energy < 2) {
            attendance--;
            System.out.println(name + " skipped the class");
        }
    }

    void takeTest() {
        if (attendance > 80.00) {
            System.out.println(name + " is taking the test");
        }
    }

    void sleep() {
        if (mood.equals("bored")) {
            System.out.println(name + " is feeling sleepy");
        }
    }

    void study() {
        energy -= 5;
        System.out.println(name + " is studying");
    }

    public static void main(String args[]) {
        Student s = new Student();

        s.name = "Sruthi";
        s.age = 20;
        s.energy = 1;
        s.mood = "bored";
        s.attendance = 90.0f;

        s.skipClass();
        s.takeTest();
        s.sleep();
        s.study();
    }
}