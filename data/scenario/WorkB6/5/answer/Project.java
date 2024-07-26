import java.util.ArrayList;

public class Project {
    private String name;
    private String startDate;
    private String endDate;
    private ArrayList<String> members;

    public Project(String name, String startDate, String endDate, ArrayList<String> members) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public boolean hasMember(String member) {
        return members.contains(member);
    }

    public int getDuration() {
        // Assuming date format is "yyyyMMdd" and just calculating the difference in days
        int start = Integer.parseInt(startDate);
        int end = Integer.parseInt(endDate);
        return end - start;
    }

    @Override
    public String toString() {
        return "Project: " + name + ", Start Date: " + startDate + ", End Date: " + endDate + ", Members: " + members;
    }
}