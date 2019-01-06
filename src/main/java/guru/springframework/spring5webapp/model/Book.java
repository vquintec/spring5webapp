package guru.springframework.spring5webapp.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jt on 5/16/17.
 */
<<<<<<< HEAD
@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
=======

public class Book {

>>>>>>> d692953373abdd8be85c2117321dc94ebcf53b74
    private Long id;
    private String title;
    private String isbn;
    private String publisher;

<<<<<<< HEAD
    @ManyToMany
    @JoinTable(
    		name = "author_book",
    		joinColumns = @JoinColumn(name = "book_id"), 
    		inverseJoinColumns = @JoinColumn(name = "author_id")
    		)
=======
>>>>>>> d692953373abdd8be85c2117321dc94ebcf53b74
    private Set<Author> authors = new HashSet<>();

    public Book() {
    }

    public Book(String title, String isbn, String publisher) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }

    public Book(String title, String isbn, String publisher, Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

<<<<<<< HEAD
	public String getPublisher() {
=======
    public String getPublisher() {
>>>>>>> d692953373abdd8be85c2117321dc94ebcf53b74
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
<<<<<<< HEAD

    @Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", isbn=" + isbn + ", publisher=" + publisher + ", authors="
				+ authors + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
=======
>>>>>>> d692953373abdd8be85c2117321dc94ebcf53b74
}
