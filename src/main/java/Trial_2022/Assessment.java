package Trial_2022;

import java.time.LocalDate;

public class Assessment {

    private String modeule_id;
    private String assesesment_name;
    private int total;
    private int mark;
    private double weighting;
    private LocalDate date_written;
    private boolean is_exam;

    public Assessment(String modeule_id, String assesesment_name, int total, int mark, double weighting, LocalDate date_written, boolean is_exam) {
        this.modeule_id = modeule_id;
        this.assesesment_name = assesesment_name;
        this.total = total;
        this.mark = mark;
        this.weighting = weighting;
        this.date_written = date_written;
        this.is_exam = is_exam;
    }

    public String getAssesesmentName(){

        return assesesment_name;
    }

    public int getTotal() {
        return total;
    }

    public int getMark(){

        return mark;
    }

    public double getWeighting(){

        return weighting;
    }

    public LocalDate getDateWritten(){

        return date_written;
    }

    public boolean isExam(){

        return  is_exam;

    }

}
