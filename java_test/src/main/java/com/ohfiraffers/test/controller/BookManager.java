package com.ohfiraffers.test.controller;

import com.ohfiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    public ArrayList<BookDTO> bList = new ArrayList<>();

    public  BookManager() {

    }

    public void addBook(BookDTO book) {
        bList.add(book);
    }
    public void deleteBook (int index) {
        bList.remove(index);
    }
    public int searchBook(String btitle) {

        for (int i = 0; i < bList.size(); i++) {
            if (bList.get(i).equals(btitle)) {
                System.out.println(i);

            }else {
                System.out.println("없는 도서 제목입니다.");
            }
        }

        return
    }
    public void printBook(int index) {

        for (int i = 0; i < bList.size(); i++ ) {
            if (bList.get(i).equals(bList.get(index))) {
                System.out.println(bList.get(index));
                 return;
            }
        }

    }
    public void displayAll() {

    }
    public ArrayList<BookDTO> sortedBookList(int select) {



        return blist
    }

    public void prinBookList(ArrayList<BookDTO> br){




    }

}
