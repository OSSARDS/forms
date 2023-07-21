package com.vaadin.demo.component;

import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("date-picker-auto-open")
public class DatePickerBasic extends Div {

    public DatePickerBasic() {
        DatePicker datePicker = new DatePicker("Date of Birth");
        datePicker.setAutoOpen(false);

        add(datePicker);
    }

}