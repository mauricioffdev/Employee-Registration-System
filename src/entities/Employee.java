package entities;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee(){
        // Construtor padrão (sem argumentos)
    }

    // SUGGESTION: Mudar a ordem para ser consistente: ID, NOME, SALÁRIO
    public Employee(Integer id, String name, Double salary) { // CORRIGIDO
        this.id = id;
        this.name = name; // A ordem estava trocada no seu original
        this.salary = salary; // A ordem estava trocada no seu original
    }

    /* --- Getters e Setters --- */

    // Todos os seus Getters e Setters estão corretos.

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /* --- Método de Negócio --- */

    public void increaseSalary(double percentage){
        // A lógica está perfeita: salary = salary + (salary * percentage / 100)
        salary += salary * percentage / 100.0;
    }

    /* --- Método toString para Exibição --- */

    public String toString() {
        // A formatação está correta, usando Locale.US no main para o separador decimal.
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}