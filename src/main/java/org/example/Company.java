package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro);
        this.developerNames = developerNames;
    }

    public Company() {
    }

    public void addEmployee(int index, String name) {
        if (developerNames == null) {
            return;
        }
        if (index < 0 || index >= developerNames.length) {
            return;
        }
        if (developerNames[index] == null) {
            developerNames[index] = name;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    @Override
    public String toString() {
        String devs = "null";
        if (developerNames != null) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < developerNames.length; i++) {
                sb.append(developerNames[i]);
                if (i < developerNames.length - 1) sb.append(", ");
            }
            sb.append("]");
            devs = sb.toString();
        }

        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + devs +
                '}';
    }
}
