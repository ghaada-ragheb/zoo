class Animal {

    String family;
    String name;
    int age;
    boolean isMammal;

    Animal() {
    }

    // Instruction 6
    Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Instruction 9
    public String toString() {
        return "Animal{family='" + family + "', name='" + name + "', age=" + age
                + ", isMammal=" + isMammal + "}";
    }
}
