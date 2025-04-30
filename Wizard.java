public class Wizard {

    private String name;
    private int level;
    private String specialty;

    public Wizard() {
    }
    public Wizard(String name, int level, String specialty) {
        this.name = name;
        this.level = level;
        this.specialty = specialty;
    }

    //get和set方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    //其他方法
    public void levelUp(){
        this.level = level + 10;
    }
    public String castSpell(){
        return this.name + " casts a powerful " + this.specialty + " spell!";
    }
    public String toString() {
        return "Wizard{name = \"" + name + "\", level = " + level + ", specialty = \"" + specialty + "\"}";
    }
}
