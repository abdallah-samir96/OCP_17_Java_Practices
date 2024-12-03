package sessions.record;

public  record Student(String name, int age) {

    public Student{
        if(name.length() > 10) {
            throw new RuntimeException("The length should not be 10 or greater");
        }
    }
}

