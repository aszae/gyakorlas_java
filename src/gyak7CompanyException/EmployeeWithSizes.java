package gyak7CompanyException;

import java.time.LocalDate;

public class EmployeeWithSizes extends Employee {
    private int shoeSize;
    private int heightInCm;

    public EmployeeWithSizes(int id, String name, LocalDate birthDate) throws WrongBirthDateException {
        super(id, name, birthDate);
    }

    public EmployeeWithSizes(int id, String name, LocalDate birthDate, String nickName) throws WrongBirthDateException {
        super(id, name, birthDate, nickName);
    }

    public int getShoeSize(){
        return this.shoeSize;
    }

    public void setShoeSize(int shoeSize) throws ShoeSizeException {
        if (shoeSize > 50 || shoeSize < 10)
            throw new ShoeSizeException("Shoe size shuold be between 10 and 50");
        this.shoeSize = shoeSize;
    }

    public int getHeightInCm() {
        return this.heightInCm;
    }

    public void setHeightInCm(int heightInCm) throws HeightException{
        if (heightInCm > 300 || heightInCm < 20)
            throw new HeightException("Height should be between 20 and 300");
        this.heightInCm = heightInCm;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeWithSizes{");
        sb.append("shoeSize=").append(shoeSize);
        sb.append(", heightInCm=").append(heightInCm);
        sb.append('}');
        return sb.toString();
    }
}
