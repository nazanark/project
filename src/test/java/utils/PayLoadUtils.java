package utils;

public class PayLoadUtils {

    public static String getNewUser() {
        return "{\n" +
                "    \"name\": \"Hailey\",\n" +
                "    \"gender\": \"Female\",\n" +
                "    \"email\": \"hailey@gmail.com\",\n" +
                "    \"status\": \"Active\"\n" +
                "}";
    }


    public static String getSecondUser() {
        return "{\n" +
                "    \"name\": \"Nargiza\",\n" +
                "    \"gender\": \"Female\",\n" +
                "    \"email\": \"nargiza@gmail.com\",\n" +
                "    \"status\": \"Active\"\n" +
                "}";
    }

    public static String putFirstUser() {
        return "{\n" +
                "    \"name\": \"Ilker\",\n" +
                "    \"gender\": \"Male\",\n" +
                "    \"email\": \"ilker@gmail.com\",\n" +
                "    \"status\": \"inactive\"\n" +
                "}";
    }


    public static String postMessage(int id){
        return "{\n" +
                "    \"title\": \"Subito oceradulescens quia conforto aedificium creo odio infit tracto solio contigout.\",\n" +
                "    \n" +
                "    \"body\": \"Tibi aurum sol. Dolores canisconsequuntur. Usus at crastinus. Comptus vociferor quia. " +
                "Credo cruentus absque.Cursim quis vel. Mollitia solutio texo. Antiquus valde testimonium." +
                " Vescoadiuvo thesis. Pel decretum cultellus. Admoneo amor video. Demoror autemaperio." +
                " Varius aut deorsum. Demitto calcar addo. Cursus vae absconditus. Maximeamaritudo tempora.\"\n" +
                "\n" +
                "}";
    }
}
