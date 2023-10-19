package SRP;

// Данный класс отвечающий за характеристики работника обособлен от класса выполняющиего расчет заработной платы

public class Employee {
    private String name;
    private String dol;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDol() {
        return dol;
    }

    public void setDol(String dol) {
        this.dol = dol;
    }

    public Employee(String name, String dol) {
        this.name = name;
        this.dol = dol;
    }
}
