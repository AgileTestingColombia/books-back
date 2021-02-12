package automation.practice.controllers.dto;

import lombok.Getter;
import lombok.Setter;

public class BookDto {

  public BookDto() {

  }

  public BookDto(String name, String author) {
    this.name = name;
    this.author = author;
  }

  @Getter
  @Setter
  private String name;

  @Getter
  @Setter
  private String author;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
  
  
}
