package com.example.music;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MusicController {

	@Autowired
	public MongoRepo repo;
	
	@GetMapping("/")
	public String homepage(Model model){
		return "homepage";
	}


	@GetMapping("/viewmusic")
	public String viewMusic(Model model) {
		List<Music> music = repo.findAll();
		model.addAttribute("allmusic",music);
		return "viewmusic";
	}
	
	@GetMapping("/addmusic")
	public String addMusic(Model model) {
		model.addAttribute("music",new Music());
		return "addmusic";
	}

	@PostMapping("/addmusic")
	public String submitMusic(@ModelAttribute("music") Music music) {
		repo.save(music);
		return "redirect:viewmusic";
	}

	@GetMapping("/editmusic")
	public String editMusic(Model model) {
		model.addAttribute("music",new Music());


		return "editmusic";
	}
	
		
	
	@PostMapping("/editmusic")
	public String submiteditMusic(@ModelAttribute("music") Music music) {
		System.out.println(music.getArtist2());

		List<Music> musics = repo.getMusicByArtist(music.getArtist());
		for (Music m : musics) {
			m.setArtist(music.getArtist2());
			m.setName(music.getName2());
			m.setGenre(music.getGenre2());
			m.setYearOfRelease(music.getYearOfRelease2());
			repo.save(m);
					
		}
		
		return "redirect:viewmusic";
		
	}
	
	@GetMapping("/deletemusic")
	public String deleteMusic(Model model) {
		model.addAttribute("music",new Music());
		return "deletemusic";
	}
	
	
	@PostMapping("/deletemusic")
	public String editedMusic(@ModelAttribute("music") Music music) {
		System.out.println(music.getArtist());
		List<Music> musics = repo.getMusicByArtist(music.getArtist());
		for (Music m : musics) {
			System.out.println(m.getArtist());
			repo.delete(m);
		}
		return "redirect:viewmusic";
	}
}
