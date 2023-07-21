package com.vaadin.demo.component;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.textfield.TextArea;
//import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;

@Route("text-area-helper")
public class TextAreaPublications extends Div {

    public TextAreaPublications() {
        int charLimit = 2000;

        TextArea textArea = new TextArea();
        textArea.setWidthFull();
        textArea.setLabel("Publications");
        textArea.setPlaceholder("(!) State and list your publications");
        textArea.setMaxLength(charLimit);
        textArea.setClearButtonVisible(true);
        textArea.setPrefixComponent(VaadinIcon.FILE_TEXT.create());
        //textArea.setValueChangeMode(ValueChangeMode.EAGER);
        textArea.addValueChangeListener(e -> {
            e.getSource()
                    .setHelperText(e.getValue().length() + "/" + charLimit);
        });
        
        add(textArea);
    }

}