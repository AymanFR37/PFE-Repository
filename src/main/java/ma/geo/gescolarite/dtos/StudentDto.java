package ma.geo.gescolarite.dtos;


import java.time.LocalDate;

public class StudentDto {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private LocalDate dateOfBirth;
    private String sexe;
    private ClasseDto classe;
    private GroupDto groupe;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }



    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public GroupDto getGroupe() {
        return groupe;
    }

    public void setGroupe(GroupDto groupe) {
        this.groupe = groupe;
    }

    public StudentDto() {
    }

    public StudentDto(int id, String firstName, String lastName, String address, LocalDate dateOfBirth, String sexe, ClasseDto classe, GroupDto groupe) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.sexe = sexe;
        this.classe = classe;
        this.groupe = groupe;
    }

    public ClasseDto getClasse() {
        return classe;
    }

    public void setClasse(ClasseDto classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", sexe='" + sexe + '\'' +
                ", classe=" + classe +
                ", groupe=" + groupe +
                '}';
    }
}
