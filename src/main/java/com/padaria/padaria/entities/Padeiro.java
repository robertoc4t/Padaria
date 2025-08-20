package com.padaria.padaria.entities;


public class Padeiro 
{
    private String name;
    private String specialty;
    private int experienceYears;    
    private String Hash;

    
    public Padeiro() 
    {
        this.name = null;
        this.specialty = null;
        this.experienceYears = 0;
    }
    public Padeiro(String name, String specialty, int experienceYears) 
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
        if (!(o instanceof Padeiro)) return false;
        return false;
    }
}
