/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paula
 */
public class Preferencias {

    private List<String> proteinasSeleccionadas;
    private String tipoDieta;
    private List<Recetas> recetasSugeridas;

    public Preferencias() {
        this.proteinasSeleccionadas = new ArrayList<>();
        this.tipoDieta = "Omnívoro"; // Valor por defecto
        this.recetasSugeridas = new ArrayList<>();
    }

    public List<String> getProteinasSeleccionadas() {
        return proteinasSeleccionadas;
    }

    public void agregarProteina(String proteina) {
        if (!proteinasSeleccionadas.contains(proteina)) {
            proteinasSeleccionadas.add(proteina);
        }
    }

    public void eliminarProteina(String proteina) {
        proteinasSeleccionadas.remove(proteina);
    }

    public String getTipoDieta() {
        return tipoDieta;
    }

    public void setTipoDieta(String tipoDieta) {
        this.tipoDieta = tipoDieta;
    }

    public List<Recetas> getRecetasSugeridas() {
        return recetasSugeridas;
    }

    public void agregarReceta(Recetas receta) {
        this.recetasSugeridas.add(receta);
    }
}

