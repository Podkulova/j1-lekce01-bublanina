package cz.czechitas.recept;

import cz.czechitas.recept.naradi.ElektrickaTrouba;
import cz.czechitas.recept.naradi.Miska;
import cz.czechitas.recept.naradi.Mixer;
import cz.czechitas.recept.naradi.PlechNaPeceni;
import cz.czechitas.recept.naradi.Vaha;
import cz.czechitas.recept.suroviny.Cukr;
import cz.czechitas.recept.suroviny.Maslo;
import cz.czechitas.recept.suroviny.Mouka;
import cz.czechitas.recept.suroviny.Ovoce;
import cz.czechitas.recept.suroviny.PrasekDoPeciva;
import cz.czechitas.recept.suroviny.Vajicka;

public class SpousteciTrida {

  public static void main(String[] args) {
    Miska cervenaMiska;
    Miska zlutaMiska;
    Mixer mixer;
    Vaha kuchynskaVaha;
    PlechNaPeceni plech;
    ElektrickaTrouba trouba;
    Vajicka vajicka;

    Ovoce ovoce;
    Maslo maslo125g;
    Mouka pytlikMouky;
    Cukr pytlikCukru;
    PrasekDoPeciva prasekDoPeciva;

    cervenaMiska = new Miska("cervenaMiska");
    zlutaMiska = new Miska("zlutaMiska");
    mixer = new Mixer("mixer");
    kuchynskaVaha = new Vaha("vaha");
    plech = new PlechNaPeceni("plech");
    trouba = new ElektrickaTrouba("trouba");

    vajicka = new Vajicka("vajicka");
    ovoce = new Ovoce("ovoce");
    maslo125g = new Maslo("maslo125g");
    pytlikMouky = new Mouka("pytlikMouky");
    pytlikCukru = new Cukr("pytlikCukru");
    prasekDoPeciva = new PrasekDoPeciva("prasekDoPeciva");

    //---------------------------------------------------------------------

    // TODO: Sem napiste recept na bublaninu
    // Pouzivejte napovidani v editoru.
    // Vyskakuje samo nebo pomoci Ctrl+Mezernik



                          //////////////////// Postup //////////////////////

                        /* ------> 4 vajíčka (máme plato 10 vajíček) <------ */
    /* ------> Miska si 4x vloží vajíčko <------ */
    for(int i = 0; i < 4; i++) {
      cervenaMiska.nalozSiJedenKus(vajicka);
    }
                       /* ------> 1. Smíchej vajíčko a cukr <------ */
    /* ------> Miska si přidá cukr <------ */
    cervenaMiska.nalozSiCelyObsah(pytlikCukru);
    /* ------> Mixér to zamíchá <------ */
    mixer.zamichej(cervenaMiska);

                    /* ------> 2. Přidejte máslo a dobře zamíchejte <------ */
   /* ------> Miska si přidá máslo, Mixér to znovu zamíchá <------ */
    cervenaMiska.nalozSiCelyObsah(maslo125g);
    mixer.zamichej(cervenaMiska);

                  /* ------> 3. Přisypte 250 g mouky (pozor, pytlík mouky má 1 kg) <------ */

    /* ------> Druhá miska si odváží 250g mouky <------ */
    kuchynskaVaha.vynulujSeS(zlutaMiska);

    while (kuchynskaVaha.zjistiHmotnost(zlutaMiska) != 250) {
      if (kuchynskaVaha.zjistiHmotnost(zlutaMiska) > 250) {
        zlutaMiska.vylozSiTrochu();
      } else {
        zlutaMiska.nalozSiTrochu(pytlikMouky);
      }
    }
     /* ------> První miska si mouku přebere <------ */
    cervenaMiska.nalozSiObsahJineMisky(zlutaMiska);

                       /* ------> 4. Nakonec do těsta přidejte prášek do pečiva <------ */

    /* ------>  První miska si vezme prášek do pečiva, Mixér to zamíchá <------ */
    cervenaMiska.nalozSiCelyObsah(prasekDoPeciva);
    mixer.zamichej(cervenaMiska);

                      /* ------> 5. Před vložením do trouby posypte kousky ovoce <------ */

    /* ------>  Plech si přebere těsto z misky <------ */
    plech.preberSiObsah(cervenaMiska);

    /* ------>  Plech se 50x opakovaně posype kousky ovoce <------ */
    for (int i = 0; i < 50; i = i + 1) {
      plech.posypSeKusem(ovoce);
    }

                     /* ------> 6. Vložte do předehřáté trouby a pečte 25 minut na 180 stupňů <------ */

    /* ------> Trouba se zapne a třeba 5 minut bude péct naprázdno <------ */
    trouba.zapniSe(180);
    trouba.nechejPect(5);
    /* ------>  Trouba si vloží plech <------ */
    trouba.vlozSiDovnitr(plech);
    /* ------> Trouba ho bude péct 25 minut  <------ */
    trouba.nechejPect(25);
    /* ------> Trouba se zastaví  <------ */
    trouba.vypniSe();
    /* ------> Trouba vyndá obsah ven a je hotovo  <------ */
    trouba.vyndejObsahVen();















  }

}
