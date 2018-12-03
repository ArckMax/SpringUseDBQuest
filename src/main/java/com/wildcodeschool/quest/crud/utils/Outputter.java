package com.wildcodeschool.quest.crud.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.wildcodeschool.quest.crud.entities.God;
import com.wildcodeschool.quest.crud.repositories.GodDao;

@Component
public class Outputter implements CommandLineRunner {
	
	private Logger LOG = LoggerFactory.getLogger("God");
	
	@Autowired
	private GodDao godDao;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// Create a god 
		LOG.info("ODIN IS HERE ! ");
		God odin = new God("Odin", "King of Norse Gods");
		LOG.info("***************************");
		LOG.info(odin + " has been created ! ");
		godDao.save(odin);
		LOG.info(odin + " has been saved !");
		
		//Read database 
		LOG.info("***************************");
		LOG.info("There's " + godDao.count() + " god(s) in the database !");
		
		//Create another god  
		LOG.info("FREYA IS HERE ! ");
		God freya = new God("Freya", "Goddess of Beauty & War");
		LOG.info("***************************");
		LOG.info(freya + " has been created ! ");
		godDao.save(freya);
		LOG.info(freya + " has been saved !");
		LOG.info("There's " + godDao.count() + " god(s) in the database !");
		
		//Delete Freya just after creation
		
		godDao.delete(freya);
		LOG.info("FREYA IS GONE !");
		
		
		
		
		
		
		
	}

}
