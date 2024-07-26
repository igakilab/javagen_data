class Employee {
    private String name;
    private String joiningDate;
    private String department;
    private String position;

    public Employee(String name, String joiningDate, String department, String position) {
        this.name = name;
        this.joiningDate = joiningDate;
        this.department = department;
        this.position = position;
    }

    // 役職だけを更新するためのコンストラクタ
    public Employee(String name) {
        this(name, null, null, null);
    }

    public String getName() {
        return name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee other = (Employee) obj;
            return this.name.equals(other.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("名前: %s, 入社日: %s, 部署: %s, 役職: %s", name, joiningDate, department, position);
    }
}