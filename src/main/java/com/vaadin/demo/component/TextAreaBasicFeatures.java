package com.vaadin.demo.component;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Route;

@Route("text-area-basic-features")
public class TextAreaBasicFeatures extends HorizontalLayout {

    public TextAreaBasicFeatures() {
        setPadding(false);

        // tag::snippet[]
        TextArea field = new TextArea();
        field.setLabel("Other information");
        field.setHelperText("Helper text");
        field.setPlaceholder("Write here..");
        field.setTooltipText("Write something about you");
        field.setClearButtonVisible(true);
        field.setPrefixComponent(VaadinIcon.VAADIN_H.create());
        field.setSuffixComponent(new Span(":)"));
        // end::snippet[]
        field.setWidthFull();
        add(field);
    }

}
