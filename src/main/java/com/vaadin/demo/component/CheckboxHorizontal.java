package com.vaadin.demo.component;

import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;


@Route("checkbox-horizontal")
public class CheckboxHorizontal extends Div {

    public CheckboxHorizontal() {
        // tag::snippet[]
        CheckboxGroup<String> checkboxGroup = new CheckboxGroup<>();
        checkboxGroup.setLabel("Languages");
        checkboxGroup.setItems("English", "Greek", "French", "German",
                "Russian", "Spanish", "Chinese", "Arabic", "Portuguese", "Other");
        
        add(checkboxGroup);
        // end::snippet[]
    }

}
