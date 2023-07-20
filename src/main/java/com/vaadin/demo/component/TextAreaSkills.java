package com.vaadin.demo.component;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.textfield.TextArea;
//import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;


@Route("text-area-helper")
public class TextAreaSkills extends Div {

    public TextAreaSkills() {
        int charLimit = 600;

        TextArea textArea = new TextArea();
        textArea.setWidthFull();
        textArea.setLabel("Skills");
        textArea.setPlaceholder("(!) Seperate your skills with a comma; i.e. 'organization skills, creativity, analytical skills'. It will make the data collection process much easier, thank you.");
        textArea.setMaxLength(charLimit);
        textArea.setClearButtonVisible(true);
        textArea.setPrefixComponent(VaadinIcon.COMMENTS.create());
        //textArea.setValueChangeMode(ValueChangeMode.EAGER);
        textArea.addValueChangeListener(e -> {
            e.getSource()
                    .setHelperText(e.getValue().length() + "/" + charLimit);
        });
        
        add(textArea);
    }

}