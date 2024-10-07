package com.devs.appClinica.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class HomeView extends VerticalLayout {

    public HomeView() {
        // Crear la barra de menú
        HorizontalLayout menuBar = createMenuBar();

        // Agregar el contenido principal
        add(menuBar); // Añadir la barra de menú al diseño principal
        add(new H1("Welcome to your new application"));
        add(new Paragraph("This is the home view"));
        add(new Paragraph("Hola"));
    }

    private HorizontalLayout createMenuBar() {
        // Crear ícono para la barra de menú
        Icon menuIcon = VaadinIcon.MENU.create();
        menuIcon.setSize("24px");

        // Crear botones interactivos
        Button homeButton = new Button("Home", VaadinIcon.HOME.create());
        Button aboutButton = new Button("About", VaadinIcon.INFO_CIRCLE.create());
        Button contactButton = new Button("Contact", VaadinIcon.PHONE.create());

        // Crear el contenedor para la barra de menú
        HorizontalLayout menuBar = new HorizontalLayout();

        // Agregar ícono y botones a la barra de menú
        menuBar.add(menuIcon, homeButton, aboutButton, contactButton);

        // Aplicar estilos a la barra de menú
        menuBar.setWidthFull(); // Hacer que la barra ocupe todo el ancho
        menuBar.setPadding(true); // Añadir padding
        menuBar.setSpacing(true); // Espaciado entre componentes
        menuBar.setAlignItems(Alignment.CENTER); // Alinear los elementos verticalmente al centro

        // Estilo personalizado para fondo celeste
        menuBar.getStyle().set("background-color", "#87CEEB"); // Celeste
        menuBar.getStyle().set("padding", "10px"); // Añadir algo de padding

        return menuBar;
    }
}