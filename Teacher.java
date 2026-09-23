class Teacher {
    String object;
    String name;
    int patiencelevel;

    void givingAssessment() {
        System.out.println(name + " is giving an assignment");
    }

    void teachingSkills() {
        System.out.println(name + " is teaching skills to Students");
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();

        t.object = "Book";
        t.name = "Sruthi";
        t.patiencelevel = 8;

        System.out.println("Object: " + t.object);
        System.out.println("Name: " + t.name);
        System.out.println("Patience Level: " + t.patiencelevel);

        t.givingAssessment();
        t.teachingSkills();
    }
}