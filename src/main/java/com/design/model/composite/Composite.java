package com.design.model.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: TODO
 *
 * @author : zhaoyan.ye (zhaoyan.ye@ucarinc.com)
 * @since : 2019-07-31 17:02:06
 **/
public class Composite extends Component {

    private List<Component> componentList;

    public Composite(String name, String dept, int salary) {
        super(name, dept, salary);
        componentList = new ArrayList<>();
    }

    public void addSubComponent(Component component){
        component.setParent(this);
        componentList.add(component);
    }

    public List<Component> getComponentList() {
        return componentList;
    }
}
