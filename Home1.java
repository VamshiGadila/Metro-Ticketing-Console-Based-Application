import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Random;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Collections;

class C extends Colors
{
	public static void l() {
		ct("\t==============================================================================================================================================");
	}
	public static void ct( String message)
	{
		System.out.println(centerText(message));
		System.out.println();
	}
	public static void cto(String message)
	{
		System.out.print(centerText(message));
	}

	public static String centerText(String message)
	{
		int CONSOLE_WIDTH=200;
		int messageLength = message.length();
		int padding = (CONSOLE_WIDTH - messageLength) / 2;
		// we Uses the String.format to pad with spaces
		return String.format("%" + (padding + messageLength) + "s", message);

	}
}


class Home1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("\n\n\n\n");
		System.out.print("\t\t");
		String wel = Colors.blink+Colors.RED+"				.................."+Colors.GREEN+"          W E L C O M E       T O       P V R S	 M E T R O         "+Colors.RED+"................."+Colors.RESET;
		for(int i=0; i<wel.length(); i++)
		{
			if(wel.charAt(i)==' ' || wel.charAt(i)=='.')
				Colors.sleep(10);
			else
				Colors.sleep(50);
			System.out.print(wel.charAt(i));
		}
		System.out.println("\n\n\n");
		C.ct("\t"+Colors.blink+Colors.CYAN+Time.dATE()+Colors.RESET);

		System.out.println("\n\n\n");



		String part1 = Colors.blink + Colors.YELLOW+
		               "\t\t\t\t\t\t			       ====        ________                ___________ \n" +
		               "\t\t\t\t\t\t			  _D _|  |_______/        \\__I_I_____===__|_________| \n" +
		               "\t\t\t\t\t\t			   |(_)---  |   H\\________/ |   |        =|__ ____| "+Colors.RESET;

		String part2 =Colors.blink +Colors.RED +
		              "\t\t\t\t\t\t			   /     |  |    |  |     | |   |       ||  |    | \n" +
		              "\t\t\t\t\t\t			  |      |  |    |__|_____|_|___|_______||  |____| \n" +
		              "\t\t\t\t\t\t			  | _______|___________________________  ||_______| "+Colors.RESET;

		String part3 = Colors.blink+Colors.BLUE+
		               "\t\t\t\t\t\t			  |_|   (0)|   (0)       (0)   (0)    (0)|   (O) \n" +
		               "\t\t\t\t\t\t			  /  \\____|/  \\_____/ \\_____/ \\_____/ \\____|/ \n" +
		               "\t\t\t\t\t\t			 /          \\ /           \\ /          \\ /       \n" +
		               "\t\t\t\t\t\t			(_______________________________________________)" +Colors.RESET;

		System.out.println(part1);
		System.out.println(part2);
		System.out.println(part3+"\n  \n \n \n ");

		Register.register();
	}


	static void home()
	{	C.l();
		C.ct("\t"+Colors.WHITE+Colors.bblue+"     WELCOME TO METEO SERVICES     "+Colors.RESET+Colors.breset);
		C.ct("");
		C.ct(Colors.whitebg+ Colors.PURPLE+"\t----------------Press 1  FOR TICKET BOOKING--------------"+ Colors.RESET);
		C.ct(Colors.whitebg+ Colors.PURPLE+"\t----------------Press 2  FOR NEW CARD--------------------"+ Colors.RESET );
		C.ct(Colors.whitebg+ Colors.PURPLE+"\t----------------Press 3  FOR RECHARGE--------------------" + Colors.RESET);
		C.ct(Colors.whitebg+ Colors.PURPLE+"\t----------------Press 4  FOR SETTINGS--------------------" + Colors.RESET);
		C.ct(Colors.whitebg+ Colors.PURPLE+"\t----------------Press 5  FOR LOGOUT----------------------" + Colors.RESET);
		C.ct(Colors.redbr+"\t----------------Press 6  FOR EXIT------------------------" +Colors.RESET);
		int n=CC.cv();
		switch (n)
		{
		case 1:
			Set.map("C:/Users/hp/OneDrive/Desktop/MINI PROJECT/JAVA PROJECT/map.png");
			TicketCost.cost();
			break;
		case 2:
			newCard();
			break;
		case 3:
			Recharge.rech();
			break;
		case 4:
			Set.set();
			break;
		case 5:
			Register.register();
			break;

		case 6:
			exit();
			break;
		default:
			C.ct("Invalid Input");
			home();
		}
	}
	static void exit() {
		C.l();
		C.ct(Colors.greenbri+Colors.blink+Colors.ital+"****** T H A N K - Y O U   F O R   C H O O S I N G   P V R S  M E T R O ******"+Colors.rstblink+"\n \n \n");
		C.ct(Colors.greenbri+Colors.blink+Colors.ital+"****** H A V E   A   N I C E   D A Y ******"+Colors.rstblink+Colors.RESET+"\n \n \n \n \n  \n \n ");
		Set.map("C:/Users/hp/OneDrive/Desktop/MINI PROJECT/JAVA PROJECT/end.png");
		Colors.sleep(10000);
		System.exit(0);
	}
	static String p="";
	static String n="";
	static String chph="";
	static String checkp() {
		String p=Card.num();
		if(chph.equals(p)) {
			C.ct(Colors.redbr+"Card is already generated with this number. Provide new Number for new Card"+Colors.RESET);
			checkp();
		} else chph =p;
		return p;
	}
	static void newCard()
	{	C.l();
		System.out.println("\n");
		C.ct(Colors.GREEN+"----------------Press 1 For GREEN CARD-------------------" +Colors.RESET);
		C.ct(Colors.BLUE+ "----------------Press 2 For HOLIDAY CARD ----------------" +Colors.RESET);
		C.ct(Colors.YELLOW+ "----------------Press 3 For HOME ------------------------" +Colors.RESET);
		C.ct(Colors.redbr+ "----------------Press 4 FOR EXIT-------------------------" +Colors.RESET);


		int z=CC.cv();
		switch(z)
		{
		case 1:
			GreenCard g=new Card();
			n=Card.name();
			String id1=g.newCard("G",n,checkp());
			Colors.CP(Colors.bgreen,id1);
			C.l();
			C.ct("\t"+Colors.CYAN+"1.RECHARGE\n"+Colors.RESET);
			C.ct("\t"+Colors.YELLOW+"2. HOME"+Colors.RESET);
			int e = CC.cv();
			if(e==1)  Recharge.rech();
			else      home();
			break;
		case 2:
			HolidayCard h=new Card();
			n=Card.name();
			String id2=h.newCard("H",n,checkp());
			Colors.CP(Colors.bblue,id2);
			C.l();
			C.ct("\t"+Colors.CYAN+"1.RECHARGE\n"+Colors.RESET);
			C.ct("\t"+Colors.YELLOW+"2. HOME"+Colors.RESET);
			int e1 = CC.cv();
			if(e1==1)  Recharge.rech();
			else      home();
			break;
		case 3:
			home();
			break;
		case 4:
			exit();
			break;
		default:
			C.ct("INVALID INPUT");
			newCard();

		}
	}

}


class Set {
	static Scanner sc=new Scanner(System.in);

	public static void set() {
		C.l();
		System.out.println("\t\t"+Colors.bblue+"   S E T T I N G S   "+Colors.breset+"\n");
		System.out.println("1. PROFILE   \n2. HELP & SUPPORT \n3. PASSWORD CHANGE \n4. PRIVACY SECURITY \n5. MAP \n6. TICKET HISTORY\n"+Colors.CYAN+"7. BACK  \n"+Colors.redbr+"0. EXIT"+Colors.RESET);
		int ch =CC.cv();
		switch(ch) {
		case 1:
			profile();
			break;
		case 2:
			showHelpSupport();
			break;
		case 3:
			Register.forgotPassword(Register.ff,1);
			break;
		case 4:
			showPrivacySecurity();
			break;
		case 5:
			rout();
			break;
		case 6:
			Ticketid.Thistory();
			break;
		case 7:
			Home1.home();
			return;
		case 8:
			Home1.exit();
			break;
		default :
			Home1.exit();
			break;
		}

	}
	static void rout()
	{
		map("C:/Users/Anusha Bugata/OneDrive/Desktop/task1/JAVA PROJECT/map.png");
		option();
	}

	static void option()
	{
		C.ct(Colors.CYAN+"                          " + "----------------Press 1 For BACK ------------------------" + "                  "+Colors.RESET);
		C.ct(Colors.YELLOW+"                          " + "----------------Press 2 For HOME ------------------------" + "                  "+Colors.RESET);
		C.ct(Colors.RED+"                          " + "----------------Press 3 FOR EXIT-------------------------" + "                  "+Colors.RESET);


		int l1 = CC.cv();

		switch (l1)
		{
		case 1:
			set();
			break;
		case 2:
			Home1.home();
			break;
		case 3:
			Home1.exit();
			break;
		default:
			Home1.home();

		}
	}
	public static void profile() {
		C.l();
		C.ct("User Name :"+Register.pname);
		C.ct("Mobile Number :"+Register.pph);
		option();

	}


	private static void showHelpSupport() {
		C.l();
		C.ct("--- Help & Support ---");
		C.ct("Need help? Web re here for you!");
		C.ct("Email Support: supportPVRS@email.com");
		C.ct("Phone Support: 1800-232-000");
		C.ct("For immediate assistance, please reach out to our support PVRS team.");

		option();
	}

	private static void showPrivacySecurity() {
		C.l();
		C.ct("--- Privacy & Security ---");
		C.ct("1. **Privacy:** We are committed to protecting your personal data. Our practices adhere to industry standards.");
		C.ct("2. **Security:** Your information is safeguarded using the latest encryption technologies and security protocols.");
		C.ct("3. **Concerns?** If you have any questions or issues related to privacy or security:");
		C.ct("Email: privacy.securityPVRS@email.com");
		C.ct("Security Hotline: 1800-232-000");
		C.ct("Our P.V.R.S team is dedicated to addressing your concerns promptly.");
		option();
	}




	

public static void map(String imagePath) {
    // Load the image as an ImageIcon
    ImageIcon imageIcon = new ImageIcon(imagePath);

    // Get the image dimensions
    int imageWidth = imageIcon.getIconWidth();
    int imageHeight = imageIcon.getIconHeight();

    // Get the screen dimensions 
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = screenSize.width;
    int screenHeight = screenSize.height;

    // Measuring the image size to screen size
    if (imageWidth > screenWidth || imageHeight > screenHeight) {
        double widthRatio = (double) screenWidth / imageWidth;
        double heightRatio = (double) screenHeight / imageHeight;
        double scale = Math.min(widthRatio, heightRatio); // Maintain aspect ratio

        int scaledWidth = (int) (imageWidth * scale);
        int scaledHeight = (int) (imageHeight * scale);

        // Measure the image size using java.awt
        java.awt.Image scaledImage = imageIcon.getImage().getScaledInstance(
            scaledWidth, scaledHeight, java.awt.Image.SCALE_SMOOTH
        );
        imageIcon = new ImageIcon(scaledImage);

        // Update dimensions for the JFrame
        imageWidth = scaledWidth;
        imageHeight = scaledHeight;
    }

    // Creating a JFrame to display the image
    JFrame frame = new JFrame("Image Viewer");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Set the frame size to image size dimensions
    frame.setSize(imageWidth, imageHeight);

    // Creating a JLabel to display the image
    JLabel imageLabel = new JLabel(imageIcon);
    imageLabel.setHorizontalAlignment(JLabel.CENTER);

    // Adding the JLabel to the frame
    frame.getContentPane().add(imageLabel, BorderLayout.CENTER);

    // placing the image to the centre of the screen
    frame.setLocationRelativeTo(null);

    // Make the frame visible
    frame.setVisible(true);
}			
}


class CC {


	static int cv() {
		Scanner sc = new Scanner(System.in);
		int inputp = 0;

		while (true) {
			try {
				inputp = sc.nextInt();
				break;
			} catch (InputMismatchException e) {

				C.ct(Colors.redbr+"Enter a valid numeric input."+Colors.RESET);
				sc.nextLine(); // Clear the invalid input from the scanner object
			}
		}
		return inputp;
	}


}
class Colors {

	static void CP(String b,String id) {


		System.out.println("\t\t\t\t\t\t\t\t\t\t"+b+Colors.whitebr+"+---------------------------------+"+Colors.breset);
		System.out.println("\t\t\t\t\t\t\t\t\t\t|"+b+"                                 "+Colors.breset+"|");
		System.out.println("\t\t\t\t\t\t\t\t\t\t|"+b+"          P V R S   METRO        "+Colors.breset+"|");
		System.out.println("\t\t\t\t\t\t\t\t\t\t|"+b+"                                 "+Colors.breset+"|");
		System.out.println("\t\t\t\t\t\t\t\t\t\t|"+b+" "+Colors.YELLOW+Colors.blink+"[CH]"+Colors.rstblink+b+Colors.whitebr+b+"                            "+Colors.breset+"|");
		System.out.println("\t\t\t\t\t\t\t\t\t\t|"+b+" "+Colors.YELLOW+Colors.blink+"[IP]"+Colors.rstblink+b+Colors.whitebr+b+"                            "+Colors.breset+"|");
		System.out.println("\t\t\t\t\t\t\t\t\t\t|"+b+"                                 "+Colors.breset+"|");
		System.out.println("\t\t\t\t\t\t\t\t\t\t|"+b+"                                 "+Colors.breset+"|");
		System.out.print("\t\t\t\t\t\t\t\t\t\t|"+b+"        "+Colors.breset);
		System.out.printf("%sID = %s       ",b, id);
		System.out.println(Colors.breset+"|");
		System.out.println("\t\t\t\t\t\t\t\t\t\t|"+b+"                                 "+Colors.breset+"|");
		System.out.println("\t\t\t\t\t\t\t\t\t\t|"+b+"                                 "+Colors.breset+"|");
		System.out.println("\t\t\t\t\t\t\t\t\t\t"+"+---------------------------------+"+Colors.RESET);
	}



	static int getOtp() {
		Random rd = new Random();
		for (int i = 0; i < 1; i++) {
			int y = rd.nextInt(999);
			int x = rd.nextInt(9);
			if (x == 0) {
				x = 1;
			}
			int a = y + x * 1000;
			return a;
		}
		return 0;
	}

	static void loading() {
		String load= ". . . . . . . . . ";
		for(int i=0; i<load.length(); i++)
		{
			System.out.print(load.charAt(i));
			sleep(150);
		}
		System.out.println();
	}

	static void sleep(int n) {
		try {
			Thread.sleep(n);
		}
		catch(InterruptedException e)
		{}
	}


	static String  phone() {
		Scanner sc =new Scanner(System.in);
		String input="";
		while (true) {
			try {
				System.out.print("ENTER PHONE NUMBER: ");
				input = sc.nextLine().replace(" ", "");
				System.out.println();
				if (input.matches("[0-9]+") && input.length() == 10 && (input.startsWith("9") || input.startsWith("8") || input.startsWith("7") || input.startsWith("6"))) {
					break;

				} else if (input.length() != 10) {
					C.ct(Colors.redbr+"Phone Number should contain 10-digits."+Colors.RESET);
				} else if(input.substring(0,1)!="9"||input.substring(0,1)!="8"||input.substring(0,1)!="7"||input.substring(0,1)!="6") {
					C.ct(Colors.redbr+"          The phone number should start with 9, 8, 7, or 6."+Colors.RESET);
				} else {
					C.ct(Colors.redbr+"Phone Number entered is Invalid."+Colors.RESET);
					C.ct(Colors.redbr+"Provide valid Phone Number."+Colors.RESET);
				}

			} catch (Exception e) {
				C.ct("Enter a valid input");
			}
		}

		return input;
	}

	static String name() {
		Scanner sc =new Scanner(System.in);
		String a="";
		while(true) {

			try {
				System.out.print("Enter USER NAME: ");
				String name = sc.nextLine();
				System.out.println();
				if (name.matches("[a-zA-Z ]+") && name.replace(" ", "").length() >= 4)
				{
					a = name;
					break;

				}
				else
				{
					C.ct(Colors.redbr+"Username should be more than 4 letters and should contain only alphabets."+Colors.RESET);
				}

			}
			catch(Exception e) {

				System.out.print("RE-ENTER A VALID NAME INPUT: ");
				sc = new Scanner(System.in);
			}
		}
		return  a;
	}



	static int  pass() {
		Scanner sc = new Scanner(System.in);
		int c=3;
		String inputp="";
		while (true) {
			try {
				if(c>0 )
				{
					System.out.print("ENTER PIN IN DIGITS: ");
					c--;
				}
				else if( c==0)
				{
					C.ct(Colors.bpurple+"A T T E M T S     T I M E O U T"+Colors.breset);
					c=0;
					Register.register();
					break;
				}
				inputp = sc.nextLine().replace(" ", "");
				System.out.println();

				if (inputp.matches("[0-9]+") && inputp.length() >= 4) {
					C.ct(Colors.YELLOW+"PIN accepted"+Colors.RESET);
					break;
				} else if (inputp.length() < 4) {
					C.ct(Colors.redbr+"The PIN must be at least 4 digits long."+Colors.RESET);
				} else {
					C.ct(Colors.redbr+"The input should only contain digits with no spaces or other characters."+Colors.RESET);
				}

			} catch (Exception e) {
				C.ct("Enter a valid numeric input.");
				sc= new Scanner(System.in);
			}
		}
		return  Integer.parseInt(inputp);
	}


	public static final String RESET = "\033[0m";  // Text Reset

	// Colors
	public static final String RED = "\033[31m";
	public static final String GREEN = "\033[32m";
	public static final String YELLOW = "\033[33m";
	public static final String BLUE = "\033[34m";
	public static final String PURPLE = "\033[35m";
	public static final String CYAN = "\033[36m";
	public static final String WHITE = "\033[37m";
	public static final String BLACK = "\u001B[30m";

	//bright colors
	static final String redbr = "\033[0;91m";
	static final String greenbr = "\033[0;92m";
	static final String whitebr = "\033[0;97m";

	//bright high intensity
	static final String redbri = "\033[1;91m";   // RED
	static final String greenbri = "\033[1;92m";
	static final String bluebri = "\033[0;94m";

	//Background colors
	static final String bwhite = "\u001B[107m";
	static String bgreen="\u001B[42m";
	static String byellow="\u001B[43m";
	static String bblue="\u001B[44m";
	static String bpurple="\u001B[45m";
	static String bcyan="\u001B[46m";
	static String change="\u001B[7m";
	static String thick="\u001B[1m";


	//background color reset
	static String breset = "\u001B[49m";

	//underline
	static final String ul = "\u001B[4m";

	//underline reset
	static final String rstul = "\u001B[24m";

	//blinking
	static final String blink="\u001B[5m";

	//reset blinking
	static final String rstblink = "\u001B[0m";

	//italic
	static final String ital = "\u001B[3m";


	static String bold="\u001B[1m";
	static String whitebg="\u001B[47m";
	static String back ="\u001B[30m";


}



class A {
	private String user ="";
	private int pass =0;
	private String ph="";

	A() {}

	A(String user, int pass,String ph) {
		this.user = user;
		this.pass = pass;
		this.ph = ph;
	}

	void setPass(int pass) {
		this.pass = pass;
	}

	void setUser(String user) {
		this.user = user;
	}
	void setPhone(String ph) {
		this.ph = ph;
	}


	int getPass() {
		return pass;
	}

	String getUser() {
		return user;
	}
	String getPhone() {
		return ph;
	}
}



class Register {
	static A obj1 = null;
	static Register reg = new Register();
	static Scanner sc = new Scanner(System.in);
	static String pname ="";
	static String pph="";
	static int ff=0;
	static void signUp() {
		C.l();
		C.ct("\t"+Colors.WHITE+Colors.bblue+"     S I G N    U P     "+Colors.RESET+Colors.breset);
		String a = Colors.name();
		pname =a;
		int    b = Colors.pass();

		String ph = Colors.phone();
		pph=ph;
		otpv(a,b,ph);               /// check the otp


	}
	static int j=2;
	static void otpv(String a, int b,String ph)
	{
		int c=3;
		int otp = Colors.getOtp();
		C.ct(Colors.YELLOW+"OTP generated: "+Colors.RESET + otp);


		String inputp="";


		while (true) {
			try {
				if(c>0 )
				{
					System.out.print("Enter current OTP: ");
					inputp = sc.next();
					c--;
				}
				else if( c==0)
				{
					C.ct(Colors.bpurple+"A T T E M T S     T I M E O U T"+Colors.breset);
					c=0;
					Register.register();
					break;
				}


				if (inputp.matches("[0-9]+") && inputp.length() == 4) {
					break;
				} else if (inputp.length() < 4) {
					C.ct(Colors.redbr+"\t   The OTP must be 4 digits long."+Colors.RESET);
				} else {
					C.ct(Colors.redbr+"\t   The input should only contain digits with no spaces or other characters."+Colors.RESET);
				}

			} catch (Exception e) {
				C.ct(Colors.redbr+"Enter a valid numeric input."+Colors.RESET);
				sc= new Scanner(System.in);
			}
		}

		int otp1 =Integer.parseInt(inputp);


		if(otp == otp1)
		{
			obj1 = new A(a,b,ph);
			C.ct(Colors.YELLOW+"OTP accepted."+Colors.RESET);
			System.out.print("\t\t\t\t\t\t\t\t\t"+Colors.bgreen+"Sign Up Successful, Please login ");
			String load= ". . . . . . . . . ";
			for(int i=0; i<load.length(); i++)
			{
				System.out.print(load.charAt(i));
				Colors.sleep(150);
			}

			System.out.println(Colors.breset+"\n");

			loginUp();
		}
		else
		{

			C.ct(Colors.redbr+"INVALID OTP.  PLEASE RE- ENTER VAILD OTP "+Colors.RESET);
			if(j>0)
			{
				j--;
				otpv(a,b,ph);

			}
			else
			{
				C.ct(Colors.bpurple+"A T T E M T S     T I M E O U T"+Colors.breset);
				j=2;
				Register.register();
			}


		}
	}
	static String loginUp() {
		C.l();
		C.ct("\t"+Colors.WHITE+Colors.bblue+"     L O G I N     "+Colors.RESET+Colors.breset);
		String a = Colors.name();

		int b1 = Colors.pass();
		ff=b1;

		if (obj1== null) {
			C.ct(Colors.redbr+"  No user found. Please sign up first."+Colors.RESET);
			signUp();
		}
		else if (obj1.getUser().equalsIgnoreCase(a) && obj1.getPass() == b1) {
			System.out.print("\t\t\t\t\t\t\t\t\t"+Colors.bgreen);
			String load= ". . . . . . . . . ";
			for(int i=0; i<load.length(); i++)
			{
				System.out.print(load.charAt(i));
				Colors.sleep(150);
			}

			System.out.print("Login successfull");
			for(int i=0; i<load.length(); i++)
			{
				System.out.print(load.charAt(i));
				Colors.sleep(150);
			}
			System.out.println(Colors.breset+"\n \n \n \n ");
			Home1.home();
		}
		else {
			C.ct(Colors.redbr+"Invalid Username or PIN"+Colors.RESET+"\n \n");

			C.l();
			C.ct(Colors.WHITE+"PRESS 1 FOR SIGN UP    "+Colors.RESET);
			System.out.println();
			C.ct(Colors.WHITE+"PRESS 2 FOR LOGIN AGAIN"+Colors.RESET);
			System.out.println();
			C.ct(Colors.WHITE+"PRESS 3 FOR FORGOT PIN "+Colors.RESET);
			System.out.println();
			C.ct(Colors.redbr + "\tPRESS 4 FOR EXIT" +Colors.RESET);
			System.out.println();


			int l = CC.cv();

			switch (l) {
			case 1:
				signUp();
				break;
			case 2:
				loginUp();
				break;
			case 3:
				forgotPassword(b1,0);
				break;
			case 4:
				Home1.exit();
				break;
			default:
				C.ct(Colors.redbr+"Invalid Input"+Colors.redbr);
				Home1.home();

			}

		}
		return a;

	}

	static void register()
	{	C.l();
		C.ct(Colors.WHITE+"PRESS 1 FOR SIGN UP " +Colors.RESET);
		System.out.println();
		C.ct(Colors.WHITE+"PRESS 2 FOR LOGIN   " +Colors.RESET);
		System.out.println();
		C.ct(Colors.redbr+"PRESS 3 FOR FOR EXIT" +Colors.RESET);


		int l = CC.cv();
		switch (l)
		{
		case 1:
			signUp();
			break;
		case 2:
			loginUp();
			break;
		case 3:
			Home1.exit();
			break;
		default:
			C.ct(Colors.redbr+"Invalid Input"+Colors.RESET);
			register();
		}
	}

	static void forgotPassword(int b1,int v)
	{

		Scanner sc =new Scanner(System.in);

		String phn=Colors.phone();
		if (phn.equals(obj1.getPhone()))
		{
			C.ct(Colors.YELLOW+"\tYou can reset your password."+Colors.RESET);
			int bb=Colors.pass();
			if(bb!=b1)
			{
				obj1.setPass(bb);
				if(v==0)
				{
					C.cto(Colors.byellow+"PLEASE LOGIN");
					String load= ". . . . . . . . . ";
					for(int i=0; i<load.length(); i++)
					{
						System.out.print(load.charAt(i));
						Colors.sleep(150);
					}

					System.out.println(Colors.breset+"\n");

					Register.loginUp();
				}
				C.ct(Colors.YELLOW+"PASSWORD CHANGED SUCCESSFULLY"+Colors.RESET);
			}
			else
			{
				C.ct(Colors.RED+"\n PIN should be different from previous PIN "+Colors.RESET);
				C.ct(" Give a new PIN \n"+Colors.RESET);

				forgotPassword(b1,v);
			}
		}
		else {
			C.ct(Colors.RED+" Phone Number entered is incorrect. Please try again."+Colors.RESET);

		}
		if(v==0)
		{	C.l();
			System.out.println("1.LOGIN \n 2.SIGNIN\n 3.TRY AGAIN\n "+Colors.redbr+"ENTER ANY NO. FOR EXIT"+Colors.RESET);


			int l1 = CC.cv();

			switch (l1)
			{
			case 1:
				loginUp();
				break;
			case 2:
				signUp();
				break;
			case 3:
				forgotPassword(b1,0);
				break;
			default:
				Home1.exit();
			}

		}
		else
		{
			Set.option();
		}

	}
}





class Image {
    public static void image(int numFrames,ArrayList<String> ticketid) {
        // Directory where your images are stored
        String directoryPath = "C:/Users/hp/OneDrive/Desktop/MINI PROJECT/JAVA PROJECT/qr_dataset";  // Get all image files from the directory
        File dir = new File(directoryPath);
        File[] imageFiles = dir.listFiles((d, name) -> name.toLowerCase().endsWith(".png") ||name.toLowerCase().endsWith(".jpg") ||name.toLowerCase().endsWith(".jpeg"));
        
        // Check if the directory is empty or not
        if (imageFiles == null || imageFiles.length == 0) {
            C.ct("No images found in the specified directory.");
            return;
        }

        // Create and display the given number of frames
        Random random = new Random();
        for (int i = 0; i < numFrames; i++) {
            // Select a random image for each frame
            File randomImageFile = imageFiles[random.nextInt(imageFiles.length)];
            displayImage(randomImageFile,ticketid.get( i)); // Pass the frame number for unique titles
        }
    }

    private static void displayImage(File imageFile, String i) {
        // Create a JFrame to display the image
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("METRO QR ID ->" + i);

        // Load the image
        ImageIcon imageIcon = new ImageIcon(imageFile.getAbsolutePath());
        JLabel label = new JLabel(imageIcon);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        // Set frame size and display it
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}


interface HolidayCard {
	String newCard(String i,String n,String p);
}
interface GreenCard {
	String newCard(String i,String n,String p);
}






class Card implements  HolidayCard,GreenCard   {


	static Scanner sc=new Scanner(System.in);
	static String a1;
	static String a2;


	static String num() {

		String input2 = Colors.phone();
		return 	input2.substring(input2.length() - 4);

	}
	static String name() {

		String un=Colors.name();
		un=un.toUpperCase();
		return  un.substring(0,4);
	}

	public String newCard(String i,String n,String p)
	{
		String s=i+n+p+Random1.randomNumber();
		return s;
	}


}
class Random1 {
	static String randomNumber() {
		Random random = new Random();

		// it generates a random two-digit number
		int twoDigitNumber = 10 + random.nextInt(90); // Generates a number between 10 and 99

		// it generates two random alphabets
		char randomAlphabet1 = (char) ('A' + random.nextInt(26));
		char randomAlphabet2 = (char) ('A' + random.nextInt(26));
		String combination = "" + randomAlphabet1 + randomAlphabet2 + twoDigitNumber;

		return combination;
	}
}



class TicketCost  extends Home1 {
	static void cost()
	{	C.l();
		Scanner sc=new Scanner(System.in);
		C.ct(Colors.bblue+"          METRO STATIONS LIST          "+Colors.breset+"\n");
		C.ct("     "+Colors.byellow+Colors.BLACK+"_____1->Miyapur_____________"+Colors.breset);
		C.ct(Colors.byellow+"_____2->J.N.T.U College_____"+Colors.breset);
		C.ct(Colors.byellow+"_____3->K.P.H.B_____________"+Colors.breset);
		C.ct(Colors.byellow+"_____4->Kukatpally__________"+Colors.breset);
		C.ct(Colors.byellow+"_____5->Balanagar___________"+Colors.breset);
		C.ct(Colors.byellow+"_____6->Moosapet____________"+Colors.breset);
		C.ct(Colors.byellow+"_____7->Erragada____________"+Colors.breset);
		C.ct(Colors.byellow+"_____8->S.R Nagar___________"+Colors.breset);
		C.ct(Colors.byellow+"_____9->Ameerpet____________"+Colors.breset);
		C.ct(Colors.byellow+"_____10->Uppal______________"+Colors.breset);
		C.ct(Colors.byellow+Colors.breset+Colors.RESET);
		C.ct(Colors.YELLOW+"0. HOME"+Colors.RESET);
		C.ct(Colors.RED+"99. EXIT"+Colors.RESET);
		C.ct(Colors.CYAN+"999. BACK"+Colors.RESET);
		System.out.print("ENTER FROM = ");
		int from=CC.cv();
		System.out.println();
		if((from<1||from>10) && (from!=0 && from!=99 && from!=999)) {
			C.ct(Colors.redbr+"INVALID STATION NO."+Colors.RESET);
			cost();
		}
		else if(from == 0 || from == 99 || from == 999)
		{
			int to=1;
			FROM(from,to);
		}
		else {
			System.out.print("ENTER TO = ");
			int to=CC.cv();
			System.out.println();
			if((to<1||to>10)&&(to!=0 && to!=99 && to!=999)) {
				C.ct("INVALID STATION NO.");
				cost();
			}
			else {
				int amt=FROM(from,to);
				String a[] = {"Miyapur","J.N.T.U College","K.P.H.B","Kukatpally","Balanagar","Moosapet","Erragada"," S.R Nagar","Ameerpet","Uppal"};
				String from1 = a[from-1];
				String to1 = a[to-1];
				C.ct("\t\t"+Colors.bblue+"   T I C K E T     B I L L   "+Colors.breset+"\n");
				double pay = Ticketid.ticketBill(amt,from1,to1);
				

				System.out.println(Colors.bblue+"TICKET IDs"+Colors.breset+"\n");
				ArrayList<String> myNumbers = Ticketid.ticd(n1);
				Image.image(n1,myNumbers);
				Payment.upi(pay,4);
				returnHome();
			}
		}

	}
	static void returnHome()
	{	C.l();
		C.ct("\t"+Colors.YELLOW+"Press 1 For HOME" + Colors.RESET);
		C.ct("\t"+Colors.RED+ "Press 0 FOR EXIT" +Colors.RESET);
		int v =CC.cv();
		if(v==1)
			Home1.home();
		else
			Home1.exit();
	}

	static void thanks()
	{	C.l();
		C.ct(Colors.greenbri+"...........      T H A N K - Y O U  F O R   Y O U R  B O O K I N G       ...........\n \n \n");
		C.ct(Colors.greenbri+"...........      H A V  E  A   N I C E   D A Y                ...........\n \n \n \n \n  \n \n ");
		returnHome();

	}


	static int n1=1;
	static int FROM(int from,int to) {

		int ss =10;
		if(from==0||to==0)
		{
			Home1.home();
		}
		else if(from==99||to==99)
		{
			Home1.exit();
		}
		else if(from==999||to==999)
		{
			cost();
		}
		else if(from!=0||from!=99||from!=999||to!=0||to!=99||to!=999)
		{
			System.out.print("NUMBER OF TICKETS = ");

			int nt=CC.cv();
			System.out.println();
			if(nt>1) {
				n1=nt;
			}

			if(from==to) {
				C.ct(Colors.redbr+"CHANGE FROM STATION OR TO STATION "+Colors.RESET);
				cost();
			}

			else {

				ss=Math.abs((price(to)-price(from)))*n1*5;

			}
		}
		return ss;

	}
	static int price(int num) {
		int price=0;
		switch (num) {
		case 1:
			price = 1;
			break;
		case 2:
			price = 2;
			break;
		case 3:
			price = 3;
			break;
		case 4:
			price = 4;
			break;
		case 5:
			price = 5;
			break;
		case 6:
			price = 6;
			break;
		case 7:
			price = 7;
			break;
		case 8:
			price = 8;
			break;
		case 9:
			price = 9;
			break;
		case 10:
			price = 10;
			break;
		default:
			price = 0;
			break;
		}
		return price;
	}
}








class Ticketid {

	static   ArrayList<String> ticket_ALL = new ArrayList<>();

	static Time t = new Time();
	static void Thistory()
	{
		System.out.println("\t"+Colors.bblue+"   Ticket  history   "+Colors.breset+"\n");
		boolean ans = ticket_ALL.isEmpty();
		if (ans == true)
			C.ct(Colors.redbr+"NO HISTORY FOUND"+Colors.breset);
		else {

			for (String item :  ticket_ALL)
			{
				System.out.println("=>"+item);
			}
		}
		Set.option();
	}
	static int search(String ticksec, ArrayList<String> ticketid)
	{
		Collections.sort(ticketid);
		int index =Collections.binarySearch(ticketid,ticksec);
		return index;

	}
	static String rec(ArrayList<String>ticketid) {

		String ticksec=t.timeid();
		if (search(ticksec, ticketid) >=0) {
			return rec(ticketid);
		}
		else {
			return ticksec;
		}
	}

	public static ArrayList<String> ticd(int n1) {
		ArrayList<String> ticketid = new ArrayList<>();
		String dt=Time.dATE();
		ticket_ALL.add(dt);
		ticket_ALL.add("->");

		for(int i =1; i<=n1; i++)
		{
			ticketid.add(rec(ticketid));
		}

		for (String item :  ticketid)
		{
			System.out.println(Colors.CYAN+" => "+Colors.RESET+item);
		}
		ticket_ALL.addAll(ticketid);
		ticket_ALL.add(" ");
		System.out.print("\n\n\n\n");

		return ticketid;

	}
	static double ticketBill(int amt,String f,String t)
	{
		System.out.println("\t\t\t\t\t\t\t"+Colors.change + "\t\t" + "                      Ticket Details                        " + Colors.RESET);
		System.out.println("\t\t\t\t\t\t\t"+Colors.change + "\t\t" + "------------------------------------------------------------" + Colors.RESET);
		System.out.printf("\t\t\t\t\t\t\t"+Colors.change + "\t\t"+ " DATE  - %-51s" + Colors.RESET + "\n", Time.dATE());
		System.out.printf("\t\t\t\t\t\t\t"+Colors.change + "\t\t" + " FROM  -> %-50s" + Colors.RESET + "\n", f);
		System.out.printf("\t\t\t\t\t\t\t"+Colors.change + "\t\t" + " TO    -> %-50s" + Colors.RESET + "\n", t);
		System.out.println("\t\t\t\t\t\t\t"+Colors.change + "\t\t" + "------------------------------------------------------------" + Colors.RESET);
		System.out.printf("\t\t\t\t\t\t\t"+Colors.change + "\t\t" + " Amount  -> %s%-46s" + Colors.RESET + "\n", amt, "/-");
		System.out.println("\t\t\t\t\t\t\t"+Colors.change + "\t\t" + "------------------------------------------------------------" + Colors.RESET);
		System.out.println("\t\t\t\t\t\t\t"+Colors.RESET);


		return amt;

	}
}





class Time {

	static  Random1 r1 = new Random1();
	static String timeid()
	{
		LocalDate ldt =LocalDate.now();
		int year = ldt.getYear();
		int day = ldt.getDayOfMonth();
		String sday = Integer.toString(day);
		String  week = ldt.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
		if(day%10==1)
			sday+="st";
		else if(day%10==2)
			sday+="nd";
		else
			sday+="th";
		String month = ldt.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());

		LocalTime tm = LocalTime.now();
		String time = tm.toString();
		int hrs = Integer.parseInt(time.substring(0, 2));
		int min=Integer.parseInt(time.substring(3, 5));
		String ampm = (hrs>=12)?"PM":"AM";
		if(hrs>=13)
			hrs = hrs-12;
		time = Integer.toString(hrs)+time.substring(2,5)+" "+ampm;
		String s=hrs+""+min+""+r1.randomNumber()+""+hrs+""+(min+10);
		return (s);
	}
	static String dATE() {
		LocalDate ldt =LocalDate.now();
		int year = ldt.getYear();
		int day = ldt.getDayOfMonth();
		String sday = Integer.toString(day);
		String  week = ldt.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
		if(day%10==1)
			sday+="st";
		else if(day%10==2)
			sday+="nd";
		else
			sday+="th";
		String month = ldt.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());

		LocalTime tm = LocalTime.now();
		String time = tm.toString();
		int hrs = Integer.parseInt(time.substring(0, 2));
		int min=Integer.parseInt(time.substring(3, 5));
		time = Integer.toString(hrs)+time.substring(2,5);
		String DATE=time+" "+week+" "+sday+" "+month+" "+year;
		return (DATE);

	}

}




class Recharge
{
	static Scanner sc=new Scanner(System.in);
	static double WalletBalance=100;
	static double GCbalance=50;
	static double HCbalance=0;

	public static boolean isVID(String id) {

		if (id.length() != 12) {
			return false;
		}
		String part1 = id.substring(0, 4);
		String part2 = id.substring(4, 8);
		String part3 = id.substring(8, 10);
		String part4 = id.substring(10, 12);

		if (!part1.matches("[A-Z]{4}")) {
			return false;
		}
		if (!part2.matches("\\d{4}")) {
			return false;
		}
		if (!part3.matches("[A-Z]{2}")) {
			return false;
		}
		if (!part4.matches("\\d{2}")) {
			return false;
		}

		return true;
	}

	static void greencard()
	{	C.l();
		System.out.print("Enter card ID (e.g-[ "+Colors.redbr+"A"+Colors.greenbri+"BCDE"+Colors.bluebri+"1234"+Colors.greenbri+"FG"+Colors.bluebri+"56"+Colors.RESET+" ] ): ");
		String id=sc.next();
		System.out.println();
		char id1=id.charAt(0);
		String id2=id.substring(1,id.length());

		if( isVID(id2))
		{
			if(id1=='G') GCrecharge();
			else {
				C.ct(Colors.RED+"INVALID CARD ID. RE-ENTER THE ID\n"+Colors.RESET);
				System.out.println("1.RENETER \n "+Colors.YELLOW+"2.HOME"+Colors.RESET+" \n 3.RECHARGE HOME \n"+Colors.redbr+" EXIT"+Colors.RESET);
				int l = CC.cv();


				switch (l) {
				case 1:
					greencard();
					break;
				case 2:
					Home1.home();
					break;
				case 3:
					Recharge.home();
					break;
				default:
					Home1.exit();

				}
			}
		}
		else {
			C.ct(Colors.RED+"INVALID CARD ID. RE-ENTER THE ID\n"+Colors.RESET);
			System.out.println("1.RENETER \n "+Colors.YELLOW+"2.HOME "+Colors.RESET+"\n 3.RECHARGE HOME \n "+Colors.redbr+" EXIT"+Colors.RESET);

			int l = CC.cv();

			switch (l) {
			case 1:
				greencard();
				break;
			case 2:
				Home1.home();
				break;
			case 3:
				Recharge.home();
				break;
			default:
				C.ct(Colors.redbr+"INVALID INPUT"+Colors.RESET);
				Home1.exit();
			}
		}
	}
	static void GCrecharge()
	{	C.l();
		System.out.println("\n ENTER A KEY ");
		System.out.println("1. CHECK CARD BALANCE");
		System.out.println("2. CARD RECHARGE");
		System.out.println(Colors.CYAN+"0. GO BACK "+Colors.RESET);
		int r=CC.cv();
		if(r==1)
		{
			C.ct(Colors.YELLOW+"Your card Balance is "+Colors.RESET+GCbalance);
			C.cto(Colors.GREEN+"Enter any key to go back"+Colors.RESET);
			sc.next();
			GCrecharge();
		}
		else if(r==2)
		{
			System.out.print("Enter Amount: ");
			double amt=CC.cv();
			System.out.println();
			Payment.upi(amt,1);
		}
		else if(r==0) home();
		else
		{
			C.ct(Colors.redbr+"INVALID INPUT"+Colors.RESET);
			GCrecharge();
		}
	}
	static void holidaycard()
	{	C.l();
		System.out.print("Enter card ID (e.g-[ "+Colors.redbr+"A"+Colors.greenbri+"BCDE"+Colors.bluebri+"1234"+Colors.greenbri+"FG"+Colors.bluebri+"56"+Colors.RESET+" ] ): ");
		String id=sc.next();
		System.out.println();
		char id1=id.charAt(0);
		String id2=id.substring(1,id.length());
		if( isVID(id2)) {
			if(id1=='H') HCrecharge();
			else {

				C.ct(Colors.RED+"INVALID CARD ID. RE-ENTER THE ID\n"+Colors.RESET);
				C.ct("1.RE-ENETER\n"+Colors.YELLOW+"2.HOME \n"+Colors.redbr+"EXIT"+Colors.RESET);
				int l = CC.cv();

				switch (l) {
				case 1:
					holidaycard();
					break;
				case 2:
					Home1.home();
					break;
				case 3:
					Recharge.home();
					break;
				default:
					C.ct(Colors.redbr+"INVALID INPUT"+Colors.redbr);
					Home1.exit();

				}
			}
		}
		else {

			C.ct(Colors.RED+"INVALID CARD ID"+Colors.RESET);
			System.out.println("1.RENETER ");
			System.out.println(Colors.YELLOW+"2.HOME "+Colors.RESET);
			System.out.println(Colors.redbr+" EXIT"+Colors.RESET);
			int l = CC.cv();
			switch (l) {
			case 1:
				holidaycard();
				break;
			case 2:
				Home1.home();
				break;
			case 3:
				Recharge.home();
				break;
			default:
				C.ct(Colors.redbr+"INVALID INPUT"+Colors.RESET);
				Home1.exit();
			}
		}
	}
	static void HCrecharge( )
	{	C.l();
		System.out.println("\n ENTER A KEY ");
		System.out.println("1. CHECK CARD BALANCE");
		System.out.println("2. CARD RECHARGE");
		System.out.println(Colors.CYAN+"0: go Back "+Colors.RESET);
		int r=CC.cv();
		if(r==1)
		{
			C.ct(Colors.YELLOW+"Your card Balance is "+Colors.RESET+HCbalance);
			System.out.println("Enter any CHARACTER to go back");
			sc.next();
			HCrecharge();
		}
		else if(r==2)
		{
			System.out.println(Colors.YELLOW+"Recharge of Rs. 60/-"+Colors.RESET);
			double amt=60;
			Payment.upi(amt,2);
		}
		else if(r==0) home();
		else
		{
			C.ct(Colors.redbr+"INVALID INPUT"+Colors.RESET);
			HCrecharge();
		}
	}

	static void WALBAL()
	{
		C.ct(Colors.YELLOW+"Your Wallet Balance is "+Colors.RESET+WalletBalance);
		System.out.println(Colors.CYAN+"\n Press any number to go Back "+Colors.RESET);
		CC.cv();
		Wallet();

	}
	static void Wallet()
	{
		System.out.println("ENTER A KEY");
		System.out.println("1. Check Balance ");
		System.out.println("2. Wallet Recharge ");
		System.out.println(Colors.CYAN+"0. Go Back  "+Colors.RESET);
		int r=CC.cv();

		if(r==1)
		{
			WALBAL();
		}
		else if(r==2)
		{
			System.out.print("Enter Amount: ");
			double amt=CC.cv();
			Payment.walletRecharge(amt,0);
		}
		else if(r==0)
		{
			home();
		}
		else
		{
			C.ct(Colors.redbr+"INVALID INPUT"+Colors.RESET);
			Wallet();
		}

	}
	static void home()
	{	C.l();
		System.out.println("1. GREENCARD ");
		System.out.println("2. HOLIDAY CARD");
		System.out.println("3. WALLET ");
		System.out.println(Colors.YELLOW+"0. HOME"+Colors.RESET);

		int i=CC.cv();
		switch(i)
		{
		case 1:
			greencard();
			break;
		case 2:
			holidaycard();
			break;
		case 3:
			Wallet();
			break;
		case 0:
			Home1.home();
			break;
		default:
			C.ct(Colors.redbr+"Enter Valid Input"+Colors.RESET);
			home();
		}
	}
	static void rech()
	{	C.l();
		C.ct(Colors.bblue+" R E C H A R G E "+Colors.breset);
		home();
	}


}


class Payment
{
	static void walletRecharge(double amt, int w)
	{	C.l();
		C.ct("\t"+Colors.WHITE+Colors.bblue+"     W A L L E T      P A Y M E N T     "+Colors.RESET+Colors.breset);
		System.out.println("1. "+Colors.BLUE+"Pay"+Colors.CYAN+"TM"+Colors.RESET);
		System.out.println("2. "+Colors.PURPLE+"PhonePe "+Colors.RESET);
		System.out.println("3. "+Colors.RED+"G "+Colors.YELLOW+"P"+Colors.GREEN+"a"+Colors.BLUE+"y"+Colors.RESET);
		System.out.println("0. "+Colors.CYAN+"go Back"+Colors.RESET);
		int d=CC.cv();
		switch(d)
		{
		case 1:
			payTm(amt,w);
			break;
		case 2:
			phonePe(amt,w);
			break;
		case 3:
			gPay(amt,w);
			break;
		case 0:
			Recharge.Wallet();
			break;
		default :
			C.ct(Colors.redbr+"INVALID INPUT"+Colors.RESET);
			C.ct("PLEASE ENTER VALUES FROM THE GIVEN OPTIONS ");
			walletRecharge(amt,w);
		}
	}

	static void upi(double amt,int w)
	{	C.l();
		C.ct("\t"+Colors.WHITE+Colors.bblue+"     U P I     P A Y M E N T S     "+Colors.RESET+Colors.breset);
		System.out.println("1. "+Colors.BLUE+"Pay"+Colors.CYAN+"TM"+Colors.RESET);
		System.out.println("2. "+Colors.PURPLE+"PhonePe "+Colors.RESET);
		System.out.println("3. "+Colors.RED+"G "+Colors.YELLOW+"P"+Colors.GREEN+"a"+Colors.BLUE+"y"+Colors.RESET);
		System.out.println("4. "+Colors.greenbri+"Wallet"+Colors.RESET);
		System.out.println("0. "+Colors.CYAN+"Go Back"+Colors.RESET);
		int d=CC.cv();

		if(d==1) payTm(amt,w);
		if(d==2) phonePe(amt,w);
		if(d==3) gPay(amt,w);
		if(d==4)
		{
			if(w==0) Wallet(amt,0);
			else Wallet(amt,4);
		}
		if(d==0)
		{
			if(w==1)Recharge.GCrecharge();
			if(w==2) Recharge.HCrecharge();
			if(w==0) Recharge.Wallet();
			if(w==4)
			{
				TicketCost.cost();
			}

		}
	}
	static void Wallet(double n, int w)
	{
		C.ct("\t"+Colors.WHITE+Colors.bblue+"     M E T R O     W A L L E T     "+Colors.RESET+Colors.breset);
		if(Recharge.WalletBalance>=0&&Recharge.WalletBalance-n>=0)
		{

			if(w==1)
			{
				Recharge.GCbalance=Recharge.GCbalance+n;
				Recharge.WalletBalance=Recharge.WalletBalance-n;
			}
			else if(w==2)
			{
				Recharge.HCbalance=Recharge.HCbalance+n;
				Recharge.WalletBalance=Recharge.WalletBalance-n;
			}
			else Recharge.WalletBalance=Recharge.WalletBalance-n;
			C.ct("  \u001b[32;1mYour Transaction is Completed Successfully \u001b[00;1m\n\n");
			TicketCost.returnHome();
		}
		else
		{
			Recharge.WalletBalance=Recharge.WalletBalance+n;
			C.ct("\n Your Wallet Balance is "+Recharge.WalletBalance+". Wallet Balance is not sufficient for Transaction \n PLEASE RECHARGE YOUR WALLET \nTransaction Terminated \n");
			if(w!=4) Recharge.home();
			else upi(n,w);
		}

	}
	static void payTm(double n,int w)
	{	C.l();
		System.out.println("\n "+Colors.whitebg+Colors.BLUE+"Pay"+Colors.CYAN+"TM"+Colors.RESET+Colors.breset);
		System.out.println("\nSelect Bank\n"+Colors.bluebri+"1.Apparao Bank"+Colors.RESET+"\n"+Colors.greenbri+"2.Subbarao Bank"+Colors.RESET+"\n"+Colors.redbri+"3.Cancel Payment"+Colors.RESET);
		int a=CC.cv();
		if(a==1)
		{
			Apparao.ApparaoBank(n,w);
		}
		else if(a==2)
		{
			subbarao.subbarao(n,w);
		}
		else if(a==3)
		{
			if(w!=4) Recharge.home();
			else TicketCost.cost();
		}
		else
		{
			C.ct("\n  \u001b[31;1mINVALID INPUT\n\u001b[00;1m");
			payTm(n,w);
		}
	}
	static void phonePe(double n,int w)
	{	C.l();
		System.out.println("\n"+Colors.whitebg+Colors.PURPLE+"PhonePe"+Colors.RESET+Colors.breset);
		System.out.println("\nSelect Bank\n1. "+Colors.bluebri+"Apparao Bank"+Colors.RESET+"\n2. "+Colors.greenbri+"Subbarao Bank"+Colors.RESET+"\n3. "+Colors.redbri+"Cancel Payment"+Colors.RESET);
		int a=CC.cv();
		if(a==1)
		{
			Apparao.ApparaoBank(n,w);
		}
		else if(a==2)
		{
			subbarao.subbarao(n,w);
		}
		else if(a==3)
		{
			if(w!=4) Recharge.home();
			else TicketCost.cost();
		}
		else
		{
			C.ct("\n  \u001b[31;1mINVALID INPUT\n\u001b[00;1m");
			phonePe(n,w);
		}
	}
	static void gPay(double n,int w)
	{	C.l();
		System.out.println("\n"+Colors.whitebg+Colors.RED+"G "+Colors.YELLOW+"P"+Colors.GREEN+"a"+Colors.BLUE+"y"+Colors.RESET+Colors.breset);
		System.out.println("\nSelect Bank\n"+Colors.bluebri+"1.Apparao Bank"+Colors.RESET+"\n"+Colors.greenbri+"2.Subbarao Bank"+Colors.RESET+"\n"+Colors.redbri+"3.Cancel Payment"+Colors.RESET);
		int a=CC.cv();
		if(a==1)
		{
			Apparao.ApparaoBank(n,w);
		}
		else if(a==2)
		{
			subbarao.subbarao(n,w);
		}
		else if(a==3)
		{
			if(w!=4) Recharge.home();
			else TicketCost.cost();
		}
		else
		{
			C.ct("\n  \u001b[31;1mINVALID INPUT\n\u001b[00;1m");
			gPay(n,w);
		}
	}
}


class Apparao
{
	static int c=0,c1=3;
	static Apparao u1=new Apparao();
	private int mpin=654321;
	private int card=9876;
	static double Balance=10000;

	static void ApparaoBank(double n,int w)
	{
		if(c<c1)
		{
			System.out.println("\n1.Check Balance\n2.Go to payment\n"+Colors.CYAN+"3.Go Back"+Colors.RESET);
			int a=CC.cv();
			if(a==1)
			{
				u1.checkBal(n,w);

			}
			else if(a==2)
			{
				u1.payment(n,w);

			}
			else if(a==3)
			{
				if(w!=0)Payment.upi(n,w);
				else Payment.walletRecharge(n,w);
			}
			else
			{
				C.ct("\n  \u001b[31;1mINVALID INPUT\n\u001b[00;1m");
				ApparaoBank(n,w);
			}
		}
		else
		{
			C.ct("\n  \u001b[31;1mToo Many incorrect attempts try after sometime ");
			Home1.home();
		}

	}
	void payment(double n,int w)
	{
		if(c<c1)
		{
			C.cto("\n  Enter 6 Digit Mpin for "+Colors.bluebri+"Apparao Bank"+Colors.RESET+": ");
			int mpin=CC.cv();
			System.out.println();
			if(mpin>99999 && mpin<999999)
			{
				if(mpin==this.mpin)
				{

					if(Balance>=0&&Balance-n>=0)
					{
						if(w==0)
						{
							Recharge.WalletBalance=Recharge.WalletBalance+n;
							Balance=Balance-n;
						}
						else if(w==1)
						{
							Recharge.GCbalance=Recharge.GCbalance+n;
							Balance=Balance-n;
						}
						else if(w==2)
						{
							Recharge.HCbalance=Recharge.HCbalance+n;
							Balance=Balance-n;
						}
						else Balance=Balance-n;
						C.ct("\n  \u001b[32;1mYour transaction is Completed Successfully \u001b[00;1m\n\n  ");
						if(w!=4) Recharge.home();
						else 	TicketCost.returnHome();
					}
					else
					{
						C.ct("\n"+Colors.bluebri+"Apparao Bank"+Colors.RESET  +"Insufficient Funds\n\n  The money in your account is not enough for this payment\n");
						Balance=Balance+n;
						back(n,w);
					}

				}
				else
				{
					c++;
					C.ct("\n  \u001b[97;41;1mIncorrect mpin attempt "+c+" out of "+c1+" , Try again\u001b[00;1m\n");
					tryAgain1(n,w);
				}
			}
			else
			{
				C.ct("\n  \u001b[31;1mMPIN must contain 6 digits\n\u001b[00;1m");
				tryAgain1(n,w);
			}
		}
		else
		{
			C.ct("\n  \u001b[31;1mToo Many incorrect attempts. Choose another payment mode.");
			Payment.upi(n,w);
		}
	}
	static void tryAgain1(double n,int w)
	{
		if(c<c1)
		{
			C.ct("\n  1.Try again\n  2.Forgotpin\n  "+Colors.CYAN+"3.go Back"+Colors.RESET);
			int a=CC.cv();
			if(a==1)
			{
				u1.payment(n,w);
			}
			else if(a==2)
			{
				u1.forgotMpin(n,w);
			}
			else if(a==3)
			{
				u1.ApparaoBank(n,w);
			}
			else
			{
				C.ct("\n  \u001b[31;1mInvalid Input\u001b[00;1m\n");
				tryAgain1(n,w);
			}
		}
		else
		{
			C.ct("\n  \u001b[31;1mToo Many incorrect attempts try after some time ");
			Payment.upi(n,w);
		}
	}
	void checkBal(double n, int w)
	{
		if(c<c1)
		{
			C.cto("\n  Enter 6 Digit Mpin for "+Colors.bluebri+"Apparao Bank"+Colors.RESET+"\n");
			int mpin=CC.cv();
			if(mpin>99999 && mpin<999999)
			{
				if(mpin==this.mpin)
				{
					C.ct("\n  \u001b[32;1mAvailable Balance fetched successfully\u001b[00;1m\n\n      "+Apparao.Balance+"/-\n");
					back(n,w);
				}
				else
				{
					c++;
					C.ct("\n  \u001b[97;41;1mIncorrect mpin attempt "+c+" out of "+c1+" , Try again\u001b[00;1m\n");
					tryAgain(n,w);
				}
			}
			else
			{
				C.ct("\n  \u001b[31;1mMPIN must contain 6 digits\n\u001b[00;1m");
				tryAgain(n,w);
			}
		}
		else
		{
			C.ct("\n  \u001b[31;1mToo Many incorrect attempts try after sometime. ");
			Payment.upi(n,w);
		}
	}
	void back(double n, int w)
	{
		if(c<c1)
		{
			System.out.println(Colors.CYAN+"1.go Back"+Colors.RESET);
			int a=CC.cv();
			if(a==1)
			{
				ApparaoBank(n,w);
			}
			else
			{
				C.ct("\n  \u001b[31;1mEnter Valid input\u001b[00;1m");
				back(n,w);
			}
		}
		else
		{
			C.ct("\n  \u001b[31;1mToo Many incorrect attempts try some time ");
			Payment.upi(n,w);
		}
	}
	static void tryAgain(double n, int w)
	{
		if(c<c1)
		{
			System.out.println("\n1.Try again\n2.Forgotpin\n"+Colors.CYAN+"3.go Back"+Colors.RESET);
			int a=CC.cv();
			if(a==1)
			{
				u1.checkBal(n,w);
			}
			else if(a==2)
			{
				u1.forgotMpin(n,w);
			}
			else if(a==3)
			{
				u1.ApparaoBank(n,w);
			}
			else
			{
				System.out.println("\n  \u001b[31;1mInvalid Input\u001b[00;1m\n");
				tryAgain(n,w);
			}
		}
		else
		{
			System.out.println("\n  \u001b[31;1mToo Many incorrect attempts try some time ");
			Payment.upi(n,w);
		}
	}
	void forgotMpin(double n, int w)
	{
		if(c<c1)
		{
			System.out.println("\n  Enter debit card number of last 4 digits");
			int card=CC.cv();
			if(card==this.card)
			{
				pinValid(n,w);
			}
			else
			{
				System.out.println("\n  \u001b[91;1mCard Details Mismatched ! Try Again \n\u001b[00;1m");
				forgotMpin(n,w);
			}
		}
		else
		{
			System.out.println("\n  \u001b[31;1mToo Many incorrect attempts try some time");
			Payment.upi(n,w);
		}
	}
	void pinValid(double n, int w)
	{
		System.out.print("\n Enter new 6 digit mpin");
		int mpin=CC.cv();
		System.out.println();
		if(mpin>99999 && mpin<=999999)
		{
			setUmpin(mpin,w);
			u1.ApparaoBank(n,w);
		}
		else
		{
			System.out.println("\n  \u001b[31;1mpin must be 6 digits\u001b[00;1m");
			pinValid(n,w);
		}

	}
	void setUmpin(int mpin,int w)
	{
		this.mpin=mpin;
		System.out.println("\n  \u001b[32;1mYour pin for Apparao bank is Successfully Changed\u001b[00;1m");

	}
}

class subbarao
{
	static int c=0,c1=3;
	static subbarao s1=new subbarao();
	private int mpin=1234;
	private int scard=1504;
	static double Balance=4000;
	static void subbarao(double n,int w)
	{
		if(c<c1)
		{
			System.out.println("\n1.CheckBalance\n2.go to Payment\n"+Colors.CYAN+"3.go Back"+Colors.RESET);
			int a=CC.cv();
			if(a==1)
			{
				s1.checkBal(n,w);
			}
			else if(a==2)
			{
				s1.payment(n,w);
			}
			else if(a==3)
			{
				Payment.upi(n,w);
			}
			else
			{
				System.out.println("  \u001b[31;1mInvalid Input\u001b[00;1m");
				subbarao(n,w);
			}
		}
		else
		{
			System.out.println("\n  \u001b[31;1mToo Many incorrect attempts try some time ");
			Payment.upi(n,w);
		}
	}
	void payment(double n,int w)
	{
		if(c<c1)
		{
			System.out.print("\nEnter 4 Digit pin for "+Colors.greenbri+"Subbarao Bank : "+Colors.RESET);
			int mpin=CC.cv();
			System.out.println();
			if(mpin>999 && mpin<=9999)
			{
				if(mpin==this.mpin)
				{
					if(Balance>=0&&Balance-n>=0)
					{
						if(w==0)
						{
							Recharge.WalletBalance=Recharge.WalletBalance+n;
							Balance=Balance-n;
						}
						else if(w==1)
						{
							Recharge.GCbalance=Recharge.GCbalance+n;
							Balance=Balance-n;
						}
						else if(w==2)
						{
							Recharge.HCbalance=Recharge.HCbalance+n;
							Balance=Balance-n;
						}
						else Balance=Balance-n;
						System.out.println("\n  \u001b[32;1mYour transaction is Completed Successfully \u001b[00;1m\n\n  ");
						TicketCost.returnHome();

					}
					else
					{
						System.out.println("\n"+Colors.greenbri+"Subbarao Bank"+Colors.RESET+"  Insufficient Funds\n\n  The money in your account is not enough for this payment\n\u001b[00;1m");
						Balance=Balance+n;
						back(n,w);
					}
				}
				else
				{
					c++;
					System.out.println("\n  \u001b[97;41;1mIncorrect pin attempt "+c+" out of "+c1+" , Try again\u001b[00;1m\n");
					tryAgain1(n,w);
				}
			}
			else
			{
				System.out.println("\n  \u001b[31;1mpin must contain 4 digits\n\u001b[00;1m");
				tryAgain1(n,w);
			}
		}
		else
		{
			System.out.println("\n  \u001b[31;1mToo Many incorrect attempts try some time");
			Payment.upi(n,w);
		}
	}
	static void tryAgain1(double n,int w)
	{
		if(c<c1)
		{
			System.out.println("\n1.Try again\n2.Forgotpin\n"+Colors.CYAN+"3.go Back"+Colors.RESET);
			int a=CC.cv();
			if(a==1)
			{
				s1.payment(n,w);
			}
			else if(a==2)
			{
				s1.forgotMpin(n,w);
			}
			else if(a==3)
			{
				s1.subbarao(n,w);
			}
			else
			{
				System.out.println("\n  \u001b[31;1mInvalid Input\u001b[00;1m\n");
				tryAgain1(n,w);
			}
		}
		else
		{
			System.out.println("\n  \u001b[31;1mToo Many incorrect attempts try some time");
			Payment.upi(n,w);
		}
	}
	void checkBal(double n,int w)
	{
		if(c<c1)
		{
			System.out.println("\nEnter 4 Digit pin :  \n");
			int mpin=CC.cv();
			System.out.println();
			if(mpin>999 && mpin<=9999)
			{
				if(mpin==this.mpin)
				{
					System.out.println("\n  Available Balance fetched successfully\u001b[00;1m\n\n      "+subbarao.Balance+"/-\n");
					back(n,w);
				}
				else
				{
					c++;
					System.out.println("\n  \u001b[97;41;1mIncorrect pin attempt "+c+" out of "+c1+" , Try again\u001b[00;1m\n");
					tryAgain(n,w);
				}
			}
			else
			{
				System.out.println("\n  \u001b[31;1mPin must contain 4 digits\n\u001b[00;1m");
				tryAgain(n,w);
			}
		}
		else
		{
			System.out.println("\n  \u001b[31;1mToo Many incorrect attempts try some time ");
			Payment.upi(n,w);
		}
	}
	void back(double n,int w)
	{
		if(c<c1)
		{
			System.out.println(Colors.CYAN+"1.go Back"+Colors.RESET);
			int a=CC.cv();
			if(a==1)
			{
				subbarao(n,w);
			}
			else
			{
				System.out.println("\n  \u001b[31;1mEnter Valid input\u001b[00;1m");
				back(n,w);
			}
		}
		else
		{
			System.out.println("\n  \u001b[31;1mToo Many incorrect attempts try some time ");
			Payment.upi(n,w);
		}
	}
	static void tryAgain(double n,int w)
	{
		if(c<c1)
		{
			System.out.println("\n1.Try again\n2.Forgotpin\n"+Colors.CYAN+"3.go Back"+Colors.RESET);
			int a=CC.cv();
			if(a==1)
			{
				s1.checkBal(n,w);
			}
			else if(a==2)
			{
				s1.forgotMpin(n,w);
			}
			else if(a==3)
			{
				s1.subbarao(n,w);
			}
			else
			{
				System.out.println("\n  \u001b[31;1mInvalid Input\u001b[00;1m\n");
				tryAgain(n,w);
			}
		}
		else
		{
			System.out.println("\n  \u001b[31;1mToo Many incorrect attempts try some time ");
			Payment.upi(n,w);
		}
	}
	void forgotMpin(double n,int w)
	{
		if(c<c1)
		{
			System.out.print("\nEnter debit card number of last 4 digits : ");
			int scard=CC.cv();
			System.out.println();
			if(scard==this.scard)
			{
				pinValid(n,w);
			}
			else
			{
				System.out.println("\n  \u001b[91;1mCard Details Mismatched ! Try Again \n\u001b[00;1m");
				forgotMpin(n,w);
			}
		}
		else
		{
			System.out.println("\n  \u001b[31;1mToo Many incorrect attempts try some time ");
			Payment.upi(n,w);
		}
	}
	void pinValid(double n,int w)
	{
		System.out.print("\nEnter new 4 digit mpin : ");
		int mpin=CC.cv();
		System.out.println();
		if(mpin>999 && mpin<=9999)
		{
			setSmpin(mpin,w);
			s1.subbarao(n,w);
		}
		else
		{
			System.out.println("\n  \u001b[31;1mpin must be 4 digits\u001b[00;1m\n");
			pinValid(n,w);
		}

	}
	void setSmpin(int mpin,int w)
	{
		this.mpin=mpin;
		System.out.println("\n  \u001b[32;1mYour Mpin for "+Colors.greenbri+"Subbarao Bank"+Colors.RESET+" is Successfully Changed\u001b[00;1m");

	}
}