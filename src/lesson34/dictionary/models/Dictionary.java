package lesson34.dictionary.models;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
  private String tarjima;
  private List<String> sinonim = new ArrayList<>();

  public Dictionary(String tarjima) {
    this.tarjima = tarjima;
  }

  public Dictionary() {
  }

  public String getTarjima() {
    return tarjima;
  }

  public void setTarjima(String tarjima) {
    this.tarjima = tarjima;
  }

  public List<String> getSinonim() {
    return sinonim;
  }

  public void setSinonim(List<String> sinonim) {
    this.sinonim = sinonim;
  }

  @Override
  public String toString() {
    return "Dictionary{" +
            "tarjima='" + tarjima + '\'' +
            ", sinonim=" + sinonim +
            '}';
  }
}
