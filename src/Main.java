public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();

        boss.setBossHealth(850);
        boss.setBossDamage(900);
        boss.setBossProtection("щит");

        System.out.println(boss.getBossHealth() + " " + boss.getBossDamage() + " " + boss.getBossProtection());

    }
    
}
