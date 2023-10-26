package org.lessons.java;

public class Present {

    //ATTRIBUTI
  private String subject;
  private String description;

    //COSTRUTTORI
    public Present(String subject, String description) {
        this.subject = subject;
        this.description = description;
    }


    //METODI

    //GETTER
    public String getDescription() {
        return description;
    }

    public String getSubject() {
        return subject;
    }

    //SETTER
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Present{" +
                "subject = '" + subject + '\'' +
                ", description = " + description +
                '}';
    }
}

