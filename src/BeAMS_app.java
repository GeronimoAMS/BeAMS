import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

import swing2swt.layout.BoxLayout;

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.layout.RowLayout;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.custom.StackLayout;
import swing2swt.layout.FlowLayout;


public class BeAMS_app {

	protected Shell shell;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text txtNewText;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BeAMS_app window = new BeAMS_app();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(1066, 662);
		shell.setText("BeAMS");
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));

		final TabFolder tabFolder = new TabFolder(shell, SWT.BORDER);
		
		TabItem Structure_tab = new TabItem(tabFolder, SWT.NULL);
		Structure_tab.setText("Structure");
	    TabItem Loading_tab = new TabItem(tabFolder, SWT.NULL);
	    Loading_tab.setText("Loading");
	    TabItem Design_tab = new TabItem(tabFolder, SWT.NULL);
	    Design_tab.setText("Design");
	    TabItem Results_tab = new TabItem(tabFolder, SWT.NULL);
	    Results_tab.setText("Results");
	    
	    Group group = new Group(tabFolder, SWT.NONE);
	    
	    Structure_tab.setControl(group);
	    group.setLayout(new FillLayout(SWT.HORIZONTAL));
	    
	    ExpandBar expandBar = new ExpandBar(group, SWT.NONE);
	    expandBar.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));

	    
	    Composite composite = new Composite (expandBar, SWT.NONE);
	    composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
	    Composite composite1 = new Composite (expandBar, SWT.NONE);
	    composite1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
	    Composite composite2 = new Composite (expandBar, SWT.NONE);
	    composite2.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
	    
	    
	    ExpandItem item1 = new ExpandItem (expandBar, SWT.NONE, 0);
	    item1.setExpanded(true);
	    item1.setText("Sheeting");
	    item1.setHeight(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
	    item1.setControl(composite);
	    
	    Label lblProfile = new Label(composite, SWT.NONE);
	    lblProfile.setBounds(26, 21, 55, 15);
	    formToolkit.adapt(lblProfile, true, true);
	    lblProfile.setText("Profile");
	    
	    Combo combo = new Combo(composite, SWT.READ_ONLY);
	    combo.setBounds(111, 18, 91, 23);
	    formToolkit.adapt(combo);
	    formToolkit.paintBordersFor(combo);
	    combo.add("Item1");
	    combo.add("Item2");
	    combo.select(0);
	    
	    ExpandItem item2 = new ExpandItem (expandBar, SWT.NONE, 0);
	    item2.setExpanded(true);
	    item2.setText("Span");
	    item2.setHeight(composite1.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
	    item2.setControl(composite1);
	    
	    ExpandItem item3 = new ExpandItem (expandBar, SWT.NONE, 0);
	    item3.setExpanded(true);
	    item3.setText("Span");
	    item3.setHeight(composite2.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
	    item3.setControl(composite2);
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mntmFile = new MenuItem(menu, SWT.NONE);
		mntmFile.setText("File");
		
		MenuItem mntmMaterials = new MenuItem(menu, SWT.CASCADE);
		mntmMaterials.setText("Options");
		
		Menu menu_1 = new Menu(mntmMaterials);
		mntmMaterials.setMenu(menu_1);
		
		MenuItem mntmNewItem = new MenuItem(menu, SWT.NONE);
		mntmNewItem.setText("Analysis");
		
		MenuItem mntmNewItem_1 = new MenuItem(menu, SWT.NONE);
		mntmNewItem_1.setText("Help");

	}
}
