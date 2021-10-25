package mcs_3E.DSA.FinalTermExamPaper.Question6;

public class Store {
    String name,dTitle,uni;
    int year;
    Store next;
    public Store(String name, String dTitle, String uni, int year) {
        this.name= name;this.dTitle=dTitle;
        this.uni=uni;this.year=year;this.next = null;
    }
}