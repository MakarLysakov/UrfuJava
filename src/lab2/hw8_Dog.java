package lab2;

public class hw8_Dog extends hw8_Animal{
    private String breed;

    public hw8_Dog(String name, Integer age, String voice, String breed) {
        super(name, age, voice);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
