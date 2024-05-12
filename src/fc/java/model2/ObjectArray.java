package fc.java.model2;

import java.util.Arrays;

public class BookArray {
    private final int DEFAULT_CAPACITY = 5; //수정불가(final) -> 상수
    private Book[] elements;
    private int size = 0;

    //생성동작
    public BookArray(){
        elements = new Book[DEFAULT_CAPACITY];
    }
    // 저장하는 동작
    public void add(Book element){
        // 크기체크? if
        if(size==elements.length){
            ensureCapacity();
        }
        elements[size++]=element;
    }
    // 데이터 얻는 동작
    public Book get(int index){
        // index 체크? if
        if(index<0|| index<=size){
            throw new IndexOutOfBoundsException("index의 범위(0~9)가 초과됨");
        }
        return elements[index];
    }
    // 원소의 개수를 넘겨주는 동작
    public int size(){
        return size;
    }
    public void ensureCapacity(){
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
