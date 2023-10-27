import org.example.palyabeolvaso;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class palyabeolvasoTest {

    @Test
    public void tesztPalyaBeolvasasa() {
        // Ellenőrizzük a pályabeolvasó osztály palya beolvasásának helyességét
       palyabeolvaso palya = new palyabeolvaso("src/main/resources/wumpuszinput.txt");
        char[][] elvartPalya = {
                {'W', 'W', 'W', 'W', 'W'},
                {'W', '.', '.', 'P', 'W'},
                {'W', '.', 'W', '.', 'W'},
                {'W', '.', '.', '.', 'W'},
                {'W', 'W', 'W', 'W', 'W'}
        };
        char[][] aktualisPalya = palya.getPalya();

        assertEquals(elvartPalya.length, aktualisPalya.length);
        for (int i = 0; i < elvartPalya.length; i++) {
            for (int j = 0; j < elvartPalya[i].length; j++) {
                assertEquals(elvartPalya[i][j], aktualisPalya[i][j]);
            }
        }
    }

    @Test
    public void tesztKezdopontBeolvasasa() {
        // Ellenőrizzük a pályabeolvaso osztály kezdőpont beolvasásának helyességét
        palyabeolvaso palya = new palyabeolvaso("src/main/resources/wumpuszinput.txt");
        String[] elvartKezdopont = {"B", "5"};
        String[] aktualisKezdopont = palya.getKezdopont();

        assertEquals(elvartKezdopont.length, aktualisKezdopont.length);
        for (int i = 0; i < elvartKezdopont.length; i++) {
            assertEquals(elvartKezdopont[i], aktualisKezdopont[i]);
        }
    }

    @Test
    public void tesztIranyBeolvasasa() {
        // Ellenőrizzük a pályabeolvaso osztály irany beolvasásának helyességét
        palyabeolvaso palya = new palyabeolvaso("src/main/resources/wumpuszinput.txt");
        char elvartIrany = 'E';
        char aktualisIrany = palya.getIrany();

        assertEquals(elvartIrany, aktualisIrany);
    }
}
