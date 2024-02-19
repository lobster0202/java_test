package com.ohfiraffers.test.view;

import com.ohfiraffers.test.controller.BookManager;
import com.ohfiraffers.test.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {
    }
    public void menu() {

        System.out.println("========== 메뉴 ==========");
        System.out.println("1. 도서 추가");
        System.out.println("2. 도서 삭제");
        System.out.println("3. 도서 찾기");
        System.out.println("4. 도서 출력");
        System.out.println("5. 모든 도서 출력");
        System.out.println("6. 끝내기");

        System.out.print("메뉴를 입력하세요 : ");
        int num = sc.nextInt();

        label:
        while (true) {
            switch (num) {
                case 1 : bm.addBook(inputBook()); break;
                case 2 : System.out.print("삭제할 도서의 번호를 입력하세요 : ");
                         bm.deleteBook(sc.nextInt()); break;
                case 3 : bm.searchBook(inputBookTitle()); break;
                case 4 : System.out.print("검색 할 도서의 번호를 입력하세요 : ");
                         bm.printBook(sc.nextInt()); break;
                case 5 : bm.displayAll(); break;
                case 6 : System.out.println("프로그램을 종료합니다."); break label;
            }
            System.out.println("잘못 입력하셨습니다.");
        }

    }
    public BookDTO inputBook() {

        System.out.println("도서 번호를 입력하세요 : ");
        int bNo = sc.nextInt();

        System.out.print("분류 코드를 입력하세요 : ");
        int category = sc.nextInt();

        System.out.print("제목을 입력하세요 : ");
        String title = sc.nextLine();

        System.out.print("저자를 입력하세요 : ");
        String author = sc.nextLine();

        BookDTO book = new BookDTO(bNo,category,title,author);

        return book;
    }
    public String inputBookTitle() {

        System.out.print("검색 할 도서 제목을 입력하세요 : ");
        String btitle = sc.nextLine();

        return btitle;
    }



}
