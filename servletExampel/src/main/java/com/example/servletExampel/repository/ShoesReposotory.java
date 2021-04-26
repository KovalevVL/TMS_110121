package com.example.servletExampel.repository;

import com.example.servletExampel.ShoesEntity;

import java.util.Arrays;
import java.util.List;

public class ShoesReposotory {
    private List<ShoesEntity> getShoes() {
        return Arrays.asList(
                new ShoesEntity("title1", 1100),
                new ShoesEntity("title2", 1200),
                new ShoesEntity("title3", 1300),
                new ShoesEntity("title4", 1400)
        );
    }
}

