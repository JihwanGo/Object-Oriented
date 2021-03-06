package personal.oop.practice2.intf;

/**
 * @author cho_jeong_ha
 * @project oop-practice
 * @update 2019-12-16
 **/
public interface Employer extends Worker {
    void hire(Employee employee);
    void fire(Employee employee);
}
