package org.smartinrub.aopspringdemo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepositoryTwo {
    
        public String getSomething() {
        return "Repo two";
    }
}
