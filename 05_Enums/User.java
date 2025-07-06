public class User {
    private String name;
    private UserRoleEnum role;

    public User(String name, UserRoleEnum role) {
        this.name = name;
        this.role = role;
    }

    public void printAccessLevel() {
        switch (role) {
            case ADMIN:
                System.out.println(name + " has full access.");
                break;
            case EDITOR:
                System.out.println(name + " can edit content.");
                break;
            case VIEWER:
                System.out.println(name + " can only view content.");
                break;
        }
    }
}
