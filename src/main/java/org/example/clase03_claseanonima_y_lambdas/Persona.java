package org.example.clase03_claseanonima_y_lambdas;
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
