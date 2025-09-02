package com.padaria.padaria.DTOs;


public class FuncionarioDTO{

    private String name;
    private String specialty;
    private int experienceYears;


    public FuncionarioDTO(String name, String speciality, int experienceYears )
    {
        this.name =name;
        this.specialty =speciality;
        this.experienceYears = experienceYears;
    }
    
    

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the specialty
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * @param specialty the specialty to set
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * @return int return the experienceYears
     */
    public int getExperienceYears() {
        return experienceYears;
    }

    /**
     * @param experienceYears the experienceYears to set
     */
    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

}