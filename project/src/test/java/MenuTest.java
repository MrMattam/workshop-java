import fr.mbo.workshops.core.Menu;
import fr.mbo.workshops.core.Pizza;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MenuTest {


    @Test
    void doit_ajouter_pizza(){

        Menu menu = new Menu();

        menu.add(new Pizza("Marinara", 9.9f));

        assertThat(menu.getPizzas().size()).isEqualTo(1);

    }

    @Test
    void doit_valider_affichage(){

        Menu menu = new Menu();

        menu.add(new Pizza("Marinara", 9.9f));

        assertThat(menu.chargerContenu().size()).isEqualTo(5);

    }

}
