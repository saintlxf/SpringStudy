package pri.sia.config.beans;


import org.springframework.stereotype.Component;

@Component("aaa")
public class Boy {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
