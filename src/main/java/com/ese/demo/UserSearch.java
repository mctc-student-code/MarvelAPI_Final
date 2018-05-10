package com.ese.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// class for holding the user entered search
@Entity
public class UserSearch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String searchTerm;


    public UserSearch(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public UserSearch(){}



    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }
}
