package org.smartinrub.aopspringdemo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepositoryTwo implements MyRepository {

    @Override
    public String getSomething() {
        return "Repo two";
    }
}
