package ExceptionHandling;

public class equal {
    private String name;
    private int rollNo;

    public equal(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        equal other = (equal) obj;
        return this.rollNo == other.rollNo;
    }

    public static void main(String[] args) {
        equal student1 = new equal("Amit Sharma", 101);
       equal student2 = new equal("Amit S.", 101);

        System.out.println("Are students equal? " + student1.equals(student2));
    }
}

