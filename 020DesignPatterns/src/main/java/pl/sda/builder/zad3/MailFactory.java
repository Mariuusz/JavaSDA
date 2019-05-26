package pl.sda.builder.zad3;

import java.util.Date;

public abstract class MailFactory {

    public static Mail createNotificationEmail(String oferta){
        return new Mail.Builder().setCzySzyfr(false)
                .setDataNadania(new Date())
                .setNadawca("no-reply@zdrowysklep.pl")
                .setIsSpam(false)
                .setTresc("Witaj w zdrowym sklepie! Mamy dla Ciebie nową promocję: " + oferta)
                .createMail();
    }

    public static Mail createWarningMail(String about){
        return new Mail.Builder().setCzySzyfr(true)
                .setDataNadania(new Date())
                .setNadawca("no-reply-warn@zdrowysklep.pl")
                .setIsSpam(false)
                .setTresc("Uwaga! Chcemy Cię ostrzec o: " + about)
                .createMail();
    }
}