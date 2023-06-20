package ma.geo.gescolarite.dtos;



public class NoteDto {
    private GradeIdDto gradeId;
    private double grade;
    private String description;

    public NoteDto(GradeIdDto gradeId, double grade, String description) {
        this.gradeId = gradeId;
        this.grade = grade;
        this.description = description;
    }

    public NoteDto() {
    }

    public GradeIdDto getGradeId() {
        return gradeId;
    }

    public void setGradeId(GradeIdDto gradeId) {
        this.gradeId = gradeId;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "NoteDto{" +
                "gradeId=" + gradeId +
                ", grade=" + grade +
                ", description='" + description + '\'' +
                '}';
    }
}
