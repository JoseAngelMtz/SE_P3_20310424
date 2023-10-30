import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.event.*;
import java.awt.Font;
import java.awt.*;
import java.io.*;
class Juego extends JPanel implements ActionListener,ItemListener {
    Font fuente=new Font("Arial",Font.BOLD,20);
    Font fuente1=new Font("Arial",Font.PLAIN,40);
    Font fuente2=new Font("Arial",Font.PLAIN,18);
	public JButton botonR,botonS,botonP1,botonP2,botonP3,botonP4,botonP5,botonL1,botonL2,botonL3,botonL4,botonL5,botonE1,botonE2,botonE3,botonE4,botonE5;
    public JTextArea contexto;
    public JComboBox<String> acusoP,acusoL,acusoE;
    public int Intr = 0, Q = 0;
    public String a = "morado.jpg",coso,sujeto,lugar,equipo,sujetoi,lugari,equipoi;
    public String[] s= new String[5];
    public String lore = "\n\n\nAlguien entro a la casa \ndel Profesor Oak y lo debilito. \nEs tu trabajo descubrir qué sucedió exactamente";
    public Juego(){
        setLayout(null);
        setBackground(new Color(200, 242, 144));
        contexto = new JTextArea(lore);
        contexto.setFont(fuente);
        contexto.setEditable(false);
        contexto.setForeground(Color.YELLOW);
        contexto.setOpaque(false);
        contexto.setBounds(20,20,760,350);
        botonR = new JButton("Comprobar");
        botonR.setBounds(250,400,230,35);
        botonR.setFont(fuente);
        botonR.setVisible(false);
        botonS = new JButton("Siguiente");
        botonS.setBounds(633,530,150,30); //x, y, ancho, alto. Dentro del frame
        botonS.setFont(fuente2);
        botonP1 = new JButton("Chikorita");
        botonP1.setBounds(20,200,150,30);
        botonP1.setFont(fuente2);
        botonP1.setVisible(false);
        botonP2 = new JButton("Torchic");
        botonP2.setBounds(170,200,150,30);
        botonP2.setFont(fuente2);
        botonP2.setVisible(false);
        botonP3 = new JButton(" Piplup");
        botonP3.setBounds(320,200,150,30);
        botonP3.setFont(fuente2);
        botonP3.setVisible(false);
        botonP4 = new JButton("Sylveon");
        botonP4.setBounds(470,200,150,30);
        botonP4.setFont(fuente2);
        botonP4.setVisible(false);
        botonP5 = new JButton("Glimmora");
        botonP5.setBounds(620,200,150,30);
        botonP5.setFont(fuente2);
        botonP5.setVisible(false);
        botonL1 = new JButton("Patio T");
        botonL1.setBounds(20,290,150,30);
        botonL1.setFont(fuente2);
        botonL1.setVisible(false);
        botonL2 = new JButton("Patio D");
        botonL2.setBounds(170,290,150,30);
        botonL2.setFont(fuente2);
        botonL2.setVisible(false);
        botonL3 = new JButton("Sala");
        botonL3.setBounds(320,290,150,30);
        botonL3.setFont(fuente2);
        botonL3.setVisible(false);
        botonL4 = new JButton("Laboratorio");
        botonL4.setBounds(470,290,150,30);
        botonL4.setFont(fuente2);
        botonL4.setVisible(false);
        botonL5 = new JButton("Guarderia");
        botonL5.setBounds(620,290,150,30);
        botonL5.setFont(fuente2);
        botonL5.setVisible(false);
        botonE1 = new JButton("Hierbas");
        botonE1.setBounds(20,380,150,30);
        botonE1.setFont(fuente2);
        botonE1.setVisible(false);
        botonE2 = new JButton("Fuego");
        botonE2.setBounds(170,380,150,30);
        botonE2.setFont(fuente2);
        botonE2.setVisible(false);
        botonE3 = new JButton("Agua");
        botonE3.setBounds(320,380,150,30);
        botonE3.setFont(fuente2);
        botonE3.setVisible(false);
        botonE4 = new JButton("Brillos");
        botonE4.setBounds(470,380,150,30);
        botonE4.setFont(fuente2);
        botonE4.setVisible(false);
        botonE5 = new JButton("Veneno");
        botonE5.setBounds(620,380,150,30);
        botonE5.setFont(fuente2);
        botonE5.setVisible(false);
        String[] optionsP = {"Personaje","Chikorita", "Torchic", "Piplup", "Sylveon", "Glimmora"};
        acusoP = new JComboBox<>(optionsP);
        acusoP.setBounds(200,150,150,30);
        acusoP.setFont(fuente2);
        acusoP.setVisible(false);
        String[] optionsL = {"Lugar","Patio T", "Patio D", "Sala", "Laboratorio", "Guarderia"};
        acusoL = new JComboBox<>(optionsL);
        acusoL.setBounds(370,150,150,30);
        acusoL.setFont(fuente2);
        acusoL.setVisible(false);
        String[] optionsE = {"Equipo","Hierbas", "Fuego", "Agua", "Birllos", "Veneno"};
        acusoE = new JComboBox<>(optionsE);
        acusoE.setBounds(540,150,150,30);
        acusoE.setFont(fuente2);
        acusoE.setVisible(false);

        add(contexto);
        add(botonR);
        add(botonS);
        add(botonP1);
        add(botonP2);
        add(botonP3);
        add(botonP4);
        add(botonP5);
        add(botonL1);
        add(botonL2);
        add(botonL3);
        add(botonL4);
        add(botonL5);
        add(botonE1);
        add(botonE2);
        add(botonE3);
        add(botonE4);
        add(botonE5);
        add(acusoP);
        add(acusoL);
        add(acusoE);
        botonR.addActionListener(this);
        botonS.addActionListener(this);
        botonP1.addActionListener(this);
        botonP2.addActionListener(this);
        botonP3.addActionListener(this);
        botonP4.addActionListener(this);
        botonP5.addActionListener(this);
        botonL1.addActionListener(this);
        botonL2.addActionListener(this);
        botonL3.addActionListener(this);
        botonL4.addActionListener(this);
        botonL5.addActionListener(this);
        botonE1.addActionListener(this);
        botonE2.addActionListener(this);
        botonE3.addActionListener(this);
        botonE4.addActionListener(this);
        botonE5.addActionListener(this);
        acusoP.addItemListener(this);
        acusoL.addItemListener(this);
        acusoE.addItemListener(this);

        try {
            backgroundImage = ImageIO.read(new File(a));  // Imagen a cambiar
            repaint();
        } catch (Exception e) {
        }
    }
    public void itemStateChanged(ItemEvent accion){
        sujeto = acusoP.getSelectedItem().toString();
        lugar = acusoL.getSelectedItem().toString();
        equipo = acusoE.getSelectedItem().toString();
    }
    public void actionPerformed(ActionEvent accion){
        if (accion.getSource() == botonR){
            coso = "blanco.jpg";
            IMG(coso);
            Resultado();
        }
    	if (accion.getSource() == botonS){
            Intr++;
            coso = "morado.jpg";
            if (Intr==1) {
                Rand();
                System.out.println(Intr);
                Lista();
                IMG(coso);
            }
            else if (Intr>1) {
                Q++;
                System.out.println("elseif");
                System.out.println(Q);
                Lista();
                IMG(coso);
                if(Q>=5){
                    Juicio();
                    coso = "verde.jpg";
                    IMG(coso);
                }
            }
            else{
                System.out.println("else");
            }
        }
        if (accion.getSource() == botonP1){
            coso = "azul.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Chikorita")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonP2){
            coso = "azul.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Torchic")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonP3){
            coso = "azul.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Piplup")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonP4){
            coso = "azul.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Sylveon")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonP5){
            coso = "azul.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Glimmora")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonL1){
            coso = "rojo.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Patio T")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonL2){
            coso = "rojo.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Patio D")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonL3){
            coso = "rojo.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Sala")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonL4){
            coso = "rojo.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Laboratorio")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonL5){
            coso = "rojo.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Guarderia")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonE1){
            coso = "amarillo.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Hierbas")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonE2){
            coso = "amarillo.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Fuego")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonE3){
            coso = "amarillo.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Agua")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonE4){
            coso = "amarillo.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Brillos")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
        if (accion.getSource() == botonE5){
            coso = "amarillo.jpg";
            for(int i = 0; i < s.length; i++){
                if(s[i].contains("Veneno")){
                    lore=s[i];
                }
            }
            IMG(coso);
            Info();
        }
    }
    public void Rand(){
        switch(Main_P3.r){
            case 1:
                System.out.println("caso 1");
                sujetoi = "Glimmora";
                lugari = "Patio T";
                equipoi = "Fuego";
                s[0] = "\n\n\nLos registros del Guarderia dicen que \nSylveon se encontraba ahi, el registro tambien \n menciona que se encontro rastro de Brillos \nen todas partes";
                s[1] = "\n\n\nLas registros del Patio D dicen que \nTorchic se econtrraba ahi, tras una revisión se encontró \nFuego el lugar";
                s[2] = "\n\n\nGlimmora dijo estar en la sala, los registros \nno la encuentran se encontró un rastros de Veneno";
                s[3] = "\n\n\nChikorita mencionó estar en el Laboratorio, su \nnombre está en el registro; hay Hierbas cerca \nde la puerta";
                s[4] = "\n\n\nPiplup menciona que durmio todo el tiempo en el \nPatio T, los registros se perdieron pero \notros miembros lo confirman, \nmenciona Fuego por todo el lugar";
            break;
            case 2:
                System.out.println("caso 2");
                sujetoi = "Torchic";
                lugari = "Patio D";
                equipoi = "Brillos";
                s[0] = "\n\n\nLos registros de la Guarderia no se encontro \na Torchic que menciono estar en el lugar, \nhay un Fuego en la zona";
                s[1] = "\n\n\nLos registro de Patio D no estaban pero\notros menciona a Piplup en el lugar, tras una \nrevisión se encontró Brillos";
                s[2] = "\n\n\nSylveon dijo estar en la Sala, los registros \nlo confirman, en la decoración se encontro\nBrillos";
                s[3] = "\n\n\nChikorita mencionó estar en el Laboratorio, su \nnombre está en el registro; hay Hierbas \ncerca de la entrada";
                s[4] = "\n\n\nGlimmora menciona que trabajó en Patio T \nen el Taller, los registros del lugar lo confirman, \nse enontro Veneno";
            break;
            case 3:
                System.out.println("caso 3");
                sujetoi = "Sylveon";
                lugari = "Sala";
                equipoi = "Veneno";
                s[0] = "\n\n\nLos registros de la Guarderia inidican que \nChikorita estaba ahi y tras una revisión se encontró\nHierbas";
                s[1] = "\n\n\nLos registros indican que Torchic \nse enconraba en Patio D , se encontro Fuego";
                s[2] = "\n\n\nPiplup dijo estar en la Sala y otros \nconfirma pero los registros no aparecen,\nse encontro Veneno en la decoracion";
                s[3] = "\n\n\nSylveon dijo estar en el Laboratorio pero \nno está en el registro; hay un Brillos \ncerca de la entrada";
                s[4] = "\n\n\nGlimmora menciono que trabajó todo el tiempo \nen el Patio T, \nel registro menciona Veneno en el lugar";
            break;
            case 4:
                System.out.println("caso 4");
                sujetoi = "Glimmora";
                lugari = "Laboratorio";
                equipoi = "Hierbas";
                s[0] = "\n\n\nLos registros de la Guarderia indican que \nChikorita estaba ahi y tras una revisión se \nencontró Hierbas";
                s[1] = "\n\n\nTorchic menciono que trabajó todo el \ntiempo en el Patio T y el registro menciona \n Fuego en el lugar";
                s[2] = "\n\n\nPiplup dijo estar en la sala, los registros \nconfirman eso; junto a la puerta se encontró Agua";
                s[3] = "\n\n\nSylveon dijo estar en el Laboratorio, el \nregistro está perdido pero varios lo vieron \nentrar; hay Hierbas por todo el lugar";
                s[4] = "\n\n\nGlimmora menciona que estaba en el \nPatio D, pero los registros no la encuentran,\nse encnontro Veneno";
            break;
            case 5:
                System.out.println("caso 5");
                sujetoi = "Chikorita";
                lugari = "Guarderia";
                equipoi = "Brillo";
                s[0] = "\n\n\nLos registro de l Sala indican que Torchic \nestaba ahi y otros lo confirman,\nse encontro Fuego en el lugar";
                s[1] = "\n\n\nLos registro de la Guarderia no estaban pero \nmencionan que Piplup se encontraba ahi, tras una \nrevisión se encontro Brillos";
                s[2] = "\n\n\nSylveon dijo estar en el Patio D, los \nregistros indican que estaba ahi;\nSe encontro Brillos";
                s[3] = "\n\n\nChikorita mencionó estar en el Patio T, su \nnombre no está en el registro; hay un Hierbas en el lugar";
                s[4] = "\n\n\nGlimmora menciona que estaba en el \nLaboratorio, los registros del lugar lo confirman,\nse encontro Veneno";
            break;
            default:
                System.out.println("default");
            break;
        }
    }
//||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||    
    //Cambio de fondo
    public Image backgroundImage;
    private void IMG(String change){
        a = change;
        try {
            backgroundImage = ImageIO.read(new File(a));  // Imagen a cambiar
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }
//||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||    */
    public void Resultado(){
        if(sujeto==sujetoi&&lugar==lugari&&equipo==equipoi){
            lore="Ganaste";
        }
        else{
            String verdad="Te haz equivocado. \nEl culpable es: "+sujetoi+"\nEntro desde: "+lugari+"\nUsando: "+equipoi;
            lore=verdad;
        }
        contexto.setText(lore);
        contexto.setVisible(true);
        botonR.setVisible(false);
        acusoE.setVisible(false);
        acusoL.setVisible(false);
        acusoP.setVisible(false);
        botonS.setVisible(false);
        botonP1.setVisible(false);
        botonP2.setVisible(false);
        botonP3.setVisible(false);
        botonP4.setVisible(false);
        botonP5.setVisible(false);
        botonL1.setVisible(false);
        botonL2.setVisible(false);
        botonL3.setVisible(false);
        botonL4.setVisible(false);
        botonL5.setVisible(false);
        botonE1.setVisible(false);
        botonE2.setVisible(false);
        botonE3.setVisible(false);
        botonE4.setVisible(false);
        botonE5.setVisible(false);
    }
    private void Lista(){
        contexto.setVisible(false);
        botonS.setVisible(false);
        botonP1.setVisible(true);
        botonP2.setVisible(true);
        botonP3.setVisible(true);
        botonP4.setVisible(true);
        botonP5.setVisible(true);
        botonL1.setVisible(true);
        botonL2.setVisible(true);
        botonL3.setVisible(true);
        botonL4.setVisible(true);
        botonL5.setVisible(true);
        botonE1.setVisible(true);
        botonE2.setVisible(true);
        botonE3.setVisible(true);
        botonE4.setVisible(true);
        botonE5.setVisible(true);
    }
    private void Info(){
        contexto.setText(lore);
        contexto.setVisible(true);
        botonS.setVisible(true);
        botonP1.setVisible(false);
        botonP2.setVisible(false);
        botonP3.setVisible(false);
        botonP4.setVisible(false);
        botonP5.setVisible(false);
        botonL1.setVisible(false);
        botonL2.setVisible(false);
        botonL3.setVisible(false);
        botonL4.setVisible(false);
        botonL5.setVisible(false);
        botonE1.setVisible(false);
        botonE2.setVisible(false);
        botonE3.setVisible(false);
        botonE4.setVisible(false);
        botonE5.setVisible(false);
    }
    private void Juicio(){
        contexto.setVisible(false);
        botonR.setVisible(true);
        botonS.setVisible(false);
        botonP1.setVisible(false);
        botonP2.setVisible(false);
        botonP3.setVisible(false);
        botonP4.setVisible(false);
        botonP5.setVisible(false);
        botonL1.setVisible(false);
        botonL2.setVisible(false);
        botonL3.setVisible(false);
        botonL4.setVisible(false);
        botonL5.setVisible(false);
        botonE1.setVisible(false);
        botonE2.setVisible(false);
        botonE3.setVisible(false);
        botonE4.setVisible(false);
        botonE5.setVisible(false);
        acusoP.setVisible(true);
        acusoL.setVisible(true);
        acusoE.setVisible(true);
    }
    public static void main(String[] args) {
        Juego base=new Juego();
        base.setBounds(150,100,800,600);
        base.setVisible(true);
    }
}
