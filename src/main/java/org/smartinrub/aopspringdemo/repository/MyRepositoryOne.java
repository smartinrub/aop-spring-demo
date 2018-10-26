package org.smartinrub.aopspringdemo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepositoryOne {
    
    public String getSomething() {
        return "Repo one";
    }
}
