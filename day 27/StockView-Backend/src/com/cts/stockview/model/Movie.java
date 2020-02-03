package com.cts.stockview.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {
		@javax.persistence.Id
		@GeneratedValue
		private long Id;
		private String name;
		@OneToMany(mappedBy = "movie")
		private Set<Actor> actors;
		public long getId() {
			return Id;
		}
		public void setId(long id) {
			Id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Set<Actor> getActors() {
			return actors;
		}
		public void setActors(Set<Actor> actors) {
			this.actors = actors;
		}
		@Override
		public String toString() {
			return "Movie [name=" + name + "]";
		}
	
		
	
	
}
