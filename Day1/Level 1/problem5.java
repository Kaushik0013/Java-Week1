class Main {
    public static void main(String[] args) {
        int pen = 14;
        int students = 3;
        int penPerStudent = pen % students;
        int remaining = pen / students;
        System.out.println("The Pen Per Student is :" + penPerStudent + "and the remaining pen not distributed is :" + remaining);


    }
}