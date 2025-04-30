public class HW3_112403019 {
    public static void main(String[] args) {
        WizardGuild guild = new WizardGuild();

        Wizard Hermione = new Wizard("Hermione", 100, "Time Magic");
        Wizard Harry = new Wizard("Harry Potter", 150, "Fire Magic");
        Wizard Malfoy = new Wizard("Malfoy", 120, "Light Magic");
        Wizard Ron = new Wizard("Ron Weasley", 120, "Dark Magic");
        Wizard Lord = new Wizard("Lord Voldemort", 300, "Light Magic");

        guild.addWizard(Hermione);
        guild.addWizard(Harry);
        guild.addWizard(Malfoy);
        guild.addWizard(Ron);
        guild.addWizard(Lord);

        System.out.println("All Wizards: ");
        guild.listAllWizards();

        System.out.println("\nCasting Guild Spells: ");
        guild.castGuildSpell();

        System.out.println("\nFind Wizard by Name 'Harry Potter':");
        System.out.println(guild.findWizardByName("Harry Potter"));

        System.out.println("\nRemove Wizard by Name 'Malfoy'");
        guild.removeWizardByName("Malfoy");

        System.out.println("\nAll Wizards After Removal: ");
        guild.listAllWizards();

        System.out.println("\nLevel Up Lord Voldemort:");
        Wizard foundWizard = guild.findWizardByName("Lord Voldemort");
        if (foundWizard != null) {
            foundWizard.levelUp();
            System.out.println(foundWizard);
        }
    }
}
