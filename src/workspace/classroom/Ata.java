package workspace.classroom;

import workspace.heritage.Document;

public class Ata extends Document {
    private String schedule;
    private String link;

    public Ata(String subject, String schedule, String link) {
        super(subject);
        this.schedule = schedule;
        this.link = link;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
