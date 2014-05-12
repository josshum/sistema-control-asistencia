package pe.com.controlasistencia.util;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Validar {

    /*
     * VALIDACIONES DE CAMPOS DE SOLO NÚMEROS
     */
    public static boolean siEsSoloNro(String cadena) {
        int l = cadena.length();
        char c = ' ';
        boolean valida = true;



        for (int i = 0; i < l; i++) {
            c = cadena.charAt(i);
            if (!(Character.isDigit(c))) {
                valida = false;
            }
        }

        return (valida);

    }
    
    public static boolean esUnDatoDouble(String dato){
        boolean es_numerico = true;
        
        try{
            Double.parseDouble(dato);
        }catch(Exception ex){
            es_numerico = false;
        }
        
        return es_numerico;
 
    } 
    
    
    public static boolean esUnDatoInteger(String dato){
        boolean es_integer = true;
        
        try{
            Integer.parseInt(dato);
        }catch(Exception ex){
            es_integer = false;
        }
        
        return es_integer;
 
    }
    
    public static boolean esUnDatoFloat(String dato){
        boolean es_float = true;
        
        try{
            Float.parseFloat(dato);
        }catch(Exception ex){
            es_float = false;
        }
        return es_float;
    }
    
    
    
    

    public static boolean esVacio(String cadena) {
        return (cadena.equals(""));
    }


    /*
     * VALIDA UNA DIRECCION CORRECTA DE EMAIL MEDIANTE EXPRESIÓN REGULAR
     */
    public static boolean validarEmail(String input) {
        boolean valida = true;
        Pattern p = Pattern.compile("\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
        Matcher m = p.matcher(input);
        if (!m.find()) {
            valida = false;
        }

        return valida;


    }

    public boolean validarDni(String dni) {
        boolean valida = true;
        Pattern p = Pattern.compile("^[0-9]{8}$");
        Matcher m = p.matcher(dni);
        if (!m.find()) {
            valida = false;
        }
        return valida;
    }
    
     public boolean validarTelefono(String telf) {
        boolean valida = true;      
        Pattern p = Pattern.compile("^[2-7]{1}[0-9]{6}$");
        Matcher m = p.matcher(telf);
        if (!m.find()) {
            valida = false;
        }
        return valida;
    }
    
    public boolean validarCelular(String cel) {
        boolean valida = true;        
        Pattern p = Pattern.compile("^[9]{1}[0-9]{8}$");
        Matcher m = p.matcher(cel);
        if (!m.find()) {
            valida = false;
        }        
        return valida;
    }

    public static boolean validarVacio(String texto) {
        boolean valida = true;
        Pattern p = Pattern.compile("^\\s+$");
        Matcher m = p.matcher(texto);
        if (!m.find()) {
            valida = false;
        }
        return valida;
    }

    /*
     * VALIDACIONES DE CAMPOS DE SOLO TEXTO
     */
    public boolean validarTexto(String cadena) {
        boolean valida = true;
        Pattern p = Pattern.compile("^([A-Za-zñ\\s])+$");
        Matcher m = p.matcher(cadena);

        if (!m.find()) {
            valida = false;
        }

        return valida;
    }

    
    public static String cambiarComaPorPuntoEnCadena(String cadena){
        
       String resultado = cadena.replace(',', '.');
       return resultado;
    }
    

    public String cambiarFormatoFecha(String fecha) {
        String nuevafecha = "";
        String dia = "";
        String mes = "";
        String anho = "";

        StringTokenizer t = new StringTokenizer(fecha, "-");
        anho = t.nextToken();
        mes = t.nextToken();
        dia = t.nextToken();


        nuevafecha = dia + "/" + mes + "/" + anho;

        return nuevafecha;

    }

    /*
     * VALIDA LONGITUD MÁXIMA DEL CAMPO
     */
    public boolean validarLongitud(int longitud_max, String cadena) {

        if (cadena.length() > longitud_max) {
            return false;
        } else {
            return true;
        }
    }


    
    public String formatearFechaDeCalendario(String f) {
        String n = "";

        for (int i = 0; i < f.length(); i++) {
            if ((f.charAt(i) != '[') && (f.charAt(i) != ']')) {
                n = n + f.charAt(i);
            }
        }
        return n;

    }

    public String obtenerHorarioDeCalendario(String fecha) {
        return fecha.substring(11, 16);

    }

    public String obtenerDiaDeCalendario(String fecha) {
        return fecha.substring(0, 10);

    }

    

    public String cambiarFormatoFechaParaBD(String fecha) {  // entra dd/mm/yyyy  
        String nuevafecha = "";
        String dia = "";
        String mes = "";
        String anho = "";

        StringTokenizer t = new StringTokenizer(fecha, "/");
        dia = t.nextToken();
        mes = t.nextToken();
        anho = t.nextToken();

        nuevafecha = anho + "-" + mes + "-" + dia;

        return nuevafecha;

    }


    public String formatoSTR(String fechita) {
      String fecha=fechita.replace('/', ',');         
      return fecha;
    }
    
    
    public static double redondearDoubleADosDecimales(double numero){
       return Math.rint(numero*100)/100;
    }

    
    public static String cambiarFechaAFormatoLocal(Date fecha){
        
        Locale locale = new Locale("es", "AR"); //Formatea la fecha para AR
        SimpleDateFormat formatter;
        
        formatter = new SimpleDateFormat("EEEE,dd 'de' MMM 'del' yyyy", locale);
        String output = formatter.format(fecha);
        return output;
    }
    
}

