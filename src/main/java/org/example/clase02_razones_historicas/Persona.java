package org.example.clase02_razones_historicas;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Persona {
  private String nombre;
  private String apellido;

  @Override
  public String toString() {
    return "(" + nombre + ", " + apellido + ")";
  }
}
