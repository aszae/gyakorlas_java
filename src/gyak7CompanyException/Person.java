package gyak7CompanyException;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDate;
    private String nickName;

    public Person(String name, LocalDate birthDate) throws WrongBirthDateException {
        this.name = name;
        LocalDate now = LocalDate.now();
        LocalDate eighteenBd = now.minusYears(18);
        LocalDate sixtyfiveBd = now.minusYears(65);
        if (birthDate.isAfter(eighteenBd) || birthDate.isBefore(sixtyfiveBd))
            throw new WrongBirthDateException("Age should be between 18 and 65");
        this.birthDate = birthDate;
    }

    public Person(String name, LocalDate birthDate, String nickName) {
        this.name = name;
        this.birthDate = birthDate;
        this.nickName = nickName;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append(", nickName='").append(nickName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
