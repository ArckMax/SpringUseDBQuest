package com.wildcodeschool.quest.crud.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class God {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String spec; 
	
   @Override
    public String toString() {
        return "God [id=" + id + ", name =" + name + 
                "Spec = " + spec + " ]";
    }            
    /* Permet d'afficher les attributs de l'objet lors de l'invocation 
    de sa méthode toString() */
   
   public God() {
	   
   }
   
   public God(String name, String spec) {
	   this.name = name;
	   this.spec = spec;
   }
   
   public Long getId() {
	return id;
   }
   
   public String getName() {
	   return name;
   }
   
   public void setName(String name) {
	   this.name = name;
   }
   
   public String getSpec() {
	   return spec;
   }
   
   public void setSpec(String spec) {
	   this.spec = spec;
   }

}
