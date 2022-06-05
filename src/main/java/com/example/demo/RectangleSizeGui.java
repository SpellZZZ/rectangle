package com.example.demo;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;


@Route
public class RectangleSizeGui extends VerticalLayout {

    private RectangleRepo recRep;
    private TextArea textAreaRezultat;

    private TextArea textAreaSize;
    private Button buttonBig;
    private Button buttonSmall;



    @Autowired
    public RectangleSizeGui(RectangleRepo recRep) {
        this.recRep = recRep;

        textAreaSize = new TextArea("Podaj rozmiar");
        textAreaRezultat = new TextArea("Rezultat");

        buttonBig = new Button( "Duze");
        buttonSmall = new Button( "Male");


        buttonBig.addClickListener(buttonClickEvent -> textAreaRezultat.setValue(recRep.getBigRec(Integer.parseInt(textAreaSize.getValue())).toString()));

        buttonSmall.addClickListener(buttonClickEvent -> textAreaRezultat.setValue(recRep.getSmalRec(Integer.parseInt(textAreaSize.getValue())).toString()));




        add(textAreaSize);
        add(textAreaRezultat);

        add(buttonBig);
        add(buttonSmall);


    }
}
