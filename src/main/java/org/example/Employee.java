package org.example;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public Employee() {
    }

    public void addHealthPlan(int index, String name) {
        if (healthPlans == null) {
            return;
        }
        if (index < 0 || index >= healthPlans.length) {
            return;
        }
        if (healthPlans[index] == null) {
            healthPlans[index] = name;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    @Override
    public String toString() {
        String plans = "null";
        if (healthPlans != null) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < healthPlans.length; i++) {
                sb.append(healthPlans[i]);
                if (i < healthPlans.length - 1) sb.append(", ");
            }
            sb.append("]");
            plans = sb.toString();
        }

        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + plans +
                '}';
    }
}
