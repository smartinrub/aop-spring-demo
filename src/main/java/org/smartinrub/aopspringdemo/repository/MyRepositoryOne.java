package org.smartinrub.aopspringdemo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepositoryOne implements MyRepository {

    @Override
    public String getSomething(int id) {
        return "Repo one with id: " + id;
    }
}
