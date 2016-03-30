package za.ac.cput.Composite.impl;

import za.ac.cput.Composite.services.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-30
 */
public class Composite implements Component {

    private String name;
    private String surname;
    private int age;

    private List<Component> components = new ArrayList<Component>();

    public Composite() {
    }

    @Override
    public String getName() {
        for (Component component:components){
            return component.getName();
        }
        System.out.println("'Name' not found.\n");
        return null;
    }

    @Override
    public String getSurname() {
        for(Component component: components){
            return component.getSurname();
        }
        System.out.println("'Surname' not found.\n");
        return null;
    }


    @Override
    public int getAge() {
        for(Component component: components){
            return component.getAge();
        }
        System.out.println("'Age' not found.\n");
        return 0;
    }

    public void add(Component component){
        components.add(component);
    }

    public void remove(Component component){
        components.remove(component);
    }

    public List<Component>getComponents(){
        return components;
    }

    public Component getComponent(int index){
        return components.get(index);
    }
}
