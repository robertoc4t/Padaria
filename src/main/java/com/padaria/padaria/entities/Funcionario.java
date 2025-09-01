package com.padaria.padaria.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 

@Entity
@Table(name = "Funcionarios")
public class Funcionario 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialty;
    private int experienceYears;  
    private String hash;

    
    public Funcionario() 
    {
        this.name = null;
        this.specialty = null;
        this.experienceYears = 0;
    }
    public Funcionario(String name, String specialty, int experienceYears) 
    {
        this.name = name;
        this.specialty = specialty;
        this.experienceYears = experienceYears;
    }  
    

    public String getName() 
    {
        return name;
    }


    public void setName(String name) 
    {
        this.name = name;
    }

    public String getSpecialty() 
    {
        return specialty;
    }

    public void setSpecialty(String specialty) 
    {
        this.specialty = specialty;
    }
    
    public int getExperienceYears() 
    {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) 
    {
        this.experienceYears = experienceYears;
    }


    @Override
    public String toString() 
    {
        return "Padeiro{" +
                "name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", experienceYears=" + experienceYears +
                '}';
    }

    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        return false;
    }
}
