package interfacesmultiplesapp;

import atletas.TriAtleta;

public class InterfacesMultiplesApp {

        public static void main(String[] args) {
            TriAtleta javierNoya = new TriAtleta("Javier Gomez Noya");
            TriAtleta janFrodeno = new TriAtleta("Jan Frodeno");
            TriAtleta enekoLlanos = new TriAtleta("Eneko Llanos");
            System.out.println(javierNoya.getNombre() + " " + javierNoya.correr());
            System.out.println(javierNoya.getNombre() + " " + javierNoya.nadar());
            System.out.println(janFrodeno.getNombre() + " " + janFrodeno.haceBici());
            System.out.println(janFrodeno.getNombre() + " " + janFrodeno.nadar());
            System.out.println(enekoLlanos.getNombre() + " " + enekoLlanos.correr());
            System.out.println(enekoLlanos.getNombre() + " " + enekoLlanos.correr());
                        
           javierNoya.inscribirse("Ironman France");
           janFrodeno.inscribirse("Ironman France");
           enekoLlanos.inscribirse("Ironman France");
    }
      
}
