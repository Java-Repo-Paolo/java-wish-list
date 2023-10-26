package org.lessons.java;

public class Present {
  private String subject;
  private String description;


    public Present(String subject, String description) {
        this.subject = subject;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getSubject() {
        return subject;
    }
}

