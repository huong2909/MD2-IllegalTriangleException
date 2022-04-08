package com.company;

public class IllegalTriangleException extends Exception {
    private String message;

    public IllegalTriangleException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}


//    public void illegalTriangleException(int a, int b, int c) throws Exception{
//        if ((a + b > c) && (a + c > b) && (b + c  > a)&&
//                (a > 0) && (b > 0) && (c > 0)){
//            System.out.println("Là tam giác");
//        } else throw new Exception();
//    }


