import java.awt.*;
import java.awt.event.*;

public class ColorChooser extends Frame implements ActionListener, AdjustmentListener{

	private TextField tr, tg, tb, hex; 
	private MyCanvas mc, mcr, mcg, mcb, mcs;
	private Scrollbar sbr, sbg, sbb;
	private Button random, store, recall, invert;
	private int x, y, r, g, b;
	private Label lr, lg, lb, lh;
	private int storedR = 0;
	private int storedG = 0;
	private int storedB = 0;
	
	
	public ColorChooser(){

		this.sbr = new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
		this.sbr.addAdjustmentListener(this);
		this.sbg = new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
		this.sbg.addAdjustmentListener(this);
		this.sbb = new Scrollbar(Scrollbar.HORIZONTAL,0,0,0,256);
		this.sbb.addAdjustmentListener(this);
		
		this.tr = new TextField("0", 5);
		this.tg = new TextField("0", 5);
		this.tb = new TextField("0", 5);	
		
		r = Integer.valueOf(tr.getText());
		g = Integer.valueOf(tg.getText());
		b = Integer.valueOf(tb.getText());
		
		this.mc = new MyCanvas(100,100,r,g,b);
		this.mcs = new MyCanvas(20,20,r,g,b);
		this.mcr = new MyCanvas(20,20,r,g,b);
		this.mcg = new MyCanvas(20,20,r,g,b);
		this.mcb = new MyCanvas(20,20,r,g,b);
		
		this.hex = new TextField("0", 10);
		lh = new Label();
		lh.setAlignment(Label.LEFT);
		lh.setText("Hex code:   ");
		
		this.random = new Button("Random");
		this.random.addActionListener(this);
		this.store = new Button("Store");
		this.store.addActionListener(this);
		this.recall = new Button("Recall");
		this.recall.addActionListener(this);
		this.invert = new Button("Invert");
		this.invert.addActionListener(this);
		
		
		this.setTitle("EE219 Color Chooser");		
		this.setLayout(new BorderLayout());
		
		lr = new Label();
		lr.setAlignment(Label.LEFT);
		lr.setText("Red:   ");
		
		lg = new Label();
		lg.setAlignment(Label.LEFT);
		lg.setText("Green:");
		
		lb = new Label();
		lb.setAlignment(Label.LEFT);
		lb.setText("Blue:  ");
		
		Panel pr = new Panel(new FlowLayout());
		pr.add(lr);
		pr.add(sbr);
		pr.add(tr);
		pr.add(mcr);
		
		Panel pg = new Panel(new FlowLayout());
		pg.add(lg);
		pg.add(sbg);
		pg.add(tg);
		pg.add(mcg);
		
		Panel pb = new Panel(new FlowLayout());
		pb.add(lb);
		pb.add(sbb);
		pb.add(tb);
		pb.add(mcb);
		
		Panel prgb = new Panel(new GridLayout(3,1));
		prgb.add(pr);
		prgb.add(pg);
		prgb.add(pb);
		
		Panel f = new Panel(new FlowLayout());
		f.add(lh);
		f.add(hex);
		f.add(random);
		f.add(store);
		f.add(recall);
		f.add(invert);
		
		this.add("West", mc);
		this.add("East", prgb);
		this.add("South", f);
		
		this.updateDisplay();
		this.pack();
		this.setVisible(true);
		
	    this.addWindowListener(new WindowAdapter() {
       	public void windowClosing(WindowEvent we) {
           	dispose();
        	}
     	}
);
	}
	public boolean isNumeric(String s){
		try {Integer.valueOf(s);}catch(NumberFormatException nfe){return false;}
		return true;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(!isNumeric(tr.getText()) || !isNumeric(tg.getText()) || !isNumeric(tb.getText())){
        	System.out.println(" Invalid Values");
        }

		
		if(e.getSource()== this.store){
			storedR = Integer.valueOf(tr.getText());
			storedG = Integer.valueOf(tg.getText());
			storedB = Integer.valueOf(tb.getText());
			//Rectangle rectStore = new Rectangle(20, 20, 38, 39);
			//rectStore.fillRect(0, 0, 99, 99);
		}
		if(e.getSource()== this.recall){
			this.tr.setText(""+storedR);
			this.tg.setText(""+storedG);
			this.tb.setText(""+storedB);
			r = Integer.valueOf(tr.getText());
			g = Integer.valueOf(tg.getText());
			b = Integer.valueOf(tb.getText());
			sbr.setValue(r);
			sbg.setValue(g);
			sbb.setValue(b);
			mc.rep(r, g, b);
			mcr.rep(r, 0, 0);
			mcg.rep(0, g, 0);
			mcb.rep(0, 0, b);
			String hext = String.format("%02x%02x%02x", r, g, b);
			hex.setText(hext);	
		}
		if(e.getSource()== this.random){
			this.tr.setText(""+(int)(Math.random()*256));
			this.tg.setText(""+(int)(Math.random()*256));
			this.tb.setText(""+(int)(Math.random()*256));
			r = Integer.valueOf(tr.getText());
			g = Integer.valueOf(tg.getText());
			b = Integer.valueOf(tb.getText());
			sbr.setValue(r);
			sbg.setValue(g);
			sbb.setValue(b);
			mc.rep(r, g, b);
			mcr.rep(r, 0, 0);
			mcg.rep(0, g, 0);
			mcb.rep(0, 0, b);
			String hext = String.format("%02x%02x%02x", r, g, b);
			hex.setText(hext);
		}
		if(e.getSource()== this.invert){
			this.tr.setText(""+(256-sbr.getValue()));
			this.tg.setText(""+(256-sbg.getValue()));
			this.tb.setText(""+(256-sbb.getValue()));
			r = Integer.valueOf(tr.getText());
			g = Integer.valueOf(tg.getText());
			b = Integer.valueOf(tb.getText());
			sbr.setValue(r);
			sbg.setValue(g);
			sbb.setValue(b);
			mc.rep(r, g, b);
			mcr.rep(r, 0, 0);
			mcg.rep(0, g, 0);
			mcb.rep(0, 0, b);
			String hext = String.format("%02x%02x%02x", r, g, b);
			hex.setText(hext);
		}
	}
	
	private void updateDisplay(){

		int xr = sbr.getValue();
		this.tr.setText(""+xr);
		int xg = sbg.getValue();
		this.tg.setText(""+xg);
		int xb = sbb.getValue();
		this.tb.setText(""+xb);
		r = Integer.valueOf(tr.getText());
		g = Integer.valueOf(tg.getText());
		b = Integer.valueOf(tb.getText());
		mc.rep(r, g, b);
		mcr.rep(r, 0, 0);
		mcg.rep(0, g, 0);
		mcb.rep(0, 0, b);
		String hext = String.format("%02x%02x%02x", r, g, b);
		hex.setText(hext);
	}
	
	public void adjustmentValueChanged(AdjustmentEvent e) {
		this.updateDisplay();
		
	}

	public static void main(String[] args) {
		
		ColorChooser test = new ColorChooser();
		
	}
}

