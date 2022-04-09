package com.example.music;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface MongoRepo extends MongoRepository <Music,String>{
	public List<Music> findAll();

	@Query("{artist : ?0}")                                       
        List<Music> getMusicByArtist(String artist);
	
}
