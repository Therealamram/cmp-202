private String name;

    private String password;

    private String matricNo;

    private int staffNo;

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    String getPassword() {
        return password;
    }
    void setPassword(String password) {
        this.password = password;
    }

    Person(){
        System.out.println("Object made");
    }

     Person(String schoolName, String name, String password, String matricNo) {
        this.schoolName = schoolName;
        this.name = name;
        this.password = password;
        this.matricNo = matricNo;
    }

     Person(String schoolName, String name, String password, int staffNo) {
        this.schoolName = schoolName;
        this.name = name;
        this.password = password;
        this.staffNo = staffNo;
    }

}
