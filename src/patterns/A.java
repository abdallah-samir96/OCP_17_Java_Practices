package patterns;

import java.time.LocalDateTime;

public class A  implements Cloneable{
    class Test{
        public int x;
        public int y;

        public Test(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Test{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public Test test = new Test(1,2);
    private String name;
    private LocalDateTime dateTime;

    private int clazz;

    StringBuilder stringBuilder;

    public StringBuilder getStringBuilder() {
        return stringBuilder;
    }

    public void setStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public A(String name, LocalDateTime dateTime, int clazz, StringBuilder stringBuilder) {
        this.name = name;
        this.dateTime = dateTime;
        this.clazz = clazz;
        this.stringBuilder = stringBuilder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getClazz() {
        return clazz;
    }

    public void setClazz(int clazz) {
        this.clazz = clazz;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "A{" +
                "test=" + test +
                ", name='" + name + '\'' +
                ", dateTime=" + dateTime +
                ", clazz=" + clazz +
                ", stringBuilder=" + stringBuilder +
                '}';
    }
}
