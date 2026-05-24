package application;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		Post p1 = new Post(
				LocalDateTime.parse("24/05/2026 20:14:30", fmt), 
				"Traveling to New Zeland", 
				"I'm going to visit this wonderful country!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		IO.println(p1);
	}

}
