package FilmovyKviz;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class FilmovyKviz implements ActionListener {

    String[] otazky = {
            "Aké je meno herca, ktorý hrá nového agenta 007 vo filme James Bond: No Time To Die ?",
            "V koľkých filmoch od režiséra Stevena Spielberga hral v hlavnej úlohe Tom Hanks ?",
            "V roku 2013 sa Lupita Nyong’o sa stala prvou Keňacko-Mexickou herečkou ktorá získala Oscara – za ktorý film toto ocenenie dostala ?",
            "V ktorom roku išiel do kín prvý Toy Story ?",
            "Kto režíroval filmy Titanic, Avatar & Terminátor ?",
            "Kto režíroval film Parazit ? - Prvý zahraničný snímok, ktorý získal Oscara.",
            "Ktorej Oscarovej herečke patrí hlas Helen Parr (Elast-girl) v animáku Rodinka úžasných ?",
            "Aký je názov spinoff-u Rocky série z roku 2015 ?",
            "Meryl Streep vyhrala ocenenie BAFTA Best Actress v roku 2011 za akú politickú drámu ?",
            "Ktorý herec si zlomil dva prsty pri natáčaní filmu Pán prsteňov: Dve veže ?",
            "V ktorých troch filmoch hrali spolu Tom Hanks a Meg Ryan ?",
            "Russell Crowe odmietol úlohu ktorej postavy v trilógii Pána prsteňov ?",
            "Koľko filmov majú Kate Winslet & Leonardo DiCaprio natočených spoločných ?",
            "V ktorom filme zaznela táto známa veta: You can't handle the truth !",
            "Aké je prvé slovo vyslovené v Star Wars: Impérium vracia úder (1980) ?",
            "Ktorý herec/herečka dostal najviac Oscarov v histórii Academy Award ?",
            "Quentin Tarantino pomáhal napísať scenár v roku 1994 k akému filmu ?",
            "Kto režíroval akčný film Skala z roku 1996 ?",
            "Ako sa volá režijný debut Toma Hanksa z roku 1996 ?",
            "Vo filme Štyri svadby a jeden pohreb z roku 1994 sa všetci zúčastnia koho pohrebu ?",
            "Ktorý americký režisér napísal a zrežíroval filmy Uteč & My ?",
            "Ako sa volá nadchádzajúca komediálna dráma Wesa Andersona v hlavných úlohách: Benicio del Toro, Adrien Brody, Owen Wilson, Frances McDormand, Bill Murray, Tilda Swinton a Timothée Chalamet ?",
            "Ako sa volá druhý film o Jamesovi Bondovi ?",
            "Kto hrá Josha Lucasa - nevlastného brata Cher Horowitz's vo filme Bezmocná ?",
            "Ktorý herec hral hlavnú úlohu vo filme Ona z roku 2013 ?",
            "Koľko cien Akadémie získal Leonardo DiCaprio ?",
            "Za ktorý film získala Sandra Bullock svojho Oscara ?",
            "Úprimne povedané, môj drahý, je mi to jedno. Z akého filmu je táto ikonická hláška ?",
            "Kto nahradil Richarda Harrisa ako Dumbledora vo filmoch Harry Potter ?",
            "Ktorý Shakespearovský herec režíroval film Thor ?"
    };

    String[][] moznosti = {
            { "Daniel Craig", "Rami Malek", "Ralph Fiennes", "Lashana Lynch" },
            { "3", "4", "5", "6" },
            { "12 rokov otrokom", "Kniha džungle", "Star Wars: Sila sa prebúdza", "Veľký Gatsby"},
            { "1999", "1995", "2000", "2002" },
            { "Steven Spielberg", "Ridley Scott", "James Cameron", "George Lucas" },
            { "Bong Joon-ho", "Masaki Kobayashi", "Hajao Mijazaki", "Ang Lee" },
            { "Jennifer Aniston", "Helena Bonham Carter", "Holly Hunter", "Nicole Kidman" },
            { "Assassin's Creed", "Rocky Balboa", "Black Rocky", "Creed" },
            { "The Post: Aféra v Pentagone", "Železná Lady", "Kráľovná", "Lincoln" },
            { "Elijah Wood", "Christopher Lee", "Ian McKellen", "Viggo Mortensen" },
            { "Joe verzus sopka, Bezsenné noci v Seattli, Láska cez internet",
                    "Philadelphia, Apollo 13, Terminál",
                    "Dom za všetky peniaze, Veľký, Bezsenné noci v Seattli",
                    "Forrest Gump, Láska cez internet, Moja krásna učiteľka" },
            { "Faramir", "Boromir", "Aragorn", "Sauron" },
            { "jeden - Titanic", "dva - Titanic & Núdzový východ", "tri - Titanic, Pláž & Krvavý diamant", "žiadny" },
            { "Sedem", "Gladiátor", "Krstný otec", "Zopár správnych chlapov" },
            { "Echo", "Strach", "Temnota", "Sila" },
            { "Frances McDormand", "Daniel Day-Lewis", "Katherine Hepburn", "Meryl Streep" },
            { "Karmínový príliv", "Horlivosť", "Apollo 13", "Sedem" },
            { "Ridley Scott", "Michael Bay", "Guy Ritchie", "Sam Mendes" },
            { "Prvotný strach", "Philadelphia", "Moja krásna učiteľka", "To je náš hit!" },
            { "Pohreb Charlesa (hrá Hugh Grant)",
                    "Pohreb Toma (hrá James Fleet)",
                    "Pohreb Garetha (hrá Simon Callow)",
                    "Pohreb otca Geralda (hrá Rowan Atkinson)" },
            { "Jordan Peele", "Guillermo del Toro", "Mel Gibson", "Gore Verbinski"},
            { "Duna", "Francúzska depeša Liberty", "Klan Gucci", "Posledná noc v Soho" },
            { "Goldfinger", "Dr.No", "Thunderball", "Srdečné pozdravy z Ruska" },
            { "Steve Buscemi", "Ewan McGregor", "Christian Bale", "Paul Rudd"},
            { "Jake Gyllenhaal", "Edward Norton", "Joaquin Phoenix", "Christian Bale" },
            { "Jedného Oscara", "Dvoch Oscarov", "Troch Oscarov", "Žiadneho Oscara" },
            { "Rasisti", "Splnený sen", "Gravitácia", "Návrh" },
            { "Odviate vetrom", "Občan Kane", "Psycho", "Niekto to rád horúce" },
            { "Robbie Coltrane", "Ralph Fiennes", "Michael Gambon", "Brendan Gleeson" },
            { "Taika Waititi", "James Gunn", "Anthony Russo", "Kenneth Branagh" }

    };

    char[] odpovede = {
            'D',
            'C',
            'A',
            'B',
            'C',
            'A',
            'C',
            'D',
            'B',
            'D',
            'A',
            'C',
            'B',
            'D',
            'A',
            'C',
            'A',
            'B',
            'D',
            'C',
            'A',
            'B',
            'D',
            'D',
            'C',
            'A',
            'B',
            'A',
            'C',
            'D'
    };

    char odpoved;
    int index;
    int spravne_uhadnute = 0;
    int total_otazky = otazky.length;
    int vysledok;
    int sekundy = 30;

    JFrame frame = new JFrame();
    JTextField textfield = new JTextField();
    JTextArea textarea = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
    JLabel odpovede_labelA = new JLabel();
    JLabel odpovede_labelB = new JLabel();
    JLabel odpovede_labelC = new JLabel();
    JLabel odpovede_labelD = new JLabel();
    JLabel time_label = new JLabel();
    JLabel seconds_left = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percenta = new JTextField();

    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            sekundy--;
            seconds_left.setText(String.valueOf(sekundy));
            if (sekundy <= 0) {
                ukazOdpoved();
            }
        }
    });

    public FilmovyKviz() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1440, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(null);
        frame.setResizable(false);

        textfield.setBounds(0, 0, 1440, 50);
        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("MV Boli", Font.BOLD, 30));
        textfield.setBorder(BorderFactory.createBevelBorder(1));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        textfield.setEditable(false);

        textarea.setBounds(0, 50, 1440, 100);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setBackground(new Color(25, 25, 25));
        textarea.setForeground(new Color(25, 255, 0));
        textarea.setFont(new Font("MV Boli", Font.BOLD, 25));
        textarea.setBorder(BorderFactory.createBevelBorder(1));
        textarea.setEditable(false);

        buttonA.setBounds(0, 200, 100, 100);
        buttonA.setFont(new Font("MV Boli", Font.BOLD, 35));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");

        buttonB.setBounds(0, 300, 100, 100);
        buttonB.setFont(new Font("MV Boli", Font.BOLD, 35));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);
        buttonB.setText("B");

        buttonC.setBounds(0, 400, 100, 100);
        buttonC.setFont(new Font("MV Boli", Font.BOLD, 35));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);
        buttonC.setText("C");

        buttonD.setBounds(0, 500, 100, 100);
        buttonD.setFont(new Font("MV Boli", Font.BOLD, 35));
        buttonD.setFocusable(false);
        buttonD.addActionListener(this);
        buttonD.setText("D");

        odpovede_labelA.setBounds(125, 200, 1400, 100);
        odpovede_labelA.setBackground(new Color(50, 50, 50));
        odpovede_labelA.setForeground(new Color(25, 255, 0));
        odpovede_labelA.setFont(new Font("MV Boli", Font.PLAIN, 35));

        odpovede_labelB.setBounds(125, 300, 1400, 100);
        odpovede_labelB.setBackground(new Color(50, 50, 50));
        odpovede_labelB.setForeground(new Color(25, 255, 0));
        odpovede_labelB.setFont(new Font("MV Boli", Font.PLAIN, 35));

        odpovede_labelC.setBounds(125, 400, 1400, 100);
        odpovede_labelC.setBackground(new Color(50, 50, 50));
        odpovede_labelC.setForeground(new Color(25, 255, 0));
        odpovede_labelC.setFont(new Font("MV Boli", Font.PLAIN, 35));

        odpovede_labelD.setBounds(125, 500, 1400, 100);
        odpovede_labelD.setBackground(new Color(50, 50, 50));
        odpovede_labelD.setForeground(new Color(25, 255, 0));
        odpovede_labelD.setFont(new Font("MV Boli", Font.PLAIN, 35));

        seconds_left.setBounds(10, 660, 100, 100);
        seconds_left.setBackground(new Color(25, 25, 25));
        seconds_left.setForeground(new Color(255, 0, 0));
        seconds_left.setFont(new Font("Ink Free", Font.BOLD, 60));
        seconds_left.setBorder(BorderFactory.createBevelBorder(1));
        seconds_left.setOpaque(true);
        seconds_left.setHorizontalAlignment(JTextField.CENTER);
        seconds_left.setText(String.valueOf(sekundy));

        time_label.setBounds(0, 620, 100, 50);
        time_label.setBackground(new Color(50, 50, 50));
        time_label.setForeground(new Color(255, 0, 0));
        time_label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        time_label.setHorizontalAlignment(JTextField.CENTER);
        //time_label.setText("");

        number_right.setBounds(225, 225, 200, 100);
        number_right.setBackground(new Color(25, 25, 25));
        number_right.setForeground(new Color(25, 255, 0));
        number_right.setFont(new Font("Ink Free", Font.BOLD, 50));
        number_right.setBorder(BorderFactory.createBevelBorder(1));
        number_right.setHorizontalAlignment(JTextField.CENTER);
        number_right.setEditable(false);

        percenta.setBounds(225, 325, 200, 100);
        percenta.setBackground(new Color(25, 25, 25));
        percenta.setForeground(new Color(25, 255, 0));
        percenta.setFont(new Font("Ink Free", Font.BOLD, 50));
        percenta.setBorder(BorderFactory.createBevelBorder(1));
        percenta.setHorizontalAlignment(JTextField.CENTER);
        percenta.setEditable(false);

        //frame.add(number_right);
        //frame.add(percenta);
        frame.add(time_label);
        frame.add(seconds_left);
        frame.add(odpovede_labelA);
        frame.add(odpovede_labelB);
        frame.add(odpovede_labelC);
        frame.add(odpovede_labelD);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(textarea);
        frame.add(textfield);
        frame.setVisible(true);

        dalsiaOtazka();
    }
    public void dalsiaOtazka() {

        if (index >= total_otazky) {
            vysledok();
        }
        else {
            textfield.setText("Otázka" + (index+1));
            textarea.setText(otazky[index]);
            odpovede_labelA.setText(moznosti[index][0]);
            odpovede_labelB.setText(moznosti[index][1]);
            odpovede_labelC.setText(moznosti[index][2]);
            odpovede_labelD.setText(moznosti[index][3]);
            timer.start();
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if (e.getSource() == buttonA) {
            odpoved = 'A';
            if (odpoved == odpovede[index]) {
                spravne_uhadnute++;
            }
        }
        if (e.getSource() == buttonB) {
            odpoved = 'B';
            if (odpoved == odpovede[index]) {
                spravne_uhadnute++;
            }
        }
        if (e.getSource() == buttonC) {
            odpoved = 'C';
            if (odpoved == odpovede[index]) {
                spravne_uhadnute++;
            }
        }
        if (e.getSource() == buttonC) {
            odpoved = 'C';
            if (odpoved == odpovede[index]) {
                spravne_uhadnute++;
            }
        }
        if (e.getSource() == buttonD) {
            odpoved = 'D';
            if (odpoved == odpovede[index]) {
                spravne_uhadnute++;
            }
        }
        ukazOdpoved();
    }
    public void ukazOdpoved() {

        timer.stop();
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if (odpovede[index] != 'A')
            odpovede_labelA.setForeground(new Color(255, 0, 0));
        if (odpovede[index] != 'B')
            odpovede_labelB.setForeground(new Color(255, 0, 0));
        if (odpovede[index] != 'C')
            odpovede_labelC.setForeground(new Color(255, 0, 0));
        if (odpovede[index] != 'D')
            odpovede_labelD.setForeground(new Color(255, 0, 0));

        Timer pause = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                odpovede_labelA.setForeground(new Color(25, 255, 0));
                odpovede_labelB.setForeground(new Color(25, 255, 0));
                odpovede_labelC.setForeground(new Color(25, 255, 0));
                odpovede_labelD.setForeground(new Color(25, 255, 0));

                odpoved = ' ';
                sekundy = 30;
                seconds_left.setText(String.valueOf(sekundy));
                buttonA.setEnabled(true);
                buttonB.setEnabled(true);
                buttonC.setEnabled(true);
                buttonD.setEnabled(true);
                index++;
                dalsiaOtazka();
            }
        });
        pause.setRepeats(false);
        pause.start();
    }
    public void vysledok() {

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        vysledok = (int)((spravne_uhadnute/(double)total_otazky)*100);

        textfield.setText("Výsledky !");
        textarea.setText("");
        odpovede_labelA.setText("");
        odpovede_labelB.setText("");
        odpovede_labelC.setText("");
        odpovede_labelD.setText("");

        number_right.setText("("+spravne_uhadnute+"/"+total_otazky+")");
        percenta.setText(vysledok + "%");

        frame.add(percenta);
        frame.add(number_right);
    }
}

class Kviz {
    public static void main(String[] args) {
        FilmovyKviz kviz = new FilmovyKviz();
    }
}
