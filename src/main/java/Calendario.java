import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendario {
    public static void main(String[] args) throws ParseException {

        Calendar agora = Calendar.getInstance();

        System.out.println("A data atual e : " + agora.getTime());

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atras: " + agora.getTime());

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois : " + agora.getTime());

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois : " + agora.getTime());


            Calendar c = Calendar.getInstance();
            Date data = c.getTime();

            DateFormat f = DateFormat.getDateInstance(DateFormat.FULL); //Data Completa
            System.out.println("Data brasileira: "+f.format(data));

            f = DateFormat.getDateInstance(DateFormat.LONG);
            System.out.println("Data sem o dia descrito: "+f.format(data));

            f = DateFormat.getDateInstance(DateFormat.MEDIUM);
            System.out.println("Data resumida 1: "+f.format(data));

            f = DateFormat.getDateInstance(DateFormat.SHORT);
            System.out.println("Data resumida 2: "+f.format(data));
        }
    }
