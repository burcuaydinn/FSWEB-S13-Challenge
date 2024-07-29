package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro < 0 ? 0 : giro; //Setter metodunda da değiştirmem gerek
        //setGiro(giro) da yazabilirdik sadece; ENCAPSOLUTİON
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name){
        if(index<0){
            System.out.println("Index değeri sıfırdan küçük olamaz");
        }
        else{
            try{
                if (developerNames[index] == null){
                    this.developerNames[index] = name;
                }
                else {
                    System.out.println("Girilen index dolu:" + index);
                }
            } catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("Invalid index:" + name);
            }

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
        this.giro = giro < 0 ? 0 : giro;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
}
}