package uan.edu.co.animalia;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SimpleAnimal Human = new SimpleAnimal("Human");
    	SimpleAnimal Chimpanzee = new SimpleAnimal("Chimpanzee");
    	SimpleAnimal Housecat= new SimpleAnimal("Housecat");
    	SimpleAnimal Lion = new SimpleAnimal("Lion");
    	SimpleAnimal Housefly = new SimpleAnimal("Housefly");
    	
    	//Species
    	CompositeAnimal Sapiens=new CompositeAnimal("Sapiens");
    	Sapiens.addAnimal(Human);
    	
    	CompositeAnimal Troglodytes=new CompositeAnimal("Troglodytes");
    	Troglodytes.addAnimal(Chimpanzee);
    	
    	CompositeAnimal Domestica1=new CompositeAnimal("Domestica1");
    	Domestica1.addAnimal(Housecat);
    	
    	CompositeAnimal Leo=new CompositeAnimal("Leo");
    	Leo.addAnimal(Lion);
    	
    	CompositeAnimal Domestica2=new CompositeAnimal("Domestica2");
    	Domestica2.addAnimal(Housefly);
    	
    	//Genus
    	CompositeAnimal Homo=new CompositeAnimal("Homo");
    	Homo.addAnimal(Sapiens);
    	
    	CompositeAnimal Pan=new CompositeAnimal("Pan");
    	Pan.addAnimal(Troglodytes);
    	
    	CompositeAnimal Felis=new CompositeAnimal("Felis");
    	Felis.addAnimal(Domestica1);
    	Felis.addAnimal(Leo);
    	
    	CompositeAnimal Musca=new CompositeAnimal("Musca");
    	Musca.addAnimal(Domestica2);
    	
    	//Family
    	CompositeAnimal Hominidae=new CompositeAnimal("Hominidae");
    	Hominidae.addAnimal(Homo);
    	
    	CompositeAnimal Pongidae=new CompositeAnimal("Pongidae");
    	Pongidae.addAnimal(Pan);
    	
    	CompositeAnimal Felidae=new CompositeAnimal("Felidae");
    	Felidae.addAnimal(Felis);
    	    	
    	CompositeAnimal Muscidae=new CompositeAnimal("Muscidae");
    	Muscidae.addAnimal(Musca);
    	
    	//Order
    	CompositeAnimal Primate=new CompositeAnimal("Primate");
    	Primate.addAnimal(Hominidae);
    	Primate.addAnimal(Pongidae);
    	
    	CompositeAnimal Carnivora=new CompositeAnimal("Carnivora");
    	Carnivora.addAnimal(Felidae);
    	
    	CompositeAnimal Diptera=new CompositeAnimal("Diptera");
    	Diptera.addAnimal(Muscidae);
    	
    	//Class
    	CompositeAnimal Mammal=new CompositeAnimal("Mammal");
    	Mammal.addAnimal(Primate);
    	Mammal.addAnimal(Carnivora);
    	
    	CompositeAnimal Insect=new CompositeAnimal("Insect");
    	Insect.addAnimal(Diptera);
    	
    	//Phylum
    	CompositeAnimal Chordate=new CompositeAnimal("Chordate");
    	Chordate.addAnimal(Mammal);
    	
    	CompositeAnimal Arthropoda=new CompositeAnimal("Arthropoda");
    	Arthropoda.addAnimal(Insect);
    	
    	//Kingdom
    	CompositeAnimal Animalia=new CompositeAnimal("Animalia");
    	Animalia.addAnimal(Chordate); 
    	Animalia.addAnimal(Arthropoda);
        
    }
}
