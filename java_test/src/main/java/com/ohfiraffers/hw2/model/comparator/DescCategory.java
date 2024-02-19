package com.ohfiraffers.hw2.model.comparator;

import com.ohfiraffers.test.model.dto.BookDTO;

import java.util.Comparator;

public class DescCategory implements Comparator<BookDTO> {
    int result = 0 ;
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        if (o1.getCategory() < o2.getCategory()){
            result = 1;
        }else if (o1.getCategory() > o2.getCategory()) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

}
