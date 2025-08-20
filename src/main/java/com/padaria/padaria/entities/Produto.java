package com.padaria.padaria.entities;

import java.util.Date;

public class Produto 
{
    
    private String name;
    private String descrition;
    private String type;
    private double price;
    private Date fabricationDate;
    
    public Produto()
    {
        this.name = null;
        this.type = null;
        this.price = 0.0;
        this.fabricationDate = new Date(null);
    }

    public Produto(String name, String descrition,String type, double price, Date fabricationDate) 
    {
        this.name = name;
        this.descrition = descrition;
        this.type = type;
        this.price = price;
        this.fabricationDate = fabricationDate;
    }
    

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getType() 
    {
        return type;
    }

    public void setType(String type) 
    {
        this.type = type;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public Date getFabricationDate() 
    {
        return fabricationDate;
    }

    
    public void setFabricationDate(Date fabricationDate) 
    {
        this.fabricationDate = fabricationDate;
    }
    
    public String getDescrition() 
    {
        return descrition;
    }
    public void setDescrition(String descrition) 
    {
        this.descrition = descrition;
    }
    
    public String toString() 
    {
        return "Pao{" +
                "name='" + name + '\'' +
                ", descrition='" + descrition + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", fabricationDate=" + fabricationDate +
                '}';
    }

    @Override
    public boolean equals(Object other) 
    {

        if (this == other) 
        {
        return true;
        }
        if (other == null || getClass() != other.getClass()) 
        {
        return false;
        }

        Produto prooduto = (Produto) other;

        return this.name.equals(prooduto.name) &&
           this.type.equals(prooduto.type) &&
           this.price == prooduto.price &&
           this.fabricationDate.equals(prooduto.fabricationDate);
        
    }

    @Override
    public int hashCode() 
    {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        long temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (fabricationDate != null ? fabricationDate.hashCode() : 0);
        return result;
    }
    
}

