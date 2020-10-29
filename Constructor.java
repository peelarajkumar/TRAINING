/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

/**
 *
 * @author Welcome
 */
public class Constructor
{
public static void main(String[] args)
{
    Country India = new Country("INDIA",1500000000,"ASIA","NEW DELHI",29,"HINDI",77.7f,46.2f);
    India.map();
    Country Germany=new Country("GERMANY",4000000,"EUROPE","BERLIN",20,"GERMAN ENGLISH",79.9f,68.2f);
    Germany.map();
}

}
class Country
{
 String name;
 double population ;
 String continent;
 String capital;
 int no_of_states;
 String language;
 float literacy_rate;
 float employment_rate;


Country(String name,double population,String continent,String capital , int no_of_states,String language,float literacy_rate, float employment_rate)
{
this.name=name;
this.capital=capital;
this.continent=continent;
this.employment_rate=employment_rate;
this.language=language;
this.literacy_rate=literacy_rate;
this.no_of_states=no_of_states;
this.population=population;

}
void map()
{
    System.out.println("------COUNTRY DETAILS --------");
    System.out.println("NAME OF THE COUNTRY :"+name);
    System.out.println("CAPITAL :"+capital);
    System.out.println("CONTINENT :"+continent);
    System.out.println("EMPLOYEMENT RATE "+employment_rate);
    System.out.println(" NATIONAL LANGUAGE :"+language);
    System.out.println("LITERACY RATE :"+literacy_rate);
    System.out.println("TOTAL STATES :"+no_of_states);
    System.out.println("POPULATION :"+population);
    
}
}

 
