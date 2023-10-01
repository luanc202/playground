package com.learnspring.learnspringframework.exercise;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {
    @Override
    public int[] retrieveData() {
        return new int[] { 1, 2, 3, 4, 5};
    }
}
