package ie.atu;

public class studentInputTemplate {
    private String name;
    private String email;
    private String course;

    public studentInputTemplate() {
        this.name = "John";
        this.email = "g00000000@atu.ie";
        this.course = "Pantry";
    }

    public studentInputTemplate(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public studentInputTemplate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
