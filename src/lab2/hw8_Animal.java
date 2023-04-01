package lab2;

public class hw8_Animal {
    private String name;
    private Integer age;
    private String voice;

    public hw8_Animal(String name, Integer age, String voice) {
        this.name = name;
        this.age = age;
        this.voice = voice;
    }

    public void voicevoice() {
        System.out.println(voice + voice + voice);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
}
