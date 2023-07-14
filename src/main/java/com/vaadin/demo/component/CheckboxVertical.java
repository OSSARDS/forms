package com.vaadin.demo.component;

import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.component.checkbox.CheckboxGroupVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("checkbox-vertical")
public class CheckboxVertical extends Div {

    public CheckboxVertical() {
        // tag::snippet[]
        CheckboxGroup<String> checkboxGroup = new CheckboxGroup<>();
        checkboxGroup.setLabel("Languages");
        checkboxGroup.setItems("English", "Greek", "French", "German",
                "Russian", "Spanish", "Other");
        checkboxGroup.addThemeVariants(CheckboxGroupVariant.LUMO_VERTICAL);
        add(checkboxGroup);
        // end::snippet[]
    }

}
