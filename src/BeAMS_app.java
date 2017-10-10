import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import swing2swt.layout.BoxLayout;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FillLayout;


public class BeAMS_app {

	protected Shell shell;

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
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem mntmFile = new MenuItem(menu, SWT.NONE);
		mntmFile.setText("File");
		
		MenuItem mntmMaterials = new MenuItem(menu, SWT.CASCADE);
		mntmMaterials.setText("Materials");
		
		Menu menu_1 = new Menu(mntmMaterials);
		mntmMaterials.setMenu(menu_1);
		
		Browser browser = new Browser(shell, SWT.NONE);
		browser.setUrl("www.google.com");

	}
}
