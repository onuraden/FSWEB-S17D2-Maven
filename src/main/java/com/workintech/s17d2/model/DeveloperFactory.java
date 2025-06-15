package com.workintech.s17d2.model;

import com.workintech.s17d2.tax.Taxable;

public class DeveloperFactory {

    public static Developer createDeveloper(Developer developer, Taxable taxable) {
        Developer createdDeveloper = null;

        if(developer.getExperience().equals(Experience.JUNIOR)){
            createdDeveloper = new JuniorDeveloper(developer.getId(), developer.getName(), developer.getSalary()*(1-taxable.getSimpleTaxRate()/100));
        }
        else if(developer.getExperience().equals(Experience.MID)){
            createdDeveloper = new MidDeveloper(developer.getId(), developer.getName(), developer.getSalary()*(1-taxable.getMiddleTaxRate()/100));
        }
        else if(developer.getExperience().equals(Experience.SENIOR)){
            createdDeveloper = new SeniorDeveloper(developer.getId(), developer.getName(), developer.getSalary()*(1-taxable.getUpperTaxRate()/100));
        }
        else {
            System.out.println("Unknown Experience");
            return null;
        }
        return createdDeveloper;
    }
}
