package beans;

import java.util.Map;

public class Developer {

    private String name;
    private Map<String, Integer> skillMatrix;

    public Developer(String name, Map<String, Integer> skillMatrix) {
        this.name = name;
        this.skillMatrix = skillMatrix;
    }

    public Map<String, Integer> getSkillMatrix() {
        return skillMatrix;
    }
}
